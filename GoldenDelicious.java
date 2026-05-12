public class GoldenDelicious extends Apple {

    public GoldenDelicious(){
        this(5);
        System.out.println("GoldenDelicious no-arg");
    }

    public GoldenDelicious(double weight){
        this.weight = weight;
        System.out.println("GoldenDelicious with weight");
    }

    @Override
    public String toString(){
        return "GoldenDelicious " + weight;
    }
}