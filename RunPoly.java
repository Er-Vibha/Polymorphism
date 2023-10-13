//Runtime Polymorphism
class Bank{
    void rate(){
        System.out.println("Bank");
    }
}
class SBI extends Bank{
    void rate(){
        System.out.println("SBI");
    }
}
class ICICI extends Bank{
    void rate(){
        System.out.println("ICICI");
    }
}
class HDFC extends Bank{
    void rate(){
        System.out.println("HDFC");
    }
}
public class RunPoly {
    public static void main(String[] args) {
      Bank b;
        b=new SBI();
        b.rate();
        b=new ICICI();
        b.rate();
        b=new HDFC();
        b.rate();
        b=new Bank();
        b.rate();
    }
}
