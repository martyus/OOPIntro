public class Dog {

    private double weight;
    private double height;
    private String name;
    private String colour;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getName() {
        return name;
    }


    public Dog(double weight, double height, String name, String colour) {
        this.weight = weight;
        this.height = height;
        this.name = name;
        this.colour = colour;
    }
}
