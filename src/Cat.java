public class Cat extends Animal{
    Cat (String name){
        super( name,"Miyav");
        super.setInfoText("Kedi");
    }
    Cat (String name, String info){
        super(name, "Miyav", info);
    }
    public String animalInfo(){
        return super.animalInfo();
    }
}

