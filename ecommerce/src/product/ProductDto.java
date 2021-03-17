package product;

public class ProductDto 
{
	private long productid;
	private String catid,subcatid,uname,title;
	private double price;
	private String description,picture1,picture2,status;
	public ProductDto() {
		super();
	}
	
	public ProductDto(long productid, String catid, String subcatid, String uname, String title, double price,
			String description, String picture1, String picture2, String status) {
		super();
		this.productid = productid;
		this.catid = catid;
		this.subcatid = subcatid;
		this.uname = uname;
		this.title = title;
		this.price = price;
		this.description = description;
		this.picture1 = picture1;
		this.picture2 = picture2;
		this.status = status;
	}

	public long getProductid() {
		return productid;
	}
	public void setProductid(long productid) {
		this.productid = productid;
	}
	public String getCatid() {
		return catid;
	}
	public void setCatid(String catid) {
		this.catid = catid;
	}
	public String getSubcatid() {
		return subcatid;
	}
	public void setSubcatid(String subcatid) {
		this.subcatid = subcatid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPicture1() {
		return picture1;
	}
	public void setPicture1(String picture1) {
		this.picture1 = picture1;
	}
	public String getPicture2() {
		return picture2;
	}
	public void setPicture2(String picture2) {
		this.picture2 = picture2;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
