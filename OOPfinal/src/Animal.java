public abstract class Animal implements Living {
    private String name;
    private String type;

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString()
    {
        return String.format("$%s$ Type : $%s$",getName(),getType());
    }

    public abstract String eating();

    public void Sound() throws Exception
    {

    }
}
