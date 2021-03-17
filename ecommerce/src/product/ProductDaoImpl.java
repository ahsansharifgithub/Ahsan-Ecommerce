package product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.cj.protocol.Resultset;

import db.DatabaseManager;

public class ProductDaoImpl implements ProductDao
{
	private Connection connection;
	
	public ProductDaoImpl() {
		super();
	}

	public ProductDaoImpl(Connection connection) {
		super();
		this.connection = connection;
	}

	@Override
	public String insert(ProductDto pdto)
	{
		String result="Data entered successfully";
		String sql="insert into product(catid,subcatid,uname,title,price,description,picture1,picture2,status) values(?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps=DatabaseManager.getPreparedStatement(connection, sql);
		try {
			ps.setString(1, pdto.getCatid());
			
			ps.setString(2, pdto.getSubcatid());
			ps.setString(3, pdto.getUname());
			ps.setString(4, pdto.getTitle());
			ps.setDouble(5, pdto.getPrice());
			ps.setString(6, pdto.getDescription());
			ps.setString(7,pdto.getPicture1());
			ps.setString(8,pdto.getPicture2());
			ps.setString(9, pdto.getStatus());
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result="Data not entered successfully";
		}
		return result;
	}

	@Override
	public ArrayList<ProductDto> searchByKey(String searchKey) 
	{
		ArrayList<ProductDto> ar=new ArrayList<ProductDto>();
		String sql="select * from product where description like'%"+searchKey+"%'";
		PreparedStatement ps=DatabaseManager.getPreparedStatement(connection, sql);
		try {
			ResultSet rs= ps.executeQuery();
			while(rs.next())
			{
				ProductDto pdto=new ProductDto(rs.getLong("productid"), rs.getString("catid"), rs.getString("subcatid"), rs.getString("uname"), rs.getString("title"), rs.getDouble("price"), rs.getString("description"), rs.getString("picture1"), rs.getString("picture2"), rs.getString("status"));
				ar.add(pdto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ar;
	}
	
}
