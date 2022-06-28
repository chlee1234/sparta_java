import java.util.*;
public class Main {
    public double solution(int[] arr) {
        double answer  = Arrays.stream(arr).average().orElse(0);

        return answer;
    }


    public static void main(String[] args) {
        int[] arr1 = new int [] {1,2,3,4,5};
        int[] arr2 = new int [] {3,5,7,9};

        Main result = new Main();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("결과 : " + result.solution(arr1));
        System.out.println("결과 : " + result.solution(arr2));
    }
}