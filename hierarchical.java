class mammal{
    public void display(){
        System.out.println("A mammal");


    }
}

class lion extends mammal{
    public void details() {
        System.out.println("lion is a mammal");

    }
}

class tiger extends mammal {
    public void show() {
        System.out.println("tiger is a mammal");

    }
    public static void main(String[] args) {
        lion input=new lion();
        input.display();
        input.details();



        tiger done=new tiger();
        done.show();
        done.display();






    }
}