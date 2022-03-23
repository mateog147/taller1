public class CuentaAhorros extends CuentaBancaria{
    private double balance;

    public CuentaAhorros() {
        super();
        this.balance = 0;
    }
    public CuentaAhorros(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount <=0){
            System.out.println("El valor a depositar debe ser mayor a 0");
        }else{
            balance += amount;
        }
    }

    public void withdrawal(double amount){
        if(amount >= this.balance){
            System.out.println("Saldo insuficiente");
        }else{
            balance -= amount;
        }
    }
    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "CuentaAhorros numero: "+this.getAccountNumber()+" saldo: " + balance ;
    }
    
    



    


}