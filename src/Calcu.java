import java.util.Scanner;

public class Calcu {
    public double num1;
    public double num2;
    public double res;

    public void getNumero1() {
        System.out.println("Ingrese un numero");
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextDouble();
    }
    public void getNumero2() {
        System.out.println("Ingrese un segundo numero");
        Scanner scanner = new Scanner(System.in);
        num2 = scanner.nextDouble();
    }
    public void Suma() {
        getNumero1();
        getNumero2();
        res = num1 + num2;
    }
    public void Resta() {
        getNumero1();
        getNumero2();
        res = num1 - num2;
    }
    public void Multiplicacion() {
        getNumero1();
        getNumero2();
        res = num1 * num2;
    }
    public void Division() {
        getNumero1();
        getNumero2();
        if (num2 == 0) {
            System.out.println("No se puede hacer una división entre 0");
        } else {
            res = num1 / num2;
        }
    }
    public double getRes() {
        return res;
    }
}
