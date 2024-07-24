import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Member[] members = new Member[n];
        for(int i=0; i<n; i++){
            int age=sc.nextInt();
            String name=sc.next();
            sc.nextLine();
            members[i]=new Member(age,name,i+1);
        }
        List<Member> memberList = Arrays.asList(members);
        memberList.sort(Comparator.comparing(Member::getAge).thenComparing(Member::getId));
        for(Member member : members){
            member.print();
        }
    }
    public static class Member{
        int age,index;
        String name;
        Member(int age, String name,int index){
            this.age=age;
            this.name=name;
            this.index=index;
        }
        public int getAge(){
            return this.age;
        }
        public int getId(){
            return this.index;
        }
        public void print(){
            System.out.println(age+" "+name);
        }
    }
}