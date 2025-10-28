public class Duck extends Animal implements Flyable, Swimable {
    public Duck(String name) {
        super(name);
    }

    public void makeSound(){
        System.out.println("Wok.. wok..");
    }

    public void fly(){
        System.out.println("Bisa terbang");
    }

    public void swim(){
        System.out.println("Bisa Berenang");
    }
}
