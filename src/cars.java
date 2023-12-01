import java.util.ArrayList;

public class cars implements Cloneable {

    public ArrayList<String> carslist;

    @Override
    public String toString() {
        return "cars{" +
                "carslist=" + carslist +
                '}';
    }

    public cars(){
        carslist = new ArrayList<String>();
    }

    public cars(ArrayList<String> list){
        this.carslist = list;
    }

    public ArrayList<String> getcars(){
        return this.carslist;
    }

    public void addcars(String car){
        carslist.add(car);
    }

    public void loadcars(){
        carslist.add("Volvo");
        carslist.add("BMW");
        carslist.add("Ford");
        carslist.add("Mazda");
    }

    @Override
    public cars clone() throws CloneNotSupportedException{

        return new cars(this.carslist);
    }
}
