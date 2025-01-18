import java.util.Scanner;
import java.util.*;
interface utility
{
   public void setdetails();
   public void getdetails();
}
public class Main {


    public static void menu()
    {
        System.out.println("------------------                                           ------------------");
        System.out.println("                  @WELCOME TO THE SHOWROOM MANAGEMENT SYSTEM@                  ");
        System.out.println("------------------                                           ------------------");
        System.out.println();
        System.out.println("1 ADD SHOWROOM                                2 ADD EMPLOYEE");
        System.out.println("3 ADD CARS                                    4 GET EMPLOYEE");
        System.out.println("5 GET SHOWROOM                                6 GET CARS");
        System.out.println("0 exit");


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Showroom[] showroom=new Showroom[5];
        Employee[] employee= new Employee[5];
        Cars[] cars=new Cars[5];
        int showroom_counter=0;
        int employee_counter=0;
        int cars_counter=0;
        int choice = 100;

        while(choice!=0)
        {
            menu();
            choice = sc.nextInt();

            while(choice!=9 && choice!=0)
            {
                switch(choice){
                    case 1:
                         showroom[showroom_counter]=new Showroom();
                        showroom[showroom_counter].setdetails();
                         showroom_counter++;
                        System.out.println("9 Goto main menu");
                        System.out.println("0 to exit");
                        choice=sc.nextInt();
                        break;

                    case 2:
                        employee[employee_counter]=new Employee();
                        employee[employee_counter].setdetails();
                        employee_counter++;
                        System.out.println("9 Goto main menu");
                        System.out.println("0 to exit");
                        choice=sc.nextInt();
                        break;

                    case 3:
                        cars[cars_counter]=new Cars();
                        cars[cars_counter].setdetails();
                        cars_counter++;
                        System.out.println("9 Goto main menu");
                        System.out.println("0 to exit");
                        choice=sc.nextInt();
                        break;

                    case 4:
                        for(int i=0;i<employee_counter;i++){
                        employee[i].getdetails();}
                        System.out.println("9 Goto main menu");
                        System.out.println("0 to exit");
                        choice=sc.nextInt();
                        break;

                    case 5:
                        for(int i=0;i<showroom_counter;i++){
                        showroom[i].getdetails();}

                        System.out.println("9 Goto main menu");
                        System.out.println("0 to exit");
                        choice=sc.nextInt();
                        break;

                    case 6:
                        for(int i=0;i<cars_counter;i++){
                        cars[i].getdetails();}

                        System.out.println("9 Goto main menu");
                        System.out.println("0 to exit");
                        choice=sc.nextInt();
                        break;

                    default:
                        System.out.println("choose only from above given options");
                        System.out.println("Thanks for using");
                }
            }
        }

        }
    }
