/**
 * Descripción: Clase que hereda de Cuenta Bancaria y agrega el atributo balance.
 */
public class CuentaAhorros extends CuentaBancaria{
    private double balance;

    /**
     * Descripción: metodo constructor que inicializa el atributo balance en 0
     */
    public CuentaAhorros() {
        super();
        this.balance = 0;
    }

    /**
     * Descripción: metodo constructor que inicializa el atributo balance en segun el valor pasado por parametro
     * @param balance double monto inical de la cuenta.
     */
    public CuentaAhorros(double balance) {
        this.balance = balance;
    }

    /**
     *  Descripción: Metodo que suma una cantidad al atributo balance
     * @param amount double debe ser mayor a 0.
     */
    public void deposit(double amount){
        if(amount <=0){
            System.out.println("El valor a depositar debe ser mayor a 0");
        }else{
            balance += amount;
        }
    }

    /**
     *  Descripción: Metodo que hace un retiro del balance.
     * @param amount double no puede ser mayor al saldo actual de la cuenta.
     */
    public void withdrawal(double amount){
        if(amount >= this.balance){
            System.out.println("Saldo insuficiente");
        }else{
            balance -= amount;
        }
    }

    /**
     *  Descripción: Metodo para obtener el saldo de la cuenta
     * @return double con atributo balance
     */
    public double getBalance() {
        return balance;
    }

    
    @Override
    /**
     *  Descripción: Metodo que retorna un String con los datos generales de la cuenta.
     * @return  String 
     */
    public String toString() {
        return "CuentaAhorros numero: "+this.getAccountNumber()+" saldo: " + balance ;
    }
    
}