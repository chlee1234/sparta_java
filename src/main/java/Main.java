public class Main {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int[] arr3 = new int[7]; //공부시간 계산 배열 선언
        for (int i=0; i< 7; i++) {
            if (arr2[i] >= 29) {  // check out 29시 이상이면 21시로 바꿔줌
                arr2[i] = 21;
            }
            answer += arr2[i] - arr1[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        int[] arr1 = {9, 9, 8, 8, 7, 8, 9};
        int[] arr2 = {21, 25, 30, 29, 22, 23, 30};
        System.out.println(method.solution(arr1, arr2));
    }
}