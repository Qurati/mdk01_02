import java.util.Scanner;

public class BaranovArtemLab1 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число x = ");
        double x = scanner.nextDouble();
        if(x>=-5&& x<=-3 || x>=-1 && x<=1 || x>=3&&x<=5)
            System.out.println("принадлежит");
                else
                    System.out.println("не принадлежит");

    }

}
