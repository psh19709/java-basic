package myex;

import utils.KeyboardReader;

public class ForExample2 {
		
		// 향상된 for문
	public static void main(String[] args) {
		String[] names = {"박지우", "김유신", "이순신", "아리영"};
		int[] korScores = {99, 100, 40, 30};
		int[] engScores = {100, 55, 70, 90};
		int[] mathScores = {70, 90, 100, 85};
		
		KeyboardReader keyboard = new KeyboardReader();
		System.out.print("이름을 입력하세요.: ");
		String value = keyboard.getString();
		
		int size = names.length;
		boolean isExist = false;
		int saveIndex = -1;
		
		for(int index = 0; index < size; index++) {
			String name = names[index];
			if(name.equals(value)) {
				isExist = true;
				saveIndex = index;
				break;
			}
		}
		
		if(isExist) {
			System.out.println("학생정보가 존재합니다.");
			String name = names[saveIndex];
			int kor = korScores[saveIndex];
			int eng = engScores[saveIndex];
			int math = mathScores[saveIndex];
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
