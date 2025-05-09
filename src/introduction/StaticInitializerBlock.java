package src.introduction;

import java.util.Scanner;

public class StaticInitializerBlock {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt(), h = scan.nextInt();
        scan.close();
        try{
            if(b <=0 || h <= 0){
                throw new Exception("java.lang.Exception: Breadth and height must be positive");
            } else {
                System.out.println(b*h);
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
