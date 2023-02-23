/**
* The program takes input from user and displays roman version of the number
* @author Mohammad Seeam
*/

//Importing below libraries because we need these for taking input from user and showing output. 
import java.io.*;
import java.util.Scanner;

public class Roman{

    /* The below is main function.
    main calls logic() function*/

    public static void main(String args[]) {

        logic();     

    }


    /* The below is logic() function.
    logic() calls convert_number_to_roman() function */

    public static void logic () {

        //The below object is for taking input value from user
        Scanner s = new Scanner(System.in);    

        //The boolean is to continue the while loop and stop when need
        boolean loop_activated = true;

        //We store the input value from user in number_from_user Integer
        Integer number_from_user = 0;
        
        //The below loop allows user to put answer again and again, if user put wrong value
        while(loop_activated==true){
            System.out.print("Please enter a number from 1 to 10: "); 
            number_from_user = s.nextInt(); 
            if(number_from_user>=11 || number_from_user<=0){
                System.out.print("Your number is not in range. Try again and enter correct number ! ");
            }else if(number_from_user>=1 && number_from_user <=10){
                loop_activated = false;
            }

        }

        //The value from user is checked and valid. 
        //Now passing the value for printing to convert_number_to_roman() function

        convert_number_to_roman(number_from_user);

    }
    
    /* The below is convert_number_to_roman() function.
    The below function prints the roman version of Integer */

    public static void convert_number_to_roman (Integer number_from_user) {

        if(number_from_user == 1){
            System.out.print("The user entered I ");
        }else if(number_from_user==2){
            System.out.print("The user entered II ");
        }else if(number_from_user==3){
            System.out.print("The user entered III ");
        }else if(number_from_user==4){
            System.out.print("The user entered IV ");
        }else if(number_from_user==5){
            System.out.print("The user entered V ");
         }else if(number_from_user==6){
            System.out.print("The user entered VI ");
        }else if(number_from_user==7){
            System.out.print("The user entered VII ");
        }else if(number_from_user==8){
            System.out.print("The user entered VIII ");
        }else if(number_from_user==9){
            System.out.print("The user entered IX ");        
        }else if(number_from_user==10){
            System.out.print("The user entered X ");        
        }
    }
    
}