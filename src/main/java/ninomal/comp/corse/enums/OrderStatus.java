package ninomal.comp.corse.enums;

public enum OrderStatus {
	WAITING(1),
	SHIPEDE(2),
	DELIVIRED(3),
	WAITING_PAYMENT(4),
	CANCELED(5);
	
	private int code;
	
	
	private OrderStatus(int code) {
		this.code = code;
	}


	public int getCode(){
		 return code;
	}
	
	public static OrderStatus valeuOf(int code) {
		for (OrderStatus list : OrderStatus.values() ) {
			if (code == list.getCode()){
				return list;
			}
		}
		throw new IllegalArgumentException("Value invalid");
	}
	
	
}
