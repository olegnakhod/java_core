package academy.lgs.exercice_02;

public class Phone {
	
	
	private String phoneModel;
	private int price;
	private String phoneNumber;
	
	Phone(String phoneModel, int price ){
		this.phoneModel = phoneModel;
		this.price = price;
	}
	
	Phone(String phoneModel, int price, String phoneNumber){
		this(phoneModel,price);
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Phone [phoneModel=" + phoneModel + ", price=" + price + ", phoneNumber=" + phoneNumber + "]";
	}
}
