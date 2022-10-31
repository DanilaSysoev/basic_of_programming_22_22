public class Parent {
    private int iField;

    public Parent(int iField) {
        this.iField = iField;
    }

    public int getIField() {
        return iField;
    }
    public void setIField(int value) {
        iField = value;
    }

    public void staticPolymorphFunction(int i) {
        System.out.println("one integer argument");
    }
    public void staticPolymorphFunction(int i1, int i2) {
        System.out.println("two integer arguments");
    }
    public void staticPolymorphFunction(float f) {
        System.out.println("one float argument");
    }
    public void staticPolymorphFunction(int i, float f) {
        System.out.println("one integer and one float arguments");
    }

    public void printInfo() {
        System.out.printf("Parent: iField = %d\n", iField);
    }

    public static void printClassInfo() {
        System.out.println("Parent");
    }
}
