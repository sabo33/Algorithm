import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       int cnt=0;

       Scanner sc = new Scanner(System.in);
       int number = sc.nextInt();
       sc.nextLine();

       for(int k =0; k<number; k++) {
           String problem = sc.nextLine();
           int total=0;
           cnt=0;
           for(int i=0; i< problem.length(); i++) {
               if(problem.charAt(i)=='O') {
                   cnt++;
                   total+=cnt;
               }
               if(problem.charAt(i)=='X') {
                   cnt=0;
               }

           }
           System.out.println(total);


       }




       sc.close();

        }
    }
