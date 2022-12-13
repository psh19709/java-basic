package myex;

public class Person {
	int age;
	String name;
	boolean gaged;
	int chidredNum;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isGaged() {
		return gaged;
	}
	public void setGaged(boolean gaged) {
		this.gaged = gaged;
	}
	public int getChidredNum() {
		return chidredNum;
	}
	public void setChidredNum(int chidredNum) {
		this.chidredNum = chidredNum;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", gaged=" + gaged + ", chidredNum=" + chidredNum + "]";
	}

	
}
