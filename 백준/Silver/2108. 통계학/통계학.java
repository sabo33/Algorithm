
import java.util.*;

import static java.lang.Math.abs;
import static java.util.Collections.sort;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<Integer>(1);
        int a = sc.nextInt();

        for(int i=0; i<a; i++)
        {
            int num = sc.nextInt();
            if(num<=abs(4000))
            {
                arrayList.add(num);
            }

        }
        print(arrayList,a);
        sc.close();

    }
    public static void print(ArrayList<Integer> arr, int a){
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        List<Integer>list = new ArrayList<>();
        sort(arr);
        //산술평균
        double sum =0;
        int middle = a/2;
        int Mode=0;

        for(int i=0; i<arr.size(); i++)
        {
            sum +=arr.get(i);
        }

        //평균 중앙값 최빈값 범위

        for(int num : arr) {
            // 숫자가 한번 나올 때마다 1이 추가됨.
            hashmap.put(num, hashmap.getOrDefault(num, 0) + 1);
        }
        int numbers = 0;
        for(int key : hashmap.values()) {
            numbers = Math.max(numbers, key);
        }
        for(int key: hashmap.keySet()){
            if(hashmap.get(key) == numbers){
                list.add(key);
            }
        }
        sort(list);

        if(list.size()>=2){
            Mode = list.get(1);
        }
        else{
            Mode=list.get(0);
        }

        System.out.println(Math.round(sum/a));
        System.out.println(arr.get(middle));
        System.out.println(Mode);

        if(a!=1) {
            int max = Collections.max(arr);
            int min = Collections.min(arr);
            System.out.println(abs(max-min));
        }
        else{
            System.out.println("0");
        }

    }


}