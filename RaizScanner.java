/**
 * Created by admin on 29/8/2022.
 */
import java.util.Scanner;
public class RaizScanner {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numero, raiz;
        System.out.println(" introduce un nunmero: ");
        numero = teclado.nextDouble();
        raiz = Math.sqrt(numero);
        System.out.println(" la raiz de "+numero+ "es " +raiz);

    }

}