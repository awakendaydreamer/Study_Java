package Algorithm;

import java.util.Scanner;

public class Ex_BinSearch {

	public static void main(String[] args) {
		//이진검색(Binary Search) : low, high, middle 사용
		//찾고자 하는 데이터를 중앙에 위치한 중간값과 비교하는 방법
		//데이터가 사전에 오름차순으로 정렬되어 있어야 한다(전제조건)
		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		
		Scanner sc = new Scanner(System.in);
		System.out.print("찾는 수를 입력하세요 : ");
		int searchData = sc.nextInt();	//찾는 값
		sc.close();
		
		int index = binSearch(arr, searchData);//binSearch() 메서드 호출
		
		if (index == -1) {
			System.out.println("찾는 수는 " + searchData + "이며, 검색에 실패하였습니다."); 
		}else{
			System.out.println("찾는 수는 " + searchData + "이며, " + index + "번째에 있습니다.");
		}

	}//main()
	
	public static int binSearch(int[] arr, int searchData){
		int index = -1;
		int low = 0, middle = 0, high = arr.length - 1;
		while(low <= high){
			middle = (low + high)/2; 			//중간값의 배열 번지수(index)
			if(searchData == arr[middle]){		//성공 : 검색완료
				index = middle;
				break;
			}else if(searchData > arr[middle]){	//중간값을 기준으로 왼쪽부분을 제외시킴(so. low point가 바뀜)
				low = middle + 1;				//low 포인터 변경
			}else{								//중간값을 기준으로 오른쪽 부분을 제외(high가 중간값보다 더 작게되면됨)
				high = middle - 1;				//high 포인터 변경
			}//if
			
		}//while
		return index;
	}//binSearch()
}//class
