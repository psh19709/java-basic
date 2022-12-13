package day6;

public class ArrayDemo3 {
	
	public static void main(String[] args) {
		
		/*
		 *  Enhanced-for문
		 *       형식
		 *          자료형[] 배열변수명 = {값1, 값2, 값3, 값4};
		 *         for (자료형 변수형 : 배열변수명) {
		 *         수행문;
		 *         }
		 *         * 향상된 for문의 우항에는 배열객체나 콜렉션객체(값이나 객체를 여러 개 정하는 객체)를 참조하는 변수명이 위치한다.
		 *         * 향상된 for문의 우항에 지정된 배열/콜렉션에 저장된 요소(값 혹은 객체)의 처음부터 끝까지 순서대로 데이터를 꺼낸다.
		 *         * 향상된 for문은 우항에 지정된 배열/콜렉션에서 꺼낸 값을 좌항에 정의된 변수에 저장하고, 수행문을 실행한다.
		 *         * 향상된 for문을 사용하는 index를 사용하지 않고도 배열/콜렉션에 저장된 요소를 처음부터 끝까지 꺼낼 수 있다.
		 *         * 추출된 값이 변수에 자동으로 저장되기 때문에 수행문에서는 변수에 저장된 값을 읽어서 연산에 활용할 수 있다. 
		 */
		
		String[] names = {"홍길동", "김유신", "이순신", "류관순", "강감찬", "윤봉길"};
		int[] korScores = {100, 100, 60, 50, 80, 70};
		int[] engScores = {90, 80, 50, 80, 70, 60};
		int[] mathScores = {90, 70, 30, 70, 50, 60};
		
		// 각 과목별 평균점수 계산하기
		// 국어점수 평균계산하기
		int korTotalScore = 0;
		for(int index = 0; index < korScores.length; index++) {
			int score = korScores[index];
			korTotalScore += score;
		}
		int korAverage = korTotalScore/korScores.length;
		
		System.out.println("국어점수 총점: " + korTotalScore);
		System.out.println("국어점수 평균: " + korAverage);
		
		//영어점수 평균계산하기
		
		int engTotalScore = 0;
		for(int index = 0; index < engScores.length; index++) {
			int score = engScores[index];
			engTotalScore += score;
		}
		int engAverage = engTotalScore/engScores.length;
		
		System.out.println("영어 점수 총점: " + engTotalScore);
		System.out.println("영어 점수 평균: " + engAverage);
		
		//수학점수 평균계산하기
		int mathTotalScore = 0;
		for(int score : mathScores) {
		  mathTotalScore += score;
		}
		int mathAverage = mathTotalScore/mathScores.length;
		
		System.out.println("수학 점수 총점: " + mathTotalScore);
		System.out.println("수학 점수 평균: " + mathAverage);
		
		
		//모든 학생들의 이름 출력
		for (String name : names) {
			System.out.println(name); 
		}
	}

}
