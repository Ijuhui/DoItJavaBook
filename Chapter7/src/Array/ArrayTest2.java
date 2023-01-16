package Array;

public class ArrayTest2 {
    public static void main(String[] args) {
        double[] date = new double[5];
        int size = 0; //유효한 값이 저장된 배열 요소 개수를 저장할 변수 선언

        date[0] = 10.0;
        size++; //값을 저장한 후 size 변수 값 증가
        date[1] = 20.0;
        size++;
        date[2] = 30.0;
        size++;

        for (int i = 0; i < size; i++) { //유효한 배열 값만큼 출력
            System.out.println(date[i]);
        }

        for (int i = 0; i < date.length; i++) { //모든 배열 값 출력
            System.out.println(date[i]);
        }
    }
}
