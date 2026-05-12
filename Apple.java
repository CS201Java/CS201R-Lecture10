public class Apple {
    double weight;

    public Apple(){
        this(1);
        System.out.println("Apple no-arg");
    }

    public Apple(double weight){
        this.weight = weight;
        System.out.println("Apple with weight");
    }

    @Override
    public String toString(){
        return "Apple " + weight;
    }
}
