package product;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import db.DatabaseManager;
import member.MemberForm;

public class ProductBo
{
	private ServletContext context;

	
	public ServletContext getContext()
	{
			return context;
	}

	public void setContext(ServletContext context)
	{
			this.context = context;
	}
	public String insert(HttpServletRequest request) 
	{
		ProductForm pform=uploadImageReturnForm(request);
		ProductDto pdto=formToDto(pform);
		Connection connection=getConnection();
		ProductDao pdao=new ProductDaoImpl(connection);
		String result=pdao.insert(pdto);
		
		return result;
	}
	public ProductForm uploadImageReturnForm(HttpServletRequest request)
	{
		ProductForm pform=new ProductForm();
		//this function is going to parse the request object to get all the fields..  
		//create a ProductForm type of object and return it
		//as well as upload the image to the desired location
		
		// Create a factory for disk-based file items
		DiskFileItemFactory factory = new DiskFileItemFactory();

		

		// Create a new file upload handler
		ServletFileUpload upload = new ServletFileUpload(factory);

		// Parse the request
		try 
		{
			List<FileItem> items = upload.parseRequest(request);
			for(FileItem fItem:items)
			{
				if(fItem.isFormField())
				{
					//its a text field
					String name=fItem.getFieldName();
					String value=fItem.getString();
					
					if(name.equals("catid"))
					{
						pform.setCatid(value);
						
						
					}
					
					if(name.equals("subcatid"))
						
					{
						pform.setSubcatid(value);
						
					}
					if(name.equals("title"))
					{
						pform.setTitle(value);
					}
					
					if(name.equals("price"))
					{
						pform.setPrice(value);
					}
					if(name.equals("description"))
					{
						pform.setDescription(value);
					}
					
				}
				
				
				else
				{
					//its an image
					String fieldName=fItem.getFieldName();
					String fileName=fItem.getName();
					if(fieldName.equals("picture1"))
					{
						pform.setPicture1(fileName);
					}
					if(fieldName.equals("picture2"))
					{
						pform.setPicture2(fileName);
					}
					//upload the image to the desired location
				}
			}
		} 
		catch (FileUploadException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return pform;
	}
	public ProductDto formToDto(ProductForm pform)
	{
		ProductDto pdto=new ProductDto(1, pform.getCatid(), pform.getSubcatid(), "ahsan", pform.getTitle(), Double.parseDouble(pform.getPrice()), pform.getDescription(), 
				pform.getPicture1(), pform.getPicture2(), "yes");
		return pdto;
	}
	public Connection getConnection()
	{
		String dburl=(String)context.getAttribute("dburl");
		String dbuname=(String)context.getAttribute("dbuname");
		String dbpassword=(String)context.getAttribute("dbpassword");
		
		Connection con=DatabaseManager.getConnection(dburl, dbuname, dbpassword);
		
		return con;
		
	}
	public ArrayList<ProductDto> searchByKey(String searchKey)
	{
		ProductDao pdao=new ProductDaoImpl(getConnection());
		ArrayList<ProductDto> ar=pdao.searchByKey(searchKey);
		return ar;
	}
}
