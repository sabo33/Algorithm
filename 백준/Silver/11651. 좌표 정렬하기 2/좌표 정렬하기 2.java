import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pair[] pairs = new Pair[n];
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            pairs[i]=new Pair(x,y);
        }
        List<Pair> list = Arrays.asList(pairs);
        list.sort(Comparator.comparing(Pair::getY).thenComparing(Pair::getX));
        for(Pair pair : pairs){
            pair.print();
        }
    }
    public static class Pair{
        int x,y;
        Pair(int x, int y){
            this.x=x;
            this.y=y;
        }
        public int getX(){
            return this.x;
        }
        public int getY(){
            return this.y;
        }
        public void print(){
            System.out.println(x+" "+y);
        }
    }
}