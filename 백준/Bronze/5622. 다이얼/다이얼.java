import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        String s = sc.nextLine();
        int[] a = new int[]{3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,8,9,9,9,10,10,10,10};

        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            sum+=a[ch-'A'] ;
        }
        System.out.println(sum);

    }

}