
package salaryapp;

import java.util.Scanner;

public class SalaryApp {
    
    static String jobName;
    static double salary;
    static byte continueOrStop;
    
    public static void main(String[] args){
            
            openScreen();
        }
    
        public static void openScreen()
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("#############################################################");
            System.out.println("#             Welcome to mySalary App                       #");
            System.out.println("#                                                           #");
            System.out.println("#                                                           #");
            System.out.println("#                  Enter your salary in EGP                 #");
            System.out.print("                             ");
            salary = scanner.nextDouble();
            System.out.println("#                                                           #");
            System.out.println("#                                                           #");
            System.out.println("#                                                           #");
            System.out.println("#                                                           #");
            System.out.println("#                                                           #");
            System.out.println("#                                                           #");
            System.out.println("#############################################################");
            calculateSalary();
        }

        public static void calculateSalary() {
            Scanner scanner = new Scanner(System.in);
            while(true) {
               if(salary >= 60000) {
                    System.out.println("your salary is " + salary + " EGP and it seems charming, what is your job?");
                    System.out.println("                               ");
                    jobName = scanner.nextLine();  
                    System.out.println("Awesome!");
                    System.out.println("if you want to organize another SALARY press 1 or 0 to finish the program");
                    continueOrStop = scanner.nextByte();
                    if(continueOrStop == 1)
                        openScreen();
                    else if(continueOrStop == 0)  // i have a bug here when i press 0 at the first time it's ok but the second time no // i solved the half of the issue now 0 terminate the app but after one time not on spot
                        break;
                }
               
               else if(salary > 0 && salary <= 1500) {
                    System.out.println("your salary is " + salary + " EGP and you should work hard on yourself to reach in a good position and change your life");
                    System.out.println("Keep working, and never give up");
                    System.out.println("if you want to organize another SALARY press 1 or 0 to finish the program");
                    continueOrStop = scanner.nextByte();
                    if(continueOrStop == 1)
                        openScreen();
                    else if(continueOrStop == 0)  // i have a bug here when i press 0 at the first time it's ok but the second time no // i solved the half of the issue now 0 terminate the app but after one time not on spot
                        break;
                }
               
               else if(salary > 1500 && salary < 60000) {
                    double p1, p2, p3, p4, p5;
                    p1 = salary * 65 / 100;
                    System.out.println("the best senario is to spend " + p1 + " EGP during the month");
                    p2 = salary * 5 / 100;
                    System.out.println("and spend " + p2 + " EGP for Allah");
                    p3 = salary * 10 / 100;
                    System.out.println("and spend " + p3 + " EGP as an entertanement, buy anything that you want");
                    p4 = salary * 10 / 100;
                    System.out.println("and spend " + p4 + " EGP as an investment, we prefer to determin this amount to improve yourself");
                    p5 = salary * 10 / 100;
                    System.out.println("finally this amount " + p5 + " EGP for saving, you should keep every month a small amount for emergincy cases");
                    System.out.println("To enter another salary press 1, to end press 0 ");
                    continueOrStop = scanner.nextByte();
                    if(continueOrStop == 1)
                        openScreen();
                    else if(continueOrStop == 0)  // i have a bug here when i press 0 at the first time it's ok but the second time no // i solved the half of the issue now 0 terminate the app but after one time not on spot
                        break;
                }
            }
        }    
}
