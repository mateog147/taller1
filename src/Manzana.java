import java.util.ArrayList;
import java.util.Arrays;

public class Manzana extends Fruta{
    private boolean mature;

    public Manzana(boolean mature) {
        super();
        ArrayList<String> appleColors = new ArrayList<>(Arrays.asList("Red", "Green"));
        this.mature = mature;
        this.colors = appleColors;
        this.setAverageWeight(200);
    }

    public boolean isMature() {
        return mature;
    }

    public void setMature(boolean mature) {
        this.mature = mature;
    }

    @Override
    public void setColors(ArrayList<String> colors) {
        
        System.out.println("No puede cambiar la lista de colores de la manzana");
    }

    
    

}
