package vvce;

public class Animals {
    public static void main(String[] args) {
        Pet myPet = new Pet();

        myPet.setName("Fluffy");
        myPet.setAge(3);
        myPet.setType("Cat");

        System.out.println("Pet Name: " + myPet.getName());
        System.out.println("Pet Age: " + myPet.getAge());
        System.out.println("Pet Type: " + myPet.getType());
}
    public static class Pet {
        private String name;
        private int age;
        private String type;

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public String getType() {
            return type;
        }
        public void setType(String type) {
            this.type = type;
        }
    }
}
