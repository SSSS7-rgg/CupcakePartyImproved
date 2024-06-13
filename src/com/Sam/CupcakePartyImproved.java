package com.Sam;
/**
 * @author sam
 * @date 02/21/2024
 * CupcakeParty
 */

import java.util.Scanner;

public class CupcakePartyImproved {
	/**
	 * will take the number of the student and will divide the cupcake among the children and will out put the left our of the cupcakes 
	 * @param args Command line arguments
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int reg = 8;
		int sml = 3;
        System.out.println("A regular box of cupcakes holds 8 cupcakes, while a small box holds 3 cupcakes. There are\r\n"
	                   	+ "28 students in a class and a total of at least 28 cupcakes. Your job is to determine how many\r\n"
	                   	+ "cupcakes will be left over if each student gets one cupcake.");
        System.out.println();
        System.out.println("inter the amount of larg boxes");
        System.out.print("--> ");
        int largBox = input.nextInt();
        //doing the work
        System.out.println("inter the amount of small boxes");
        System.out.print("--> ");
        int smallBox = input.nextInt();
        System.out.println();
        System.out.println();
        int l = largBox*reg;
        int s = smallBox*sml;
        int leftOver = (l + s) % 28;
        System.out.println(leftOver);	
	}

}
