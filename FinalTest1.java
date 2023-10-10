class FTest1{
    final int a=10; //Final variable
    void run(){
        a=30; //Will give compile time error
    }
}
public class FinalTest1{
    public static void main(String[] args) {
    FTest1 f=new FTest1();
    f.run();
    }
}
