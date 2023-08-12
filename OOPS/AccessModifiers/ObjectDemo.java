package OOPS.AccessModifiers;

public class ObjectDemo {

    int num;
    float val;

    public ObjectDemo(int num, float val) {
        this.num = num;
        this.val = val;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);

        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo(2, 1.2f);
        ObjectDemo obj2 = new ObjectDemo(2, 2.2f);
        if (obj1 == obj2) {
            System.out.println("obj1 = obj2");
        }
        if (obj1.equals(obj2)) {
            System.out.println("obj1 = obj2");
        }
        System.out.println(obj1.getClass().componentType());
    }
}
