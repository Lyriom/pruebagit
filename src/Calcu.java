import javax.swing.*;
import java.util.Scanner;

public class Calcu {
    public double num1;
    public double num2;
    public double res;
    public void Suma(double num1, double num2)
    {
        System.out.println( "Ingrese un numero");
        Scanner scanner = new Scanner(System.in);
        num1= scanner.nextDouble();
        System.out.println( "Ingrese un segundo numero");
        Scanner scanner2 = new Scanner(System.in);
        num2= scanner.nextDouble();
        res = num1 +num2;
    }
    public void Resta(double num1, double num2)
    {
        System.out.println( "Ingrese un numero");
        Scanner scanner = new Scanner(System.in);
        num1= scanner.nextDouble();
        System.out.println( "Ingrese un segundo numero");
        Scanner scanner2 = new Scanner(System.in);
        num2= scanner.nextDouble();
        res = num1-num2;
    }
    public void Multiplicacion(double num1, double num2)
    {
        System.out.println( "Ingrese un numero");
        Scanner scanner = new Scanner(System.in);
        num1= scanner.nextDouble();
        System.out.println( "Ingrese un segundo numero");
        Scanner scanner2 = new Scanner(System.in);
        num2= scanner.nextDouble();
        res = num1*num2;
    }
    public void Division(double num1, double num2)
    {
        System.out.println( "Ingrese un numero");
        Scanner scanner = new Scanner(System.in);
        num1= scanner.nextDouble();
        System.out.println( "Ingrese un segundo numero");
        Scanner scanner2 = new Scanner(System.in);
        num2 = scanner.nextDouble();
        if ( num2 == 0){
            System.out.println("no se puede hacer una division entre 0");
        }else {
            res = num1/num2;
        }
    }
public double getRes(){
        return res;
}

}
