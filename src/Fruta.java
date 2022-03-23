import java.util.ArrayList;

public class Fruta {
    public String name;
    private float averageWeight;
    public ArrayList<String> colors;

    public ArrayList<String> getColors() {
        return colors;
    }
    public void setColors(ArrayList<String> colors) {
        if(colors.size() > 0){
            this.colors = colors;
        }else{
            System.out.println("El arreglo de colores no debe estar vacío");
        }
    }
    public float getAverageWeight() {
        System.out.println("El peso promedio es: " + Float.toString(averageWeight) + " g");
        return this.averageWeight;
    }
    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }

    
}
