class Covariant{
    Covariant get(){return this;}
}
class CovariantReturnType extends Covariant {
    @Override
    CovariantReturnType get(){return this;}
    void msg(){
        System.out.println("Welcome");
    }
    public static void main(String[] args){
        new CovariantReturnType().get().msg();
    }
}
