public class Animal {
    void display(){
        System.out.println("animal are cold blooded and warm blooded.");
    }
    class SeaAnimal{
        public void show(){
            System.out.println("Sea animals are cold blooded animal.");
        }
    }
    class LandAnimal{
        public void show(){
            System.out.println("Sea animals are warm blooded animal.");
        }
    }


    public static void main(String[] args) {
        Animal a=new Animal();
        Animal.SeaAnimal s=a.new SeaAnimal();
        Animal.LandAnimal l=a.new LandAnimal();
        s.show();
        l.show();
    }
}
