
import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt();
        sc.nextLine();
        String a = sc.nextLine();

        String[] num=a.split("\\s");
        if(num.length != b)
        {
            return;
        }
        int[] arr = Arrays.stream(num).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(arr);


        System.out.println(arr[0]+" "+arr[arr.length-1]);
        sc.close();

    }
}