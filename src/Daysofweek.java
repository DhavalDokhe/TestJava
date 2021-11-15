import java.util.Scanner;

public class Daysofweek {
    public static void main(String[] args) {
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the n for days");
        n=s.nextInt();

        switch (n){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thurday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("invalid");
        }


    }
}
