
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {

        String archivo1 = "D:\\Apache NetBeans\\Proyectos\\BalanceoParentesis\\texto1.txt";
        String archivo2 = "D:\\Apache NetBeans\\Proyectos\\BalanceoParentesis\\texto2.txt";

        String txt1 = leer(archivo1);
        System.out.println(txt1);
        System.out.println("¿Texto 1 Balanceado? " + Balanceo.Balanceo(txt1));

        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");

        String txt2 = leer(archivo2);
        System.out.println(txt2);
        System.out.println("¿Texto 2 Balanceado? " + Balanceo.Balanceo(txt2));
    }

    public static String leer(String direccion) {
        String texto = "";
        try {
            BufferedReader leer = new BufferedReader(new FileReader(direccion));
            String linea;
            while ((linea = leer.readLine()) != null) {
                texto += linea + "\n";
            }

        } catch (Exception e) {
            System.out.println("No se encontró el archivo");
        }
        return texto;
    }

}
