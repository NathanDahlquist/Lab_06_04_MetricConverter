import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meters;
        double miles;
        double feet;
        double inches;
        String trash;

        System.out.println("Enter the distance in meters");
        if(in.hasNextDouble()){
            meters = in.nextDouble();
            in.nextLine();

            feet = meters * 3;
            inches = feet * 12;
            miles = feet / 5280;

            System.out.printf("The distance in miles %.2f%n", miles);
            System.out.printf("The distance in feet %.2f%n", feet);
            System.out.printf("The distance in inches %.2f%n", inches);
        }else{
            trash = in.nextLine();
            System.out.println("You entered an invalid length: " + trash);
        }
    }
}
