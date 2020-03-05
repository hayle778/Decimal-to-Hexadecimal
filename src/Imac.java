
/*
Create a program that the user add the input or decimal and the program can change it hexadecimal reading
*/

import java.util.Scanner;
public class Imac {
    public static void main(String[] args) {
// rem is as a reminder  %
        int decnu, rem;
        String hexdec_num = "";
        /* hexadecimal number digits with its variable representation */
        char hex [] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        Scanner input = new Scanner(System.in);

        //  Scanner input = new Scanner(System.in);
        System.out.println("Input a decimal number: ");
        decnu = input.nextInt();
        //while loop
        while (decnu > 0) {
            // write a java program to convert a decimal number to hexadecimal number
            rem = decnu % 16;        // hexadecimal is a number divided by 16
         hexdec_num = hex[rem] + hexdec_num;
          decnu = decnu / 16;
        }
     System.out.println(" Hexadecimal number is: " + hexdec_num + " \n ");
    }
}