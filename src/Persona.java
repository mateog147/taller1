import java.util.Date;

/**
 * Descripción: La clase persona describe los atributos basicos de una persona, nombres apellidos, fecha de nacimiento y altura.
 */
public class Persona {
    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public float height;


    /**
     * Descripción: metodo que retorna nombres y apellidos.
     * @return String con nombre y apellidos.
     */
    public String getName() {
        return "Nombre: " + name +" " + lastName1 + " "+  lastName2;
    }

    /**
     * Descripción: metodo para asignar valor al atributo name.
     * @param name no puede ser una cadena vacía.
     */
    public void setName(String name) {
        if(name.equals("") || name.isEmpty()){
            System.out.println("El nombre debe contener por lo menos un caracter");
        }else{
            this.name = name;
        }
    }

    
}
