import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
  public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
      int a=Integer.parseInt(scanner.nextLine());
      while(a-- >0){
          String str = scanner.nextLine();
          int number = Integer.parseInt(scanner.nextLine());

          StringTokenizer st = new StringTokenizer(scanner.nextLine(),"[],");
          ArrayDeque<Integer> deque = new ArrayDeque<>();

          for(int i=0; i<number; i++){
              deque.add(Integer.parseInt(st.nextToken()));
          }
          run(str,deque);
      }
    System.out.println(sb);
  }
  public static void run(String str,ArrayDeque deque){
      boolean check=true;
      for(char ch : str.toCharArray()){
          if(ch=='R')
          {
              check=!check;
              continue;
          }
          if(check){
              if(deque.pollFirst()==null){
                  sb.append("error\n");
                  return;
              }
          }
          else{
              if(deque.pollLast()==null){
                  sb.append("error\n");
                  return;
              }
          }
      }
      print(check,deque);
  }
  public static void print(boolean check,ArrayDeque deque){
      sb.append("[");
      if(deque.size()>0){
          if(check){
              sb.append(deque.pollFirst());
              while(!deque.isEmpty()){
                  sb.append(',').append(deque.pollFirst());
              }
          }
          else{
              sb.append(deque.pollLast());
              while(!deque.isEmpty()){
                  sb.append(',').append(deque.pollLast());
              }
          }
      }
      sb.append(']').append('\n');
  }
}