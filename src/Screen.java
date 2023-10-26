import javax.swing.*;
import java.util.Scanner;

public class Screen {
    public static void main(String[] args) {
        //lectura de datos
        System.out.println( "Ingrese un numero decimal");
        Scanner scanner = new Scanner(System.in);

        int numeroDecimal=0;
        //lecutura de datos
        try {
            numeroDecimal=scanner.nextInt();
        }catch (Exception e){
            System.out.println("Error capa 8");
            main(args);
            System.exit( 0);
        }

        //Transformar un numero decimal a si mismo
         String mensajeDec = "Numero decicimal de" + numeroDecimal +"=" + Integer.toString(numeroDecimal);
        System.out.println(mensajeDec);
        String mensajeBin = "Numero binario de" + numeroDecimal + "=" + Integer.toBinaryString(numeroDecimal);
        //Tranfromar un numero decimal a binario
        System.out.println(mensajeBin);
        //Tranfromar un numero decimal a octal
        String mensajeOc = "Numero octal de" + numeroDecimal + "=" + Integer.toOctalString(numeroDecimal);
        System.out.println(mensajeOc);
        //Tranfromar un numero decimal a hexadecimal
        String mensajeHex = "Numero hexadecimal de" + numeroDecimal + "=" + Integer.toHexString(numeroDecimal);
        System.out.println(mensajeHex);
        // Desplegar los valores capturados


        String mensaje= mensajeDec + "\n";
        mensaje += mensajeBin + "\n";
        mensaje += mensajeOc + "\n";
        mensaje += mensajeHex + "\n";

        System.out.println(mensaje);
        System.out.println("pruebaaaaaaaaaaaaaaaaaaa");
    }
}
