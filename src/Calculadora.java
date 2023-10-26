import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int opcion = 0;
        Calcu calculadora = new Calcu(); // Crear una instancia de Calcu una vez

        System.out.println("Escoja 1 para suma");
        System.out.println("Escoja 2 para resta");
        System.out.println("Escoja 3 para multiplicación");
        System.out.println("Escoja 4 para división");

        try {
            opcion = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Error: Ingresa un número válido.");
            main(args);
            System.exit(0);
        }

        switch (opcion) {
            case 1:
                calculadora.Suma();
                System.out.println("Resultado de la suma: " + calculadora.getRes());
                break;
            case 2:
                calculadora.Resta();
                System.out.println("Resultado de la resta: " + calculadora.getRes());
                break;
            case 3:
                calculadora.Multiplicacion();
                System.out.println("Resultado de la multiplicación: " + calculadora.getRes());
                break;
            case 4:
                calculadora.Division();
                System.out.println("Resultado de la división: " + calculadora.getRes());
                break;
            default:
                System.out.println("Opción no válida. Por favor, elija una opción válida.");
                break;
        }
    }
}

