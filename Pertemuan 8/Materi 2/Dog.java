public class Dog extends Animal implements Swimable{
    public Dog(String name){
        super(name);
    }

    public void makeSound(){
        System.out.println("Guk..Guk..");
    }

    public void swim(){
        System.out.println("Bisa Berenang");
    }
}
