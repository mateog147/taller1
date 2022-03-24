    /**
     * Descripción: clase que contiene los datos basicos de una cuenta bancaria.
     */
public class CuentaBancaria {
    private static int id = 0;
    private int accountNumber;
    protected boolean activated;

    /**
     * Descripción: Constructor asigan un ID a la cuenta y por defecto la genera activa.
     */
    public CuentaBancaria() {
        /**
         * Id es el contador que asugnando numero a las cuentas de manera incremental.
         */
        this.accountNumber = id;
        id +=1;
        this.activated = true;
    }
    /**
     * Descripción: Metodo que retorna el estado de la cuenta.
     * @return boolean activated
     */
    public boolean isActivated() {
        return activated;
    }

    /**
     * Descripción: Metodo para asignar valor al atributo activated
     * @param activated boolean
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }
    /**
     * Descripción: Metodo que retorna el numero  de la cuenta.
     * @return int accountNumber
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Descripción: Metodo para asignar valor al atributo numero de cuenta.
     * @param accountNumber int
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    
}
