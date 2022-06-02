import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	  Cat cat1 = new Cat("Agnes","grey");
	  cat1.purr();
	  cat1.getColour();
	  System.out.println(cat1.getName());

	  System.out.println(cat1.introduce());


	  Cat cat2 = new Cat();
	  //cat2.setName("Tom");
	  System.out.println(cat2.introduce());


	  Scanner sc = new Scanner(System.in);
    }
}
