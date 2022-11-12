public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Karabaş","Kangal");
        Animal cat = new Cat ("Tekir");
        System.out.println(dog.animalInfo());
        System.out.println(cat.animalInfo());
    }
}