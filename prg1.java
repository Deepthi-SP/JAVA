import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class prg1 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value for a ans b");
        a=sc.nextInt();
        b=sc.nextInt();
       if (a>b) {
        System.out.println("a is greater than b");
       } else {
        System.out.println("b is greater than a");
       }
       
    }
       
 }
    

