package myself.thisEx;

public class Person {
	String name;
	int age;
	
	Person(){
		this("이름없음", 1);
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	Person returnItSelf() {
		return this;
	}
}
