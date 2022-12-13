package day4;

import utils.KeyboardReader;

public class IfDemo1 {
	
	public static void main(String[] args) {
		/*
		 * if문
		 *     형식
		 *       if (조건식) {
		 *             수행문1;
		 *             수행문2;
		 *             수행문3;
		 *        }
		 *        * 조건식이 true로 판정되면 블록내({})내부의 수행문들이 실행된다.     
		 *        * 조건식의 연산결과는 반드시 불린값이어야 한다.
		 *        * 조건식은 주로 비교 연산자, 논리 연산자를 사용하는 연산식이 사용된다.
		 */
		
		/*
		 * 국어점수, 영어점수, 수학점수를 입력받는다.
		 * 과목평균이 60점 이상이면 "합격입니다." 메세지를 화면에 출력한다.
		 * 
		 *  조건식 : 과목평균이 60점 이상일 때 true로 판정하는 조건
		 *  수행문 : "합격입니다"를 화면에 출력
		 */
		
		KeyboardReader keyboard = new KeyboardReader();
		
		System.out.print("국어점수 입력: ");
		int korScore = keyboard.getInt();
		System.out.print("영어점수 입력: ");
		int engScore = keyboard.getInt();
		System.out.print("수학점수 입력: ");
		int mathScore = keyboard.getInt();
		
		int totalScore = korScore + engScore + mathScore;
		double averageScore = totalScore/3.0; 
		
		if (averageScore >= 60) {
		      System.out.println("합격입니다");  //조건식이 true로 판정될 때만 수행되는 수행문
		}
		if (averageScore < 60) {
		      System.out.println("불합격입니다");
		}
	}

}
