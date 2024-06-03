import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int maxNum = 0;
        double result = 0;
        int[] arr = new int[x];
        String[] scores = br.readLine().split(" ");
        for (int i = 0; i < x; i++) {

            arr[i] = Integer.parseInt(scores[i]);
        }

        for (int num : arr) {
            if (num > maxNum) maxNum = num;
        }
        for (int num : arr) {
            result += (double) num / maxNum * 100;
        }
        System.out.println(result / x);


    }

}