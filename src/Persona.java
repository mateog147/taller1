import java.util.Date;

public class Persona {
    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public float height;

    public String getName() {
        return "Nombre: " + name +" " + lastName1 + " "+  lastName2;
    }
    public void setName(String name) {
        if(name.equals("") || name.isEmpty()){
            System.out.println("El nombre debe contener por lo menos un caracter");
        }else{
            this.name = name;
        }
    }

    
}
