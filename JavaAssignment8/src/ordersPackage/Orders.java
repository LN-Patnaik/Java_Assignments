package ordersPackage;


public class Orders {
 int price;
String status;
public Orders(int price, String status) {
	super();
	this.price = price;
	this.status = status;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
@Override
public String toString() {
	return "Orders [price=" + price + ", status=" + status + "]";
} 




}
