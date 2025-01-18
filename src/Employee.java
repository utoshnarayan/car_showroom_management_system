import java.util.Scanner;
import java.util.UUID;

public class Employee extends Showroom implements utility {

    Scanner sc = new Scanner(System.in);
    String emp_name;
    String emp_id;
    String department;
    String showroom_name;
    int emp_age;

    @Override
    public void setdetails() {
        System.out.println("%%%%%%%%%% ENTER EMPLOYEE DETAILS %%%%%%%%%%");
        System.out.println();
        System.out.println("enter the name of employee : ");
        emp_name=sc.nextLine();
        UUID uuid= UUID.randomUUID();
        emp_id= String.valueOf(uuid);

        System.out.println("enter the department of employee : ");
        department=sc.nextLine();
        System.out.println("enter the name of showroom : ");
        showroom_name=sc.nextLine();
        System.out.println("enter the age of employee : ");
        emp_age=sc.nextInt();


    }

    @Override
    public void getdetails() {
        System.out.println("EMPLOYEE ID : "+ emp_id);
        System.out.println("EMPLOYEE NAME : "+emp_name);
        System.out.println("EMPLOYEE AGE : "+ emp_age);
        System.out.println("DEPARTMENT : "+department);
        System.out.println("SHOWROOM : "+showroom_name);

    }
}
