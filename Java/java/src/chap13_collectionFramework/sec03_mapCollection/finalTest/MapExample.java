package chap13_collectionFramework.sec03_mapCollection.finalTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* 확인 문제 : HahsMap (Map)
 - HashMap에 String(ID), Integer(점수)가 저장되어 있을 때
  평균점수 출력 및 최고 점수, 최고 점수를 받은 아이디 출력 */
public class MapExample {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;  // 최고 점수를 받은 아이디 저장
		int maxScore = 0; 	 // 최고 점수 저장
		int totalScore = 0;  // 점수 합계 저장
		
		Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
		
		for(Map.Entry<String, Integer> entry : entrySet) {
			// 최댓값 구하기
			if(entry.getValue() > maxScore) {
				// 최고 점수 아이디 저장
				name = entry.getKey();
				// 최고 점수 저장
				maxScore = entry.getValue();
			}
			// 총합 구하기
			totalScore += entry.getValue();
		}
		// 평균 점수 구하기
		int avgScore = totalScore / map.size();
		System.out.println("평균 점수 : " + avgScore);
		
		System.out.println("최고 점수 : " + maxScore);
		
		System.out.println("최고 점수를 받은 아이디 : " + name);
	}
}