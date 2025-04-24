class animal{
    public void show(){
        System.out.println("ANIMALS");
    }
}

class chicken extends animal{//single
    public void display(){
        System.out.println("A chicken is an animal");
    }
    public static void main(String[] args) {
        chicken input=new chicken();
        input.display();
        input.show();

    }

}
