import java.util.Scanner;

public class A {

    public static void main(String[] args) { 
        Scanner s = new Scanner(System.in);
        int N = Integer.parseInt(s.next());

        int count=0;

        while(N>4){
            count++;
            N=N-4;
        }

        StringBuilder x_ans = new StringBuilder();
        int M_ans = 0;

        x_ans.append(String.valueOf(N));
        M_ans = 2 * N;
        for(int i=0;i<count;i++){
            x_ans.append("4");
            M_ans += 8;
        }
        System.out.println(M_ans);
        System.out.println(x_ans);
    }
}
