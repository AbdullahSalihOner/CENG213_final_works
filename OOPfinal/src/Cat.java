

public class Cat extends Animal {


    private String catType;

    public Cat(String name, String type, String catType) {
        super(name, type);
        this.catType = catType;
    }

    public String getCatType() {
        return catType;
    }

    public void setCatType(String catType) {
        this.catType = catType;
    }

    @Override
    public String eating() {
        return "kedi maması";
    }

    @Override
    public void Live(String a) {
            System.out.println(a);
    }

    //Overload
    public void Sound(String a)
    {
        System.out.println(a);
    }


    @Override
    public String toString() {
        return super.toString() + "  Cat{" +
                "catType='" + catType + '\'' +
                '}';
    }
}
