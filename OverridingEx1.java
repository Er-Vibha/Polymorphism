//Creating a parent class.
class As {
    void run() {
        System.out.println("This is A");
    }
}
//Creating child classes.
class Bs extends As{
        void run(){
            System.out.println("This is B");
        }
}
    class Cs extends As{
        void run(){
            System.out.println("This is C");
        }
    }
//Test class to create objects and call the methods  
class OverridingEx1{
    public static void main(String[] args) {
        As a = new As();
        Bs b=new Bs();
        Cs c=new Cs();
        a.run();
        b.run();
        c.run();
    }
}
