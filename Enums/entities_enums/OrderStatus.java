package entities_enums;

public enum OrderStatus {
	
	PENDING_PAYMENT, PROCESSING, SHIPPED, DELIVERED;

	public static OrderStatus parse( String status ) {
		for( OrderStatus os : OrderStatus.values() ) {
			if( status.equalsIgnoreCase( os.name() ) ) {
				return os;
			}
		}
		return null;
	}
}
