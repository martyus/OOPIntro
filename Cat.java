public class Cat {
    //instance variables
    double weight;
    double height;
    private String name;
    String colour;

    Cat(){
        name = "Kitty";
        colour = "White";
    }

    Cat(String catName, String catColour){
        name = catName;
        colour = catColour;
    }

    void purr(){
        System.out.println("Purr purr");
    }

    public String getName(){
        return name;
    }

    String introduce(){
        return "My name is " + name;
    }
    String getColour(){
        return colour;
    }

}
