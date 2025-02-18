package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample2 {
	
	Scanner sc = new Scanner(System.in);
	
	// 얕은 복사
	// -> 주소를 복사하여 서로 다른 두 참조변수가
	// 하나의 배열(또는 객체)을 참조하는 상태를 만드는 복사방법
	public void shallowCopy() {
		
		int arr[] = {1, 2, 3, 4, 5};
		
		// 얕은 복사
		int copyArr[] = arr;
		
		System.out.println("변경 전");
		System.out.println("arr 주소 : "+arr);
		System.out.println("copyArr 주소 : " + copyArr);
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copyArr 주소 : " + Arrays.toString(copyArr));
		
		// 얕은 복사한 배열의 값을 변경
		copyArr[2] = 999;
		System.out.println("변경 후");
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copyArr 주소 : " + Arrays.toString(copyArr));
		
	}
	
	
	// 깊은 복사
	// -> 같은 자료형의 새로운 배열을 만들어서
	// 기존 배열의 데이터를 모두 복사하는 방법
	public void deepCopy() {
		
		int[] arr = {1,2,3,4,5};
		
		// 1. for문을 이용한 깊은 복사
		int[] copyArr1 = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++){
			copyArr1[i] = arr[i];
		}
		System.out.println("변경 전");
		System.out.println("arr 주소 : "+arr);
		System.out.println("copyArr 주소 : " + copyArr1);
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copyArr : " + Arrays.toString(copyArr1));
		
		// 2. System.arraycopu(원본배열, 원본복사 시작 인덱스, 
		//						복사배열, 복사배열의 삽입 시작 인덱스, 복사길이);
		
		int [] copyArr2 = new int[arr.length];
		System.arraycopy(arr, 0, copyArr2, 0, arr.length);
		System.out.println(Arrays.toString(copyArr2));
	
		// 3. 복사할 배열 참조변수 = Arrays.copyOf(원본배열, 복사할 길이);
		int [] copyArr3 = Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(copyArr3));
		
		// 값 변경 후 확인
		copyArr1[4] = 0;
		copyArr2[4] = 999;
		copyArr3[4] = 5000;
		System.out.println("arr : " +Arrays.toString(arr));
		System.out.println("copyArr1 : " +Arrays.toString(copyArr1));
		System.out.println("copyArr2 : " +Arrays.toString(copyArr2));
		System.out.println("copyArr3 : " +Arrays.toString(copyArr3));
	}
	
	//로또번호 생성기
	// 배열을 이용한 중복데이터 제거 + 정렬
	public void createLottoNumber() {
		// 1~45 사이 중복되지 않은 난수 6개 생성
		// 생성된 난수가 오름차순 정렬
		
		// 정수 6개 저장할 배열 선언 및 할당
		
		int [] lotto = new int[6];
		
		for(int i=0; i < lotto.length; i++) {
			
			int random = (int)(Math.random() * 45 + 1);

			lotto[i] = random;
			
			// 중복검사
			for(int x = 0; x < i; x++) {
				// 현재 생성된 난수와 같은 수가 앞쪽에 있는지 검사
				
				if(random == lotto[x]) {
					i--;
					break;
				}
			}
				
		}
		// 오름차순 정렬
		// -> 선택, 삽입, 버블, 퀵 등등
		// -->자바가 정렬 방법을 미리 만들어서 제공함
		// Arrays.sort(배열명) : 배열 내 요소 값들이 오름차순 정렬됨
		Arrays.sort(lotto);
		
		System.out.println(Arrays.toString(lotto));
	}
}
