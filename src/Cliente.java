/**
 * Descripción: Clase que extiende a persona y da la carateristica de ser un cliente bancario con una cuenta de ahorros.
 */
public class Cliente extends Persona{
    private CuentaAhorros account;

    /**
     * Descripción: Metodo constructor, crea la cuenta de ahorro con saldo 0.
     */
    public Cliente() {
        super();
        this.account = new CuentaAhorros();
    }
    
    /**
     * Descripción: Metodo constructor, crea la cuenta de ahorro con saldo amount.
     * @param amount valor double que representa el saldo inicial de la cuenta.
     */
    public Cliente(double amount) {
        super();
        this.account = new CuentaAhorros(amount);
    }

    
    /**
     * Descripción: Metodo para imprimir la información asociada a la cuenta de ahorros.
     */
    public void printAccount() {
        System.out.println(account.toString()); 
    }
    /**
     * Descripción: Metodo que retorna la instancia de CuentaAhorro asociada al objeto CLiente.
     * @return CuentaAhorros. 
     */
    public CuentaAhorros getAccount() {
        return account;
    }
    

}
