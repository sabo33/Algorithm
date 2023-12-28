
import java.util.ArrayList;

public class Main {
    public static void main(String args[]){
        int check=0;
        ArrayList<Integer> arr = new ArrayList<Integer>(1);
        ArrayList<Integer> arrCheck = new ArrayList<Integer>(1);
        for(int i=1; i<=10000; i++){
           int result = add(i);
           arr.add(result);
        }
        for(int j=1; j<arr.size(); j++)
        {
           if(!arr.contains(j)){
               arrCheck.add(j);
           }
        }
        for(int i=0; i<arrCheck.size(); i++){
            System.out.println(arrCheck.get(i));
        }
    }
    public static int add(int number){
        int sum=number;
        while(number>0){
            sum= sum+number%10;
            number/=10;
        }
        return sum;
    }

}