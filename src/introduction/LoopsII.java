package src.introduction;

import java.util.Scanner;

public class LoopsII {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            StringBuilder output = new StringBuilder();
            for(int j = 1; j <= n; j++){
                int current = a;
                for(int k = 0; k < j; k++){
                    current += (int)(Math.pow(2, k) * b);
                }
                output.append(current).append(" ");
            }
            System.out.println(output);
        }
        in.close();
    }
}
