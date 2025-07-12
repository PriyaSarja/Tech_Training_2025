package vvce;
//Object Up-casting
class FAS {
    public static void main(String[] args0){
        Father s1 = new Son();
        s1.Smoker(); 
        s1.Liar(); 
        s1.Jogger(); 
        //s1.Reader(); 
        //subclass method cannot be execute, cannot call functions of child class
    }
}
class Father{
    void Smoker(){
        System.out.println("Smoker");
    }
    void Liar(){
        System.out.println("A Liar");
    }
    void Jogger(){
        System.out.println("Jogs");
    }
}
class Son extends Father{
    void Smoker(){
        System.out.println("Chian Smoker");//method belongs from parent class 
        //parent method gets overridden
    }
    void Liar(){
        System.out.println("Big Liar");//method belongs from parent class 
        //parent method gets overridden
    }
    void Reader(){
        System.out.println("Reads");//hidden
    }
}

