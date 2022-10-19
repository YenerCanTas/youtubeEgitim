package youtubeEgitim;

public class Main {

	public static void main(String[] args) {
		
		
		
		/*int [] sayilar1 = {1,2,3};
		int [] sayilar2 =  {15,20,30};
		
		
		sayilar1 = sayilar2;
		sayilar2[0] = 1000;
		
		System.out.println(sayilar1[0]);
		
		
		CreditManager creditManager = new CreditManager();
		
		creditManager.Calculate(); */
		
		
		//IoC Container
		CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
		customerManager.giveCredit();
		
		Customer customer = new Customer(); // örneğini oluşturmak, instance oluşturmak, instance creation
		customer.ıd = 1;
		
		
		
		Company company = new Company();
		company.taxtNumber = "10000";
		company.ıd = 100;
		
		/*CustomerManager customManager2 = new CustomerManager(new Company());
		
		
		
		CustomerManager customerManager = new CustomerManager(customer);
		customerManager.Save();
		customerManager.Save();
		customerManager.Save();
		
		//Company company = new Company();
		company.taxNumber = "1000";
		
		Person person = new Person();
		person.nationalIdentify = "";*/
		
		
	}

}
