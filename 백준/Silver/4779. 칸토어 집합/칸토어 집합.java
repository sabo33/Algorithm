import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    static String[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s;
        while((s=br.readLine())!=null){
            int n = Integer.parseInt(s);
            int len = (int)Math.pow(3,n);
            arr=new String[len];
            for(int i=0; i<len; i++){
                arr[i]="-";
            }
            solution(0,len);
            System.out.println(String.join("", arr));
        }
    }
    public static void solution(int start, int length){
        if(length==1){
            return;
        }
        int _length = length/3;
        for(int i = start+_length; i<start+2*_length; i++){
            arr[i]=" ";
        }
        solution(start,_length);
        solution(start+2*_length,_length);
    }
}
