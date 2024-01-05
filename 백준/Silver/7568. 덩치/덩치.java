import java.util.*;

public class Main {
    public static class Bigger{
        int weight;
        int height;
        Bigger(int weight, int height){
            this.weight=weight;
            this.height=height;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        List<Bigger> list = new ArrayList<>();
        List<Integer> count = new ArrayList<>();
        int cnt =0;
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            int weight=sc.nextInt();
            int height=sc.nextInt();
            list.add(new Bigger(weight,height));
        }
        for(int i=0; i<list.size(); i++){
            cnt=0;
           for(int j=0; j<list.size(); j++){
               if(list.get(i).weight<list.get(j).weight && list.get(i).height<list.get(j).height){
                   cnt++;
               }
           }
           count.add(cnt);
        }
        for(int i=0; i< count.size(); i++){
            System.out.print(count.get(i)+1+" ");
        }
    }
}