package chap02;

import java.util.Scanner;

// 확인 문제 : 시력 분포를 그래프로 출력하도록(*)을 이용하여 수정하여 프로그램 작성
class PhysicalExaminationEx {
	
	// 상수 선언 : 시력 분포(0.0 ~ 0.1 단위로 21개)
	static final int VMAX = 21;
	
	/** 신체 데이터를 담은 중첩 클래스 **/
	static class PhyscData {
		// Field
		String name; 	// 이름
		int height;		// 키
		double vision;	// 시력
		// Consturctor
		PhyscData(String name, int height, double vision){
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}
	
	/** 키의 평균값을 구하는 메서드 **/
	static double aveHeight(PhyscData[] dat) {
		// 키의 합계를 담을 변수 선언
		double sum = 0;
		
		// dat의 요솟값을 모두 더하는 반복문
		for (int i=0; i<dat.length; i++) 
			sum += dat[i].height;
		
		// 배열의 길이로 나눈 값 리턴
		return sum / dat.length;
	}
	
	/** 시력 분포를 구하는 메서드 **/
	static void distVision(PhyscData[] dat, int[] dist) { // 신체데이터 배열(dat)과 시력분포도 배열(dist) 매개변수로 받음
		int i = 0;
		dist[i] = 0;
		
		for(i=0; i<dat.length; i++)
			// dat[i].vision의 값이 0.0 이상 2.1 미만인지 확인
			if(dat[i].vision >= 0.0 && dat[i].vision < VMAX / 10.0)
				// 여기서 시력 분포를 저장하는 dist[]의 인덱스는 시력 값의 10배를 의미
				// 1.2 분포 -> [12] 로 설정 후 후위연산자(++)를 통해 1.2 시력인 사람 수 1 증가
				dist[(int)(dat[i].vision * 10)]++;
	}
	
	/** 실행 메서드 **/
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		// aveHeight() / distVision()의 인수로 대입될 PhyscData 타입 배열 선언
		PhyscData[] x = {
				new PhyscData("강민하", 162, 0.3),
				new PhyscData("김찬우", 173, 0.7),
				new PhyscData("박준서", 175, 2.0),
				new PhyscData("유서범", 171, 1.5),
				new PhyscData("이수연", 168, 0.4),
				new PhyscData("장경오", 174, 1.2),
				new PhyscData("황지안", 169, 0.8),
		};
		// distVision()의 인수로 대입될 VMAX 상수 크기의 배열 생성
		int[] vdist = new int[VMAX];
		
		System.out.println("■ 신체 검사 리스트 ■");
		System.out.println("이름      키    시력");
		System.out.println("---------------------");
		
		for(int i=0; i<x.length; i++)
			System.out.printf("%-8s%3d%5.1f\n",x[i].name, x[i].height, x[i].vision);
		
		// aveHeight() 호출하여 평균 키 리턴 받음
		System.out.printf("\n평균 키 : %5.1fcm\n", aveHeight(x));
		
		// 시력 분포 구하기 : vdist 배열을 인수로 대입해 distVision() 호출
		distVision(x, vdist);
		
		// 해당 부분 수정
		System.out.println("\n시력 분포");
		for(int i=0; i<VMAX; i++) {
			System.out.printf("%3.1f~: ", i / 10.0);
			for(int j=0; j<vdist[i]; j++)
				System.out.println('*');
			System.out.println();
		}
	}
}