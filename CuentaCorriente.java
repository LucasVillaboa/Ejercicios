/**
 * Created by admin on 30/8/2022.
 */
public class CuentaCorriente {
    double saldo;
    String nombreTitular;
    long numeroCuenta;

    public CuentaCorriente(){

    }

    public CuentaCorriente(double saldo, String nombreTitular) {
        this.saldo = saldo;
        this.nombreTitular = nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public void setNumeroCuenta(long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setIngreso(double saldo) {

        if(saldo>0){
            this.saldo=this.saldo+saldo;
        }
    }
    public void setReintegro(double saldo) {


        if (this.saldo >= saldo) {
            this.saldo -= saldo;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean transferencia(CuentaCorriente c, double n) {
        boolean correcto = true;
        if (n < 0) {
            correcto = false;
        } else if (saldo >= n) {
            c.setReintegro(n);
            c.setIngreso(n);
        } else {
            correcto = false;
        }
        return correcto;
    }
}
