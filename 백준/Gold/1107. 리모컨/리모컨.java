import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int channel = sc.nextInt();
        int buttonCnt = sc.nextInt();
        int[] btn = {1,1,1,1,1,1,1,1,1,1};
        int set = Math.abs(channel-100);

        for(int i=0; i<buttonCnt; i++){
            int brokenBtn = sc.nextInt();
            btn[brokenBtn]=0;
        }
        for(int i=0; i<999999; i++){
            String num = String.valueOf(i);
            boolean check = false;
            for(int j=0; j<num.length(); j++){
                if(btn[num.charAt(j)-'0']==0){
                    check=true;
                    break;
                }
            }
            if(!check){
                int result = Math.abs(channel-i)+num.length();
                set=Math.min(result,set);
            }
        }
        System.out.println(set);
    }
}