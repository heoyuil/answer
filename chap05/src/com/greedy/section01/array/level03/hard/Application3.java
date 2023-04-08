package com.greedy.section01.array.level03.hard;

import java.util.Scanner;

public class Application3 {

	public static void main(String[] args) {

		/* 숫자 야구게임 만들기 
		 * 길이 4의 정수 배열을 만들고 각 인덱스에는 0 ~ 9까지의 중복되지 않는 난수를 저장한다.
		 * 4자리 숫자를 입력받아 스트라이크, 볼 등의 힌트를 주며 4자리 난수 숫자를 맞추는 게임이다.
		 * 숫자와 자리가 모두 맞는 경우 스트라이크, 숫자는 맞지만 자리는 맞지 않는 경우는 볼 이다.
		 * 예) 9183 으로 난수가 발생하면 9356 입력 시 1S 1B이다.
		 * 
		 * 단, 기회는 총 10번이며, 10번 이내에 맞추는 경우 "정답입니다." 출력 후 게임 종료
		 * 10번의 기회가 모두 소진 되면 "10번의 기회를 모두 소진하셨습니다. 프로그램을 종료합니다." 출력 후 종료
		 * 
		 * 또한 4자리의 정수를 입력하지 않은 경우에는 "4자리의 정수를 입력해야 합니다." 출력 후 입력을 다시 받을 수 있되
		 * 횟수는 차감하지 않는다.
		 * 
		 * -- 프로그램 예시 (난수 7416 의 경우) --
		 *
		 * 10회 남으셨습니다.
		 * 4자리 숫자를 입력하세요 : 1234
		 * 아쉽네요 0S 2B 입니다.
		 * 9회 남으셨습니다.
		 * 4자리 숫자를 입력하세요 : 5678
		 * 아쉽네요 0S 2B 입니다.
		 * 8회 남으셨습니다.
		 * 4자리 숫자를 입력하세요 : 7416
		 * 정답입니다.
		 * */
		
		int[] iarr = new int[4];	// 야구 게임할 난수
		int[] iarr2;				// 내가 입력할 수를 저장할 배열
		int cnt = 10;				// 야구게임 기회
		Scanner sc =new Scanner(System.in);
		
		for(int i = 0 ; i<iarr.length;i++) {	//난수 발생 및 중복방지후 생성
			iarr[i] = (int)(Math.random()*10);
			if(i!=0) {
				for(int j = 0; j<i;j++) {
					if(iarr[i]==iarr[j]) {
						i--;
						break;
					}
				}
			}
		}
		
		
		System.out.print("난수는 ");				//난수 생성되엇는지 확인용
		for(int i : iarr) {
			System.out.print(i);
		}
		System.out.println(" 이다");

		iarr2 = new int[4];
//		lable:
			while(cnt>0) {
				int st = 0;			//스트라이크
				int ba = 0;			//볼
				String str;         // 내가입력할 수릉 저장할 변수
				int cnt2 = 3;		// 정수형 배열에 저장하기위해 위해 사용할 변수
				int n;
				System.out.println(cnt+"회 남으셨습니다");
				System.out.print("4자리 숫자를 입력하세요 : ");
				str = sc.nextLine();	//수를 문자열로받음 이유는 정수로 받아보니 0725를 725로받아서 문자열로 받음
				
				if(str.length()!=4) {	//4자리가 아닐시 다시하기 위해
					System.out.println("4자리의 정수를 입력하셔야합니다");
					continue;
				}
				
				n = Integer.parseInt(str); // 문자열 정수형 변환
				
				while(cnt2>=0) {		   // 정수형 배열 뒤에서 부터 넣은이유는 0725를 int형으로 변환시 
					iarr2[cnt2--] = n%10;  // 725이고 앞에서넣으면 7부터 넣어서 뒤에서부터 넣으면 0을 넣을수 있다
					n = n/10;
				}
				
//				for(int i = 0;i<iarr2.length-1;i++) { //중복방지용으로 만듬
//					for(int j = i+1; j<iarr2.length;j++) {
//						if(iarr2[i]==iarr2[j]) {
//							System.out.println("숫자 중복 안됑");
//							continue lable;
//						}
//					}
//				}

				for(int i = 0; i <4;i++) {			//스트라이크 체크
					if(iarr[i] == iarr2[i]) {
						st++;
					}
				}

				if(st==4) {							//4스트라이크일시 종료
					System.out.println("정답입니다");
					break;
				}
				
				for(int i = 0;i<4;i++) {			//ball체크
					for(int j = 0; j <4;j++) {
						if(iarr[i] == iarr2[j]&&(iarr[i]!=iarr2[i])) {
							ba++;
							break;
						}
					}
				}
				
				System.out.println("아쉽네요 "+st+"S "+ba+"B입니다");
				cnt--;
				if(cnt==0) System.out.println("10번의 기회를 소진했습니다. 프로그램을 종료합니다");


			}
	}
}
