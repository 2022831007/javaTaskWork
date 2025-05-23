public class Dog {
    String name, breed;
    Dog(String name){
        this(name, "UnIdentified");
    }
    Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
    }
    public void bark(){
        System.out.println( name+" "+breed+" "+" is Barking");
    }
    public void spin(){
        System.out.println("It is Spinning");
    }
    public static void main(String[] args) {
        Dog dg1 = new Dog("shiro", "german Shepard");
        Dog dg2 = new Dog("Tummy");

        dg1.bark();
        dg1.spin();
        dg2.bark();
        dg2.spin();

    }
}
