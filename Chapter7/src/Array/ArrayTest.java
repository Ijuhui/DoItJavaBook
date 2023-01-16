package Array;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[10]; //int형 배열 arr 선언
        for (int j = 0; j < 10; j++) { //for문으로 배열 arr 초기화
            arr[j] = j+1;
            System.out.println(arr[j]);
        }
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //int형 배열 arr1 선언과 동시에 초기화, new int 생략
        int[] arr2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //int형 배열 arr2 선언과 동시에 초기화, new int 생략X
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr2[i]);
        }
        int[] arr3;
        arr3 = new int[] {100, 101, 102}; //선언과 초기화를 따로 할 때에는 new 자료형[] 생략 불가

    }
}
