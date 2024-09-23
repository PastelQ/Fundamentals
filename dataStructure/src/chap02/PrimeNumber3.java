package chap02;

/** 1,000 이하의 소수를 나열(버전 3) **/
class PrimeNumber3 {

	public static void main(String[] args) {
		
		int counter = 0;			// 곱셈과 나눗셈의 횟수를 저장할 변수
		int ptr = 0;				// 찾은 소수의 개수
		int[] prime = new int[500]; // 소수를 저장하는 배열
		
		prime[ptr++] = 2;	// 2는 소수
		prime[ptr++] = 3;	// 3은 소수
		
		// 조사 대상은 소수를 찾기 때문에 홀수만
		for(int n=5; n<=1000; n+=2) {
			boolean flag = false;
			
			for(int i=1; prime[i] * prime[i] <=n; i++) {
				counter += 2;
				// 나누어 떨어질 경우 소수가 아님
				if (n%prime[i] == 0) {
					flag = true;
					break;
				}
			}
			// 마지막까지 나누어 떨어지지 않으면 소수로 배열에 저장
			if (!flag) {
				prime[ptr++] = n;
				counter++;
			}
		}
		// 찾은 ptr개의 소수를 출력
		for(int i=0; i<ptr; i++) {
			System.out.println(prime[i]);
		}
		
		System.out.println("곱셈과 나눗셈을 수행한 횟수 : " + counter);
	}
}