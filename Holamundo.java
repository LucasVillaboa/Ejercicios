/**
 * Created by admin on 16/8/2022.
 */
import javax.swing.JOptionPane;
public class Holamundo {

    public static void main(String[]args){
        /*String texto = "Hola Mundo";
        System.out.println(texto);
        ingresar numero y sumarlos hasta que se ingrese una letra f
        puede ser con un equals
        git push para subir al repositorio

     */


        int a=Integer.parseInt(JOptionPane.showInputDialog(null,"Inserte el primer numero "));
        int b=Integer.parseInt(JOptionPane.showInputDialog(null,"Inserte el segundo numero"));

        int resultado=a+b;

        JOptionPane.showMessageDialog(null,"El resultado de la suma de " + a + " + " +b+ " es " + resultado);

        if(resultado>100){
            JOptionPane.showMessageDialog(null,+resultado+ " es mayor a 100");

        }


    }
}
