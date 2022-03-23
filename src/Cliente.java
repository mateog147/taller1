public class Cliente extends Persona{
    private CuentaAhorros account;

    public Cliente() {
        super();
        this.account = new CuentaAhorros();
    }
    
    public Cliente(double amount) {
        super();
        this.account = new CuentaAhorros(amount);
    }

    public void printAccount() {
        System.out.println(account.toString()); 
    }

    public CuentaAhorros getAccount() {
        return account;
    }
    

}
