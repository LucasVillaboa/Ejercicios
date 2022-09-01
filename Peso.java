/**
 * Created by admin on 29/8/2022.
 */

public class Peso {


    private double altura;
    private String genero;

    public Peso(double altura, String genero) {
        this.altura = altura;
        this.genero = genero;
    }

    public double getAltura() {
        return altura;
    }

    public String getGenero() {
        return genero;
    }

    public void pesoSegungenero(){
        if(genero=="mujer"||genero=="Mujer") {
            double total = altura-120;
            System.out.println(" el peso ideal de una mujer de " + altura + " de altura es de " +total);
        }
        else if(genero=="hombre" || genero =="Hombre"){
            double total = altura-110;
            System.out.println(" el peso ideal de un hombre de " +altura+ " de altura es de " +total);
        }
    }
}

