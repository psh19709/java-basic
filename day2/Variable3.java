package day2;

public class Variable3 {
	
	public static void main(String[] args) {
		
		// 변수의 사용
		// 국어점수, 영어점수, 수학점수에 대한 총점, 평균을 출력하기
		// 정수형     정수형    정수형      정수형  실수형
		int korScore = 90;
		int engScore = 60;
		int mathScore = 80;
		int totalScore = korScore + engScore + mathScore;
		double scoreAverage = totalScore/3.0;
		
		System.out.println(totalScore);
		System.out.println(scoreAverage);
		
		// 실수값의 계산
		double x = 0.1;
		double y = 0.2;
		double z = (x*10 + y*10)/10;
		System.out.println(z);
		
	}

}
