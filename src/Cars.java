import java.util.Scanner;

public class Cars extends Showroom implements utility{
    Scanner sc=new Scanner(System.in);
    int model_year;
     String car_name;
     String car_type;
     String color;

    @Override
    public void getdetails() {
        System.out.println("CAR : "+car_name);
        System.out.println("MODEL : "+model_year);
        System.out.println("COLOUR : "+ color);
        System.out.println("CAR TYPE : "+car_type);
    }

    @Override
    public void setdetails() {
        System.out.println("%%%%%%%%%% ENTER CAR DETAILS %%%%%%%%%%");
        System.out.println("ENTER THE NAME OF THE CAR : ");
        car_name=sc.nextLine();
        System.out.println("ENTER THE COLOUR : ");
        color=sc.nextLine();
        System.out.println("ENTER THE CAR TYPE (FUEL) : ");
        car_type=sc.nextLine();
        System.out.println("ENTER THE MODEL OF THE CAR : ");
        model_year=sc.nextInt();
    }
}
