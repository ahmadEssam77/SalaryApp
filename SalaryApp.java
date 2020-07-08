
package salaryapp;

import java.util.Scanner;

public class SalaryApp {
    
    static String a;

    public static void main(String[] args)
    {
        //this app will calculate your salary, what should you pay per month, what should you save
        //what should you pay for Allah, for your entertanment, and for your investment.
        int start = -1;
        Scanner in = new Scanner(System.in);
        //a brief of the program
        while(start == -1)
        {
            System.out.println("this program will organize your SALARY, just inter your salary, 0 will end the App");
            double s = in.nextDouble();  // read the salary
            
            if(s > 1500 && s < 60000)
            {
                System.out.println("your salary is " + s + " EGP and the best organize for it is");
                double p1, p2, p3, p4, p5;
                p1 = s * 65 / 100;
                System.out.println("the best senario is to spend " + p1 + " EGP during the month");
                p2 = s * 5 / 100;
                System.out.println("and spend " + p2 + " EGP for Allah");
                p3 = s * 10 / 100;
                System.out.println("and spend " + p3 + " EGP as an entertanement, buy anything that you want");
                p4 = s * 10 / 100;
                System.out.println("and spend " + p4 + " EGP as an investment, we prefer to determin this amount to improve yourself");
                p5 = s * 10 / 100;
                System.out.println("finally this amount " + p5 + " EGP for saving, you should keep every month a small amount for emergincy cases");
                System.out.println("if you want to organize another SALARY press -1 or 0 to finish the program"); // i have a bug here when i press -1, the app print thanks for using the app and then allow me to enter the salary
                start = in.nextInt();
            }
            else if(s > 0 && s <= 1500)
            {
                System.out.println("your salary is " + s + " EGP and you should work hard on yourself to reach in a good position and change your life");
                System.out.println("Keep working, and never giveup");
                System.out.println("if you want to organize another SALARY press -1 or 0 to finish the program");
                start = in.nextInt(); // the same bug, the app print thanks for using our app after enter -1 and then allow me to enter another salary
                
            }
            else if(s >= 60000)
            {
                System.out.println("your salary is " + s + " EGP and it seems charming, what is your job?");
                System.out.println("                               ");
                a = in.nextLine();  // i have a bug here, the IDE can't read this line
                System.out.println("Awesome!");
                System.out.println("if you want to organize another SALARY press -1 or 0 to finish the program");
                start = in.nextInt();  // sure the same issue print thanks and then enter another salary
            }
            else if(s == 0)
            {
                System.out.println("you entered 0 and the App is terminate");
                start = 0;// there is a bug here infinity 0 // it got resolved :))
            }
            else if(s < -1)  // i have an issue here if i pressed -100 and then 500 to calculate the 500 the app continue first like it will print theanks for using the app and then will ask me again about the salary again to calculate it 500 so i entered 500 twice to be calculated
            {
                System.out.println("the amount is in negative value, you must kidding with us, enter a positive value started with 1 to ..");
                System.out.println("Enter the right value and the salay that you want to organise it");
                s = in.nextDouble();
            }
            
            // the user entered 0
            System.out.println("Thanks for using our App");  // there is a bug here after pressing -1 this statement appears
            
            
            
        }
    }
    
    public static void initialScreen()
    {
        System.out.println("#############################################################");
        System.out.println("#             Welcome to mySalary App                       #");
        System.out.println("#                                                           #");
        System.out.println("#                                                           #");
        System.out.println("#                                                           #");
        System.out.println("#                                                           #");
        System.out.println("#                                                           #");
        System.out.println("#                                                           #");
        System.out.println("#                                                           #");
        System.out.println("#                                                           #");
        System.out.println("#                                                           #");
        System.out.println("#                                                           #");
        System.out.println("#############################################################");
    }
    
}
