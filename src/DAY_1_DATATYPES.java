
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author P1732
 */
public class DAY_1_DATATYPES {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        

        int i1 = scan.nextInt();
        double d1 = scan.nextDouble();
        scan.nextLine();
        String s1 = scan.nextLine();
        
        
        int i2 = i + i1;
        double d2 = (double) d + d1;
        String s2 = s + s1;
        
        System.out.println(i2);
        System.out.println(d2);
        System.out.println(s2);
        

        scan.close();
    }
}

