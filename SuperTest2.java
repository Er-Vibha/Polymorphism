//super is used to refer immediate parent class instance variable.
class Color1{
    String color="Pink";
}
class Color2 extends Color1{
    String color = "Blue";
    void print(){
System.out.println(color);
        System.out.println(super.color);}
}
public class SuperTest2 {
    public static void main(String[] args) {
        Color2 c=new Color2();
        c.print();
    }
}
