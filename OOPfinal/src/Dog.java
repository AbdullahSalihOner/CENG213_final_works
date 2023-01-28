public class Dog extends Animal{

    public Dog(String name, String type) {
        super(name, type);
    }

    @Override
    public String eating() {
        return "köpek maması";
    }

    @Override
    public void Live(String a) {
        System.out.println(a);
    }
}
