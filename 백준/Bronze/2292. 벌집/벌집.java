import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i;
        int room=1;
        for(i=1; room<a; i++){
            room+=i*6;
        }
        System.out.println(i);
    }
}