public abstract class AbstractClass implements PreAbstractInterface {
    public abstract void abstractMethod();

    public AbstractClass(int iField) {
        this.iField = iField;
    }

    private int iField;
}
