package myex.person;

public class PersonApp {
	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person();
		
		person1.name = "김유신";
		person1.height = 180.3F;
		person1.weight = 85.5F;
		
		person2.name = "이재원";
		person2.height = 170.2F;
		person2.weight = 103.2F;
		
		System.out.println("이름 : " + person1.name);
		System.out.println("키: " + person1.height);
		System.out.println("몸무게: " + person1.weight);
		System.out.println();
		
		System.out.println("이름: " + person2.name);
		System.out.println("키: " + person2.height);
		System.out.println("몸무게: " + person2.weight);
		
	}

}
