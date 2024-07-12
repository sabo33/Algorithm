import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int length = text.length();

        for(int i=0; i<length-1; i++){
            if(text.charAt(i)!=text.charAt(length-i-1)){
                System.out.print(0);
                return;
            }
        }
        System.out.print(1);


    }
}