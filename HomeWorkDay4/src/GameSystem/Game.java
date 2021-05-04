package GameSystem;

public class Game {
private int ›d;
private String name;
private String detail;
private double price;
private double discount;
private double discountedPrice;
public Game(int id, String name, String detail, double price, double discount) {
	super();
	›d = id;
	this.name = name;
	this.detail = detail;
	price = price;
	this.discount = discount;
}
public int get›d() {
	return ›d;
}
public void set›d(int id) {
	›d = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDetail() {
	return detail;
}
public void setDetail(String detail) {
	this.detail = detail;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	price = price;
}
public double getDiscount() {
	return discount;
}
public void setDiscount(double discount) {
	this.discount = discount;
}
public double getDiscountedPrice() {
	return price- (price *(discount/100));
}
                    
}
