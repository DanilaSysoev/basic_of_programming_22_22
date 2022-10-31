public interface InterfaceFeatures {
    void interfaceMethodWithoutDefault();
    default void interfaceMethodWithDefault(){
        System.out.println("Default actions");
    }

    private void privateMethod() {
        System.out.println("private method");
    }

    static void staticInterfaceMethod() {
        System.out.println("static interface method");
    }

    int PublicStaticConst = 10; // public static final
}
