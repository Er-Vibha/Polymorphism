//Method Overloading: changing data type of arguments
public class OverloadEx2 {
    static int Multi(int a, int b){
        return a*b;
    }
    static double Multi(double a, double b){
        return a*b;
    }

    public static void main(String[] args) {
        System.out.println(Multi(10,34));
        System.out.println(Multi(12.1, 15.2));
    }
}
