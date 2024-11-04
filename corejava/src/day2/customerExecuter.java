package day2;

public class customerExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		Customer c3 = new Customer();
		Customer c4 = new Customer();
		Customer c5 = new Customer();
		
		c1.setCid(4004);
		c1.setCname("bala");
		c1.setAddress("2c,murugan st ,chidambaram");
		c1.setCity("cuddlore");
		
		c2.setCid(4005);
		c2.setCname("Arjun Kumar");
		c2.setAddress("25, Gandhi Road, Adyar");
		c2.setCity("chennai");
		
		c3.setCid(4006);
		c3.setCname("Meena Ramesh");
		c3.setAddress("32, Lake View Street, Anna Nagar");
		c3.setCity("Madura");
		
		c4.setCid(4007);
		c4.setCname("Vijay Subramani");
		c4.setAddress("Vijay Subramani");
		c4.setCity("Coimbatore");
		
		c5.setCid(4017);
		c5.setCname("Kiran Raj");
		c5.setAddress("Kiran Raj");
		c5.setCity("Kiran Raj");
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
	}
}

