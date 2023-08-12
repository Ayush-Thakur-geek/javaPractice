package OOPS.Inheritance;

public class Box {
    double l;
    double w;
    double h;

//    double weight;

    static void greeting() {
        System.out.println("In the box");
    }

    Box () {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    Box (double size) {
        this.w = size;
        this.l = size;
        this.h = size;
    }

    Box (double l, double w, double h) {
//        super();
        System.out.println("Box class constructor");
        this.w = w;
        this.l = l;
        this.h = h;
    }

    Box (Box old) {
        this.w = old.w;
        this.l = old.l;
        this.h = old.h;
    }
    public void information() {
        System.out.println("Running the box");
    }

}
