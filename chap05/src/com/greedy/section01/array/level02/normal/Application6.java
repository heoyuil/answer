package com.greedy.section01.array.level02.normal;

public class Application6 {

	public static void main(String[] args) {
		
		/* 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		 * 1 ~ 10 사이의 난수를 발생시켜 배열에 초기화 후
		 * 배열 전체 값과 그 값 중에서 최대값과 최소값을 찾아서 출력하세요.
		 * 
		 * =========== 출력 ============
		 * 2 10 5 2 3 7 3 7 9 7
		 * 최대값 : 10
		 * 최소값 : 2
		 * */
		int[] iarr = new int[10];
		int max = 1;				//max를 1로 하는 이유는 최대값을 찾기 위해 배열값가 비교를 해줘야 해서 범위에서 제일 낮은 수로 해줌
		int min= 10;				//min를 10로 하는 이유는 최소값을 찾기 위해 배열값가 비교를 해줘야 해서 범위에서 제일 높은 수로 해줌
		
		for(int i = 0 ; i < iarr.length;i++) {
			iarr[i] = (int)(Math.random()*10)+1;	//1~10까지의 난수 생성후 배열에 넣어줌
			System.out.print(iarr[i] + " ");
		}
		System.out.println();
		
		for(int i = 0 ; i < iarr.length;i++) {
			max = max>iarr[i]?max:iarr[i];			// max가 배열값보다 크면 max 작으면 배열값을 넣어줌
			min = min<iarr[i]?min:iarr[i];			// min가 배열값보다 작으면 min 크면 배열값을 넣어줌
		}
		
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		
	}
}
