import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int length=1;
        int totalLength=0;
        int count =10;
        for(int i=1; i<=a; i++){
            if(i%count==0){
                length+=1;
                count *=10;
            }
            totalLength+=length;
        }
        System.out.println(totalLength);
    }
}