package day6;

public class ArrayDemo5 {
	
	public static void main(String[] args) {
		String[] names = {"홍길동", "김유신", "이순신", "류관순", "강감찬", "윤봉길"};
		int[] korScores = {60, 30, 60, 50, 80, 70};
		int[] engScores = {60, 80, 50, 80, 100, 60};
		int[] mathScores = {60, 40, 30, 70, 90, 60};
		
		// 시험성적이 1등인 학생의 이름, 국어, 영어, 수학, 총점, 평균을 출력하기
		int maxTotalScore = 0;
		int topScoreIndex = -1;
		
		for (int index = 0; index < names.length; index++) {
		 int kor = korScores[index];
		 int eng = engScores[index];
		 int math = mathScores[index];
		 
		 int totalScore = kor + eng + math;
		 if (totalScore > maxTotalScore) {
			 maxTotalScore = totalScore;    // 더 높은 사람의 값으로 바꿔서 저장
			 topScoreIndex = index;
		 }
		}
		
		String name = names[topScoreIndex];
		int kor = korScores[topScoreIndex];
		int eng = engScores[topScoreIndex];
		int math = mathScores[topScoreIndex];
		int totalScore = kor + eng + math;
		int average = totalScore/3;
		
		System.out.println("이름: " + name);
		System.out.println("국어: " + kor);
		System.out.println("수학: " + math);
		System.out.println("영어: " + eng);
		System.out.println("총점: " + totalScore);
		System.out.println("평균: " + average);
		
	}

}
