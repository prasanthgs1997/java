package hib;

import javax.persistence.Entity;
import javax.persistence.Id;
 @Entity
public class Details {
	@Id
 private Integer id;
private String pro_name;
private Integer quantity;
private Integer no_of_products;
private String dealer;
private double price;
private double total;
public double getTotal() {
	return total;
}
public void setTotal(double total) {
	this.total = total;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getPro_name() {
	return pro_name;
}
public void setPro_name(String pro_name) {
	this.pro_name = pro_name;
}

public Integer getNo_of_products() {
	return no_of_products;
}
public void setNo_of_products(Integer no_of_products) {
	this.no_of_products = no_of_products;
}
public String getDealer() {
	return dealer;
}
public void setDealer(String dealer) {
	this.dealer = dealer;
}
public Integer getQuantity()
{
     return quantity;	
}
public void setQuantity(Integer p) {
	// ODO Auto-generated method stub
	this.quantity=p;

}
}
