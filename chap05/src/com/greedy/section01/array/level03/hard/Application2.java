package com.greedy.section01.array.level03.hard;

public class Application2 {

	public static void main(String[] args) {
		
		/* 로또번호 생성기 
		 * 6칸 짜리 정수 배열을 하나 생성하고
		 * 1부터 45까지의 중복되지 않는 난수를 발생시켜 각 인덱스에 대입한 뒤
		 * 오름차순 정렬하여 출력하세요
		 * */
		int[] iarr = new int[6];
		int cnt = 1;				// 현재 몇번째 로또인지 확인용
		int tmp;					// 로또 정렬하기 위해 선언한 변수
		iarr[0] = (int)(Math.random()*45)+1;
		
		while(cnt<6) {
		iarr[cnt] = (int)(Math.random()*45)+1;
		
		for(int i = 0 ; i < cnt;i++) {
			
			if(iarr[i]==iarr[cnt]) {// 현재 로또랑 그전까지 로또 중복있는지 확인용
				cnt--;	// 중복있을시 일단 이번로또를 --뺀후 다시 ++시켜서 중복되었던 로또 다시 진행
				break;
				}
			}
		cnt++;
		}
		
		for(int i = 0 ; i < iarr.length-1;i++) {	//로또 오름차순 정렬		
			for(int j = i + 1;j<iarr.length;j++) {
				if(iarr[i]>iarr[j]) {
					tmp = iarr[i];
					iarr[i] = iarr[j];
					iarr[j] = tmp;
				}
			}
		}
		
		for(int i : iarr) {
			System.out.print(i + " ");
		}

	}
}
