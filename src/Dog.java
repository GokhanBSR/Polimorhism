public class Dog extends Animal {
    Dog (String name){
        super(name,"Hav Hav");
        super.setInfoText("Köpek");
    }
    Dog(String name, String info){
        super(name, " Hav Hav",info);
    }
    public String animalInfo(){
        return super.animalInfo();
    }
}
