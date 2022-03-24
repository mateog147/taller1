import java.util.ArrayList;
import java.util.Arrays;
/**
 * Descripción: la clase Manzana hereda de Fruta y tiene como atributo mature que define si esta maduro o no. 
 */
public class Manzana extends Fruta{
    private boolean mature;

    /**
     * Descripción: Constructor de manzana, debe suministrar el valor boolean mature. por defecto se asigna el atributo name como Manzana y los colores posibles en rojo y verde.
     * @param mature atirbuto boleano para saber si la manzana esta madura. True para maduro.
     */
    public Manzana(boolean mature) {
        super();
        ArrayList<String> appleColors = new ArrayList<>(Arrays.asList("Rojo", "Verde"));
        this.name = "Manzana";
        this.mature = mature;
        this.colors = appleColors;
        this.setAverageWeight(200);
    }

    /**
     * Descripción: Metodo que retorna el valor del atributo mature.
     * @return mature atributo boleano.
     */
    public boolean isMature() {
        return mature;
    }

    /**
     * Descripción: Asigna valor al atributo mature.
     * @param mature atributo boleano.
     */
    public void setMature(boolean mature) {
        this.mature = mature;
    }

    
    @Override
    /**Descripción: Este metodo sobreescribe el de la super clase Fruta. No permite cambiar el valor del atributo. 
     * @param colors ArrayList con los colores 
     */
    public void setColors(ArrayList<String> colors) {
        
        System.out.println("No puede cambiar la lista de colores de la manzana");
    }

    
    

}
