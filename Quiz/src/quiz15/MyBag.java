package quiz15;

public class MyBag implements IBag {
	// String 배열 생성
	private String[] arr = new String[100];
	private int index; // index를 만들어 사용하면 편하다
	@Override
	public void insert(String item) { // 저장 
		//		for(int i = 0; i<arr.length; i++) {
		//			if(arr[i] != null) {
		//				continue;
		//			} else {
		//				arr[i] = item;
		//				break;
		//			}
		//			
		//		}
		arr[index] = item;
		index++;
	}

	@Override
	public void print() { // 출력
		//		int i = 0;
		//		while(arr[i] != null) {
		//			System.out.print(arr[i] + " ");
		//			i++;
		//		}
		//		System.out.println();
		//	}
		for(int i =0; i<index; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	@Override
	public int search(String item) { // 검색 

//		for(int i = 0; i<arr.length; i++) {
//			if(arr[i].equals(item)) {
//				return i;
//			}
//		}
		for(int i = 0; i<index; i++) {
			if(arr[i].equals(item)) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public boolean delete(String item) { // 삭제
		// 새로운 배열만들어서 제거
//		for(int i = 0; i<arr.length; i++) {
//
//			if(arr[i].equals(item)) {
//				String[] newArr = new String[100]; 
//				newArr[i] = arr[i+1];
//				for(int j = 0; j < i; j++) {
//					newArr[j] = arr[j];
//				}
//				arr = newArr;
//				return true;
//			}
//		}
		// index를 이용하여 제거
		
		if(item == null) { return false; }
		
		for(int i = 0; i<index; i++) {
			// 찾은 경우의 조건
			if(arr[i].equals(item)) {
				// 뒤의 아이템을 당기고 종료
				for(int j = i; j<index; j++) {
					arr[j] = arr[j+1];
				}
				arr[index-1] = null;
				index--;
				return true;
			}
		}
		return false;
	}




}
