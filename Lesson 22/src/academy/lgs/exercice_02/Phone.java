package academy.lgs.exercice_02;

public class Phone{
	
	
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
		System.out.println("Модель телефону: " + phoneModel + "\nЦіна: " + price +  "\nНомер телефону: " + phoneNumber); 
	}

	public String getPhoneModel() {
		return phoneModel;
	}

	public void setPhoneModel(String phoneModel) {
		this.phoneModel = phoneModel;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Phone [phoneModel=" + phoneModel + ", price=" + price + ", phoneNumber=" + phoneNumber + "]";
	}

}


