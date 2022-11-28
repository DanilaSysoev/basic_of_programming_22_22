package tests;

import code.MathFunctions;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class MathFunctionTests {
    private static List<Method> tests;

    public static void main(String[] args) throws Exception {
        BuildTestList();

        for (int i = 0; i < tests.size(); i++) {
            checkTest(tests.get(i));
        }
    }

    private static void BuildTestList() {
        tests = Arrays.stream(MathFunctionTests.class.getMethods()).
                        filter(method -> method.getName().startsWith("test")).toList();
    }

    private static void checkTest(Method test) throws Exception {
        if(!(Boolean) test.invoke(null))
            System.out.printf("%s fail\n", test.getName());
        else
            System.out.printf("%s ok\n", test.getName());
    }

    public static boolean test_square_positiveNumber_returnCorrectSquare() {
        double square = MathFunctions.square(12);
        return square == 144;
    }
    public static boolean test_square_negativeNumber_returnCorrectSquare() {
        double square = MathFunctions.square(-12);
        return square == 144;
    }
    public static boolean test_square_zeroNumber_returnCorrectSquare() {
        double square = MathFunctions.square(0);
        return square == 0;
    }

    public static boolean test_plus_bothPositive_returnCorrectSum() {
        double square = MathFunctions.plus(5, 8);
        return square == 13;
    }
}
