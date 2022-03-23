public class CuentaBancaria {
    private static int id = 0;
    private int accountNumber;
    protected boolean activated;

    
    public CuentaBancaria() {
        this.accountNumber = id;
        id +=1;
        this.activated = true;
    }
    public boolean isActivated() {
        return activated;
    }
    public void setActivated(boolean activated) {
        this.activated = activated;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    
}
