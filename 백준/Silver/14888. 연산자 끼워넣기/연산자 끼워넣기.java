import java.util.Scanner;

public class Main {
    static int N;
    static int[] numbers;
    static int[] operators = new int[4]; // +, -, *, /
    static int maxResult = Integer.MIN_VALUE;
    static int minResult = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            operators[i] = sc.nextInt();
        }

        backtrack(numbers[0], 1);

        System.out.println(maxResult);
        System.out.println(minResult);
    }

    public static void backtrack(int currentResult, int index) {
        if (index == N) {
            maxResult = Math.max(maxResult, currentResult);
            minResult = Math.min(minResult, currentResult);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operators[i] > 0) {
                operators[i]--;
                switch (i) {
                    case 0:
                        backtrack(currentResult + numbers[index], index + 1);
                        break;
                    case 1:
                        backtrack(currentResult - numbers[index], index + 1);
                        break;
                    case 2:
                        backtrack(currentResult * numbers[index], index + 1);
                        break;
                    case 3:
                        backtrack(currentResult / numbers[index], index + 1);
                        break;
                }
                operators[i]++; //상태 복원
            }
        }
    }
}
