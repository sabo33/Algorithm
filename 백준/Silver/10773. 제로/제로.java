import java.util.Scanner;
import java.util.Stack;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            int val = sc.nextInt();
            if(val==0){
                stack.pop();
            }
            else{
                stack.push(val);
            }
        }
        int sum =0;
        while(!stack.isEmpty())
        {
            sum+=stack.pop();
        }
        System.out.println(sum);
    }
}