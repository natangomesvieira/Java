package entities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities_enums.OrderStatus;

public class Order extends Client{
	private Date moment = new Date();
	private OrderStatus status;
	private List<OrderItem> items = new ArrayList<>();
	
	public String getMoment() {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		return dateFormat.format(moment);
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus( OrderStatus status ) {
		this.status = status;
	}
	public void getItems() {
		for( OrderItem item : items ) {
			System.out.println(item.getName() + ", " + "$" + item.getPrice() + "0, Quantity: " + item.getQuantity() + ", Subtotal: $" + item.getSubTotal() + "0");
		}
	}
	public void readItems( int quantity ) {
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i<quantity; i++ ) {
			OrderItem oi = new OrderItem();
			System.out.println("Product name:");
			oi.setName( scan.nextLine() );
			System.out.println("Product price:");
			Double price = Double.parseDouble(scan.nextLine());
			oi.setPrice(price);
			System.out.println("Quantity:");
			Integer quanti = Integer.parseInt(scan.nextLine());
			oi.setQuantity( quanti );			addItem( oi );
		}
		
		scan.close();
	}
	public void addItem( OrderItem item ) {
		items.add( item );
	}
	public void removeItem( OrderItem item ) {
		items.remove( item );
	}
	public double getTotal() {
		double value = 0;
		for(OrderItem item : items) {
			value += item.getSubTotal();
		}
		return value;
	}
}
