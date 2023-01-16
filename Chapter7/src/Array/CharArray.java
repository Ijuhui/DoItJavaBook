package Array;

public class CharArray {
    public static void main(String[] args) {
        char[] alphabets = new char[26];
        char ch = 'A';

        for (int i = 0; i < alphabets.length; i++) {
            alphabets[i] = ch; //아스키 값으로 각 요소에 저장
            ch++; //아스키 값 1씩 증가
        }
        for (int i = 0; i < alphabets.length; i++) {
            System.out.println(alphabets[i] + ", " + (int) alphabets[i]); //cast연산 통해 문자와 아스키 코드 값 같이 출력
        }
    }
}
