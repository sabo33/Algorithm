import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.*;

public class Main{
    public static void main(String args[])throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int caseNum = Integer.parseInt(rd.readLine());

        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Boolean> check = new LinkedList<>();
        while(caseNum-- >0)
        {
            int cnt = 0;
            String[] arr = rd.readLine().split(" ");
            int count = Integer.parseInt(arr[0]);
            int index = Integer.parseInt(arr[1]);
            String[] array = rd.readLine().split(" ");
            for(int i=0; i<count; i++){
                list.add(Integer.parseInt(array[i]));
                if(i==index){
                    check.add(true);
                }
                else{
                    check.add(false);
                }
            }
            int selectNum = list.get(index);
            while(!list.isEmpty()){
                int max = Collections.max(list);

                if(max!=list.getFirst()) {
                    int num = list.pollFirst();
                    list.offerLast(num);
                    boolean b = check.pollFirst();
                    check.offerLast(b);
                }
                else{
                   int num = list.pollFirst();
                   boolean b = check.pollFirst();
                   cnt ++;
                   if(b==true && num==selectNum)
                   {
                       System.out.println(cnt);
                   }
                }
            }
        }
    }
}