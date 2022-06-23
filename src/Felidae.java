public class Felidae extends Animal{

    public Felidae() {
    }

    public Felidae(String name, Integer age, Double weight) {
        super(name, age, weight);
    }

    public void sound(){
        System.out.println("Meowing,meowing...");
    }
}
