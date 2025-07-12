package vvce;

public class Behaviour {

    public static void main(String[] args) {

        Animal a1=new Animal("A1",3);

        // System.out.println(a1.getName());

        // System.out.println(Animal.getNumberOfLegs(a1));

        Animal a2=new Animal("A2",3);

        // new Animal("",0);

        // System.out.println(Animal.getAnimalsAlive());

        Cat c1=new Cat("Meowthra","Persian");

        Cat c2=new Cat("Purrfecta","Ginger Stray");

        // System.out.println(c1.getCatsAlive());

        // System.out.println(Cat.getName(c1));

        Dog d1=new Dog("Snowy","Beagel");

        Dog d2=new Dog("Napi","Napolean Maschiff");

        // System.out.println(d2.getDogsAlive());

        // System.out.println(Animal.getAnimalsAlive());

        // System.out.println(d2.getName());

        System.out.println(d2.getAnimalsAlive());
    }
}

class Animal{

    protected String name;

    private int numberOfLegs;

    protected static int animalsAlive=0;

    public Animal(){}

    public Animal(String name, int numberOfLegs){

        this.name=name;

        this.numberOfLegs=numberOfLegs;

        this.animalsAlive++;

    }

    public static int getNumberOfLegs(Animal a){return a.numberOfLegs;}

    public String getName(){return this.name;}

    public static int getAnimalsAlive(){return animalsAlive;}

}

class Cat extends Animal{

    private String breed;

    private static int catsAlive=0;

    public Cat(String name, String breed){

        super(name, 4);

        this.breed=breed;

        catsAlive++;

    }
    public int getCatsAlive(){return catsAlive;}

    public String getBreed(){return this.breed;}

    public static String getName(Cat c){return c.name+" says 'Meow'";}

}

class Dog extends Animal{

    private String breed;

    private static int dogsAlive=0;

    public Dog(String name, String breed){

        super(name, 4);

        this.breed=breed;

        dogsAlive++;

    }

    public int getDogsAlive(){return dogsAlive;}

    public String getBreed(){return this.breed;}

    public String getName(){return this.name+" says 'Bhow'";}

}
