package youtubeEgitim;

public class CustomerManager {
	
	private Customer customer;
	private ICreditManager creditManager;
	public CustomerManager(Customer customer, ICreditManager creditManager) {
		
		this.customer = customer;
		this.creditManager = creditManager;
	}
	
	
	
	
	public void Save() {
		System.out.println("Müşteri kaydedildi" );
	}

	
	public void giveCredit() {
		creditManager.Calculate();
		System.out.println("Kredi Verildi");
	}
	
}
