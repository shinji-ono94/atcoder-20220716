import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B {

    public static void main(String[] args) { 
        Scanner s = new Scanner(System.in);
        String input_text1 = s.nextLine();
        String input_text2 = s.nextLine();

        String[] array1 = input_text1.split("\\s+");
        String[] array2 = input_text2.split("\\s+");

        int N = Integer.parseInt(array1[0]);
        int a = Integer.parseInt(array1[1]);
        int b = Integer.parseInt(array1[2]);
        List<Integer> Ai = new ArrayList<Integer>();
        for(int i=0;i<array2.length;i++){
            Ai.add(Integer.parseInt(array2[i]));
        }

        int[] maxvalue = secondHighest(Ai);

        int sum = 0;

        while(sum==0){
            if(maxvalue[0]<=a || maxvalue[1]<=b){
                break;
            }
            int row = Ai.indexOf(maxvalue[0]);
            Ai.set(row,maxvalue[0]-a);
            if(Ai.indexOf(maxvalue[0])>0){
                Ai.set(Ai.indexOf(maxvalue[0]),maxvalue[0]-b);
            }else{
                Ai.set(Ai.indexOf(maxvalue[1]),maxvalue[1]-b);
            }    
        }
        System.out.println(maxvalue[0]);
    }

    public static int[] secondHighest(List<Integer> nums) {
        int high1 = Integer.MIN_VALUE;
        int high2 = Integer.MIN_VALUE;
        for (int num : nums) {
          if (num > high1) {
            high2 = high1;
            high1 = num;
          } else if (num > high2) {
            high2 = num;
          }
        }
        int[] res = new int[2];
        res[0] = high1;
        res[1] = high2;
        return res;
     }
}
