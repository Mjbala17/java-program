package day2;

public class Employee {


		int Id;
		String Username;
		String City;
		public int getId() {
			return Id;
		}
		public void setId(int id) {
			Id = id;
		}
		public String getUsername() {
			return Username;
		}
		public void setUsername(String username) {
			Username = username;
		}
		public String getCity() {
			return City;
		}
		public void setCity(String city) {
			City = city;
		}
		@Override
		public String toString() {
			return "Employee [Id=" + Id + ", Username=" + Username + ", City=" + City + "]";
		}
		
		
	
}