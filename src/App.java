import java.util.Calendar;

public class App {
    public static void main(String[] args) throws Exception {
        Persona person = new Persona();
        person.setName("Pedro");
        person.lastName1 = "Perez";
        person.lastName2 = "Pino";
        person.height = (float) 1.82;
        Calendar calendar = Calendar.getInstance(); // Obtiene una instancia de Calendar
        calendar.set(2000, 2, 28); // Asigna la fecha al Calendar
        person.dateBirth =  calendar.getTime();
    }
}
