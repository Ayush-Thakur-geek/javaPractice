package OOPS.SingletonClasses;

public class mainSingleton {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance() ;

        Singleton obj1 = Singleton.getInstance() ;

        Singleton obj2 = Singleton.getInstance() ;
        System.out.println(obj1.a);
        System.out.println(Singleton.h());

        //All 3 ref variables are pointing to just one object

    }
}
