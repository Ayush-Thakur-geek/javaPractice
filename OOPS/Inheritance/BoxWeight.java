package OOPS.Inheritance;

public class BoxWeight extends Box {
    double weight;

//    @Override
    static void greeting() {
        System.out.println("In the box1");
    }

    public BoxWeight(BoxWeight other) {
        super(other);
    }

    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double l, double w, double h, double weight) {
        super(l, h, w); // call the parent class constructor
        // used to initiate values in parent class


//        System.out.println(super.weight);


        this.weight = weight;
    }
}
