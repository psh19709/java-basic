package day5;

public class StringDemo {
	
	public static void main(String[] args) {
		/*
		 *  문자열의 정의 방식에 따른 비교값의 차이 확인하기
		 */
		
		String str1 = "안녕하세요";
		String str2 = "안녕하세요";
		String str3 = new String ("안녕하세요");
		String str4 = new String ("안녕하세요");
		
		// == 연산자는 참조변수에 대해서 변수의 주소값을 비교한다.
		System.out.println(str1 == str2);  //true str1과 str2는 같은 주소값을 가지고 있다.
		System.out.println(str3 == str4);  //false str3과 str4는 서로 다른 주소값을 가지고 있다.
		System.out.println(str3 == str1);  //false str1과 str3은 서로 다른 주소값을 가지고 있다.
		System.out.println(str2 == str4);  //false str2와 str4는 서로 다른 주소값을 가지고 있다.
		
		// String객체의 equals(other) 메소드는 참조변수가 참조하는 String 객체가 포함하고 있는 문자열의 내용을 비교한다.
		System.out.println(str1.equals(str2));  //true  str1과 str2는 내용이 동일한 문자열을 포함하고 있다.
		System.out.println(str3.equals(str4));  //true  str3과 str4는 내용이 동일한 문자열을 포함하고 있다.
		System.out.println(str1.equals(str3));  //true  str1과 str3는 내용이 동일한 문자열을 포함하고 있다.
		System.out.println(str2.equals(str4));  //true  str2과 str4는 내용이 동일한 문자열을 포함하고 있다.
		
		
	}

}
