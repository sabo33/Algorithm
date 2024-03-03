import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a = sc.nextLine().toLowerCase();

        int[] alpha = new int[26];

        for(int i=0; i<a.length(); i++){
            alpha[a.charAt(i)-97]++;
        }
        char ch='?';
        int max=Integer.MIN_VALUE;
        for(int i=0; i<26; i++){
            if(alpha[i]>max){
                max=alpha[i];
                ch=(char)(i+65);
            }
            else if(alpha[i]==max){
                ch='?';
            }
        }
        System.out.println(ch);
    }
}