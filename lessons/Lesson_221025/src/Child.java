public class Child extends Parent {
    //private float fField;
    protected float fField;

    public Child(int iField, float fField) {
        super(iField);
        this.fField = fField;
    }

    public float getFField() {
        return fField;
    }
    public void setFField(float value) {
        fField = value;
    }

    @Override
    public void printInfo() {
        System.out.printf("Child: iField = %d, fField = %f\n", getIField(), fField);
    }

    public static void printClassInfo() {
        System.out.println("Child");
    }
}
