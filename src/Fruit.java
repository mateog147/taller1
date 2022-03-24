import java.util.ArrayList;

/**
 * Descripción: Representa aspectos generales de las frutas como nombre, peso promedio y posibles colores.
 */
public class Fruit {
    public String name;
    private float averageWeight;
    public ArrayList<String> colors;

    /** 
     * Descripción: retorna un arreglo de String que contiene los colores de la fruta.
     * @return ArrayList<String> del atributo colors
    */
    public ArrayList<String> getColors() {
        return colors;
    }

    /**
     * Descripción: Asigna el Arraylist al atributo colors.
     * @param colors Arralist de String con los colores, no puede estar vacío.
     */
    public void setColors(ArrayList<String> colors) {
        if(colors.size() > 0){
            this.colors = colors;
        }else{
            System.out.println("El arreglo de colores no debe estar vacío");
        }
    }

    /**
     * Descripción: Imprime en consola un mensaje con el peso promedio de la furta.
     * @return retorn el atributo float: peso promedio
     */
    public float getAverageWeight() {
        System.out.println("El peso promedio es: " + Float.toString(averageWeight) + " g");
        return this.averageWeight;
    }

    /**
     * Descripción: Modifica el valor del atributo peso promedio.
     * @param averageWeight valor float debe ser mayor a 0.
     */
    public void setAverageWeight(float averageWeight) {
        if (averageWeight<=0) {
            System.out.println("El peso promedio debe ser mayor a 0");
        } else {
            this.averageWeight = averageWeight;
        }
        
    }

    
}
