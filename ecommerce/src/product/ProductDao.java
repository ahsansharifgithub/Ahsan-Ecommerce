package product;

import java.util.ArrayList;

public interface ProductDao 
{
	public String insert(ProductDto pdto);

	public ArrayList<ProductDto> searchByKey(String searchKey);
}
