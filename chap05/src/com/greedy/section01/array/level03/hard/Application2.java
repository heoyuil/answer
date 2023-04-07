package com.greedy.section01.array.level03.hard;

public class Application2 {

	public static void main(String[] args) {
		
		/* 로또번호 생성기 
		 * 6칸 짜리 정수 배열을 하나 생성하고
		 * 1부터 45까지의 중복되지 않는 난수를 발생시켜 각 인덱스에 대입한 뒤
		 * 오름차순 정렬하여 출력하세요
		 * */
		int[] iarr = new int[6];
		int cnt = 1;
		iarr[0] = (int)(Math.random()*45)+1;
		while(cnt<6) {
		iarr[cnt] = (int)(Math.random()*45)+1;
		for(int i = 0 ; i < cnt;i++) {
			if(iarr[i]==iarr[cnt]) {
				cnt--;
			}
		}
		cnt++;
		
		}
		int tmp;
		for(int i = 0 ; i < iarr.length-1;i++) {
			for(int j = i+1;j<iarr.length;j++) {
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
