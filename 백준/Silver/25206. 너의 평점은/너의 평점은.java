import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Map<String,Double> map = Map.of("A+",4.5,
                "A0",4.0,
                "B+",3.5,
                "B0",3.0,
                "C+",2.5,
                "C0",2.0,
                "D+",1.5,
                "D0",1.0,
                "F",0.0
        );
        double points = 0.0;
        double result = 0.0;
        for(int i=0; i<20; i++){
            String[] list = sc.nextLine().split(" ");
            if(!list[2].equals("P")){
                points += Double.parseDouble(list[1]);
                result += Double.parseDouble(list[1])* map.get(list[2]);
            }
        }
        System.out.print(result/points);
    }
}