import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String st = sc.nextLine();
        for (int i = 0; i < s.length; i++) {
            if (st.contains(s[i])) {
                st = st.replace(s[i], "!");
            }
        }
        System.out.println(st.length());
    }
}