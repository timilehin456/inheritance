class Animals{
    public void display(){
        System.out.println("animals");


    }
}

class Mammals extends Animals {
    public void details() {
        System.out.println("Mammals");

    }
}

class Dog extends Mammals {
    public void show() {
        System.out.println("Dogs");

    }
    public static void main(String[] args) {
        Dog input=new Dog();
        input.display();
        input.details();
        input.show();

    }
}