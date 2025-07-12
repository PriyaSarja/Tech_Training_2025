package vvce;

class AC {
    public static void main(String[] args0){
        Animal1 c1 = new Cat1();
        c1.sounding();
        c1.walking();
      
    }
}
abstract class Animal1{
    abstract void sounding();
    abstract void walking();
}

class Cat1 extends Animal1{
    void sounding(){
        System.out.println("Meow");
    }
    void walking(){
        System.out.println("Paw paw");
    }
 
}

