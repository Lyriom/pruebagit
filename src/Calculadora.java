import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        System.out.println("Escoja 1 suma");
        System.out.println("Escoja 2 resta");
        System.out.println("Escoja 3 multiplicacion");
        System.out.println("Escoja 4 division");
        Scanner scanner = new Scanner(System.in);
        int opcion=0;
        try {
            opcion= scanner.nextInt();
        }catch (Exception e){
            System.out.println("Error capa 8");
            main(args);
            System.exit( 0);
        }
        switch (opcion) {
            case 1:
                Calcu suma = new Calcu();
                suma.Suma(suma.num1, suma.num2);
                System.out.println(suma.res);
                break;
            case 2:
                Calcu resta = new Calcu();
                resta.Resta(resta.num1, resta.num2);
                System.out.println(resta.res);
                break;
            case 3:
                Calcu multi = new Calcu();
                multi.Multiplicacion(multi.num1, multi.num2);
                System.out.println(multi.res);
                break;
            case 4:
                Calcu div = new Calcu();
                div.Division(div.num1, div.num2);
                System.out.println(div.res);
                break;
            default:
        }
    }
}
