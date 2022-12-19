package system;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import entities.Order;
import entities_enums.OrderStatus;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Order order = new Order();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Name:");
		order.setName(scan.nextLine());
		System.out.println("Email:");
		order.setEmail(scan.nextLine());
		System.out.println("BirthDate (dd/mm/yyy):");
		String dateStr = scan.nextLine();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		order.setBirthDate(formatter.parse( dateStr )); 
		
		System.out.println("Status:");
		String status = scan.nextLine();
		order.setStatus(OrderStatus.parse(status));
		
		System.out.println("Ho many items to this order?");
		int quantity = scan.nextInt();
		order.readItems(quantity);
		
		System.out.println("ORDER SUMARY:");
		System.out.println("Order moment: " + order.getMoment());
		System.out.println("Order status: " + order.getStatus());
		System.out.println("Client: " + order.getName() + " ( " + order.getBirthDate() + " ) " + "- " + order.getEmail());
		
		System.out.println("Order items:");
		order.getItems();
		
		System.out.println("Total price: $" + order.getTotal() + "0");
		
		scan.close();
	}

}
