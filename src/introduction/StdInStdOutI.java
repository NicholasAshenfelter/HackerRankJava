package src.introduction;

import java.util.Scanner;

public class StdInStdOutI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            System.out.println(scan.nextInt());
        }
    }
}
