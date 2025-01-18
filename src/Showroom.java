import java.util.Scanner;

public class Showroom implements utility{
    Scanner sc = new Scanner(System.in);
    int total_emp;
    int total_cars;
    String showroom_name;
    String manager;
    String address;

    @Override
    public void setdetails() {
        System.out.println("%%%%%%%%%% ENTER SHOWROOM DETAILS %%%%%%%%%%");
        System.out.println();
        System.out.println("NAME OF THE SHOWROOM : ");
        showroom_name=sc.nextLine();
        System.out.println("NAME OF THE MANAGER : ");
        manager=sc.nextLine();
        System.out.println("ADDRESS : ");
        address=sc.nextLine();
        System.out.println("TOTAL NUMBER OF EMPLOYEE : ");
        total_emp=sc.nextInt();
        System.out.println("TOTAL NUMBER OF CARS : ");
        total_cars=sc.nextInt();
    }

    @Override
    public void getdetails() {
        System.out.println("SHOWROOM : "+showroom_name);
        System.out.println("MANAGER : "+ manager);
        System.out.println("ADDRESS : "+ address);
        System.out.println("TOTAL EMPLOYEE : "+total_emp);
        System.out.println("TOTAL CARS : "+total_cars);
    }
}
