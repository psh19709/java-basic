package day6;

import utils.KeyboardReader;

public class ArrayDemo2 {
	
	public static void main(String[] args) {
		String[] names = {"박지우", "김유신", "이순신", "류관순", "강감찬", "윤봉길"};
		int[] korScores = {95, 100, 60, 50, 80, 70};
		int[] engScores = {99, 80, 50, 80, 70, 60};
		int[] mathScores = {70, 70, 30, 70, 50, 60};
		
//		System.out.println("모든 학생의 성적 조회");
//		for (int index = 0; index < 6; index++) {
//		System.out.println("이름: " + names[index]);
//		System.out.println("국어: " + korScores[index]);
//		System.out.println("영어: " + engScores[index]);
//		System.out.println("수학: " + mathScores[index]);
//		System.out.println();
//		}
		
		//학생의 이름을 입력받아서 해당 학생의 성적정보를 출력하기
		// 출력되는 성적정보는 이름, 국어, 영어, 수학, 총점, 평균이다.
		// 입력받은 이름과 일치하는 학생의 정보가 없으면 "입력한 이름과 일치하는 성적정보가 없습니다"를 출력한다.
		
		KeyboardReader keyboard = new KeyboardReader();
		System.out.print("이름을 입력하세요: ");
		String value = keyboard.getString();
		
		int size = names.length;
		boolean isExist = false;    //입력한 이름과 일치하는 학생이 존재하는 여부를 저장하는 변수
		int savedIndex = -1;        //저장변수는 0부터 존재하기 때문에 절대로 나올수 없는 숫자인 -1를 넣는다
		for (int index = 0; index < size; index++) {
			String name = names[index];
			if(name.equals(value)) {   // 입력한 이름과 일치하는 학생이름이 존재하면 isExist와 savedIndex 변수에 값을 대입한다.
				isExist = true;
				savedIndex = index;
				break;                 // 입력한 이름과 일치하는 학생이름이 존재하면 반복문을 탈출한다.
			}
		}
		if(isExist) {
			System.out.println("학생 성적정보가 존재합니다.");
			String name = names[savedIndex];
			int kor = korScores[savedIndex];
			int eng = engScores[savedIndex];
			int math = mathScores[savedIndex];
			int total = kor + eng + math;
			int average = total/3;
			
			System.out.println("이름: " + name);
			System.out.println("국어: " + kor);
			System.out.println("수학: " + math);
			System.out.println("영어: " + eng);
			System.out.println("총점: " + total);
			System.out.println("평균: " + average);
		} else {
			System.out.println("입력한 이름과 일치하는 성적정보가 없습니다.");
		}
	}

}
