package chap05_referenceType.sec02_array.finalTest;

import java.util.Scanner;

// 학생 수, 각 학생들의 점수를 입력 받아서 최고 점수 및 평균 점수를 구하는 프로그램
public class StudentScoresProgram {

	public static void main(String[] args) {
	
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner stdIn = new Scanner(System.in);
		
		while(run) {
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			
			int selectNo = stdIn.nextInt();
			
			switch(selectNo) {
			
				case 1 : // 사용자에게 학생 수 입력 받기(배열의 길이)
					System.out.println("학생 수 입력 : ");
					studentNum = stdIn.nextInt();
					scores = new int[studentNum];
					continue;
					
				case 2 : // 사용자에게 점수 입력 받기
					System.out.println("점수입력");
					for(int i=0; i<studentNum; i++) {
					System.out.println("학생[" + i + "] : ");
					scores[i] = stdIn.nextInt();
					}
					System.out.println("입력 완료!");
					continue;
					
				case 3 : // 점수 리스트 출력 (for문 이용)
					System.out.println("점수 리스트를 출력합니다.");
					for(int i=0; i<studentNum; i++) {
						System.out.println("scores[" + i + "] : " + scores[i]);
					}
					continue;
					
				case 4 : // 분석 : 합계, 평균 보여주기
					int sum = 0;		// 점수 합계
					double avg = 0.0;	// 점수 평균
					// 합계 계산
					for(int i=0; i<studentNum; i++) {
						sum += scores[i];
					}
					// 평균 계산
					avg = (double)sum/studentNum;
					System.out.println("점수 합계 : " + sum);
					System.out.println("점수 평균 : " + avg);
					continue;
					
				case 5 : // 시스템 종료
					run = false;
					System.out.println("종료합니다");
			}
		}
	}
}