import java.util.Calendar;

/**
 * Descripción: Esta es la clase de entrada, dentro de esta se prueba el funcionamiento de las otras clases
 */
public class App {
    public static void main(String[] args) throws Exception {
        //prueba de la clase Cliente, que hereda de persona y tiene como atributo una instancia de la Clase cuenta de Ahorros.
        Cliente client1 = new Cliente();
        client1.setName("Pedro");
        client1.lastName1 = "Perez";
        client1.lastName2 = "Pino";
        client1.height = (float) 1.82;
        Calendar calendar = Calendar.getInstance(); // Obtiene una instancia de Calendar
        calendar.set(2000, 2, 28); // Asigna la fecha al Calendar
        client1.dateBirth =  calendar.getTime();
        //Pueba de la funcionalidad de cuenta de ahorros
        System.out.println(client1.getName());
        client1.getAccount().deposit(100);
        client1.printAccount();
        client1.getAccount().withdrawal(20);
        client1.printAccount();
        client1.getAccount().withdrawal(200);
        client1.printAccount();
        
        //prueba clase Manzana que hereda de Fruta
        Manzana apple = new Manzana(true);
        System.out.println("Fruta: " + apple.name);
        System.out.println("Colores posibles: " + apple.getColors());
    }
}
