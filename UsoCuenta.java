/**
 * Created by admin on 31/8/2022.
 */
public class UsoCuenta {

    public static void main(String[]args){
        CuentaCorriente cuenta1 = new CuentaCorriente();
        CuentaCorriente cuenta2 = new CuentaCorriente(0,"titular Pedro Sanchez" );
        cuenta1.setNombreTitular(" Lucas Villaboa ");
        cuenta1.setNumeroCuenta(1);
        //ingreso 3000 a la cuenta
        cuenta1.setIngreso(3000);
        //ingreso 2000 a la cuenta
        cuenta1.setIngreso(2000);

        System.out.println("Titular de la cuenta " +cuenta1.getNombreTitular()+ "numero de cuenta "
                +cuenta1.getNumeroCuenta()+" saldo de la cuenta "+ cuenta1.getSaldo());
        //retiro 1000 de la cuenta
        cuenta1.setReintegro(1000);
        System.out.println("Titular de la cuenta " +cuenta1.getNombreTitular()+ "numero de cuenta "
                +cuenta1.getNumeroCuenta()+ " saldo de la cuenta "+ cuenta1.getSaldo());

        //Realiza transferencia cuenta1 a cuenta2
        System.out.println(" transferencia cuanta 1 a cuenta 2 ");
        cuenta1.transferencia(cuenta2,2500);
        System.out.println(" saldo cuenta 2 " +cuenta2.saldo + " titular "+ cuenta2.nombreTitular);

    }
}
