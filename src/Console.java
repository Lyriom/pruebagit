import javax.swing.*;

public class Console {
    public static void main(String[] args) {
        //lectura de datos
        String numeroStr= JOptionPane.showInputDialog(null, "Ingrese un numero decimal");

        int numeroDecimal=0;
        //lecutura de datos
        try {
            numeroDecimal= Integer.parseInt(numeroStr);
        }catch (NumberFormatException e){
            JOptionPane.showInputDialog(null, "Error capa 8");
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

        JOptionPane.showInputDialog(null, mensaje);
    }
}
