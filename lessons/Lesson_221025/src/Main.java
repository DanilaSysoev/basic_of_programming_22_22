import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
//        Parent.printClassInfo();
//        Child.printClassInfo();
//
//        Parent p = new Parent(10);
//        Child c = new Child(20, 15.0f);
//
//        p.staticPolymorphFunction(10.0f);
//        p.staticPolymorphFunction(10, 20);
//        p.staticPolymorphFunction(10.0f);
//        p.staticPolymorphFunction(10, 10.0f);
//
//        p.printInfo();
//        c.printInfo();
//
//        Parent[] objects = {
//            new Parent(10),
//            new Child(5, 5),
//            new Parent(7),
//            new Child(10, 8.5f)
//        };
//
//        for (var i: objects) {
//            i.printInfo();
//        }
        Sorter sorter = new SelectionSort();
        ArrayList<Integer> data = new ArrayList<>();
        data.add(5);
        data.add(2);
        data.add(1);
        data.add(3);
        data.add(8);

        printList(data);
        sorter.sort(data);
        printList(data);

        // AbstractClass a = new AbstractClass(10);
        writeTextToFile("data/out.txt", readTextFromFile("data/in.txt"));
    }

    private static void printList(ArrayList<Integer> data) {
        for(int i = 0; i < data.size(); ++i) {
            System.out.printf("%d ", data.get(i));
        }
        System.out.println();
    }

    private static String readTextFromFile(String path) throws IOException {
        InputStreamReader reader = new InputStreamReader(new FileInputStream(path));
        Scanner scanner = new Scanner(reader);
        String res = "";
        while (scanner.hasNext()) {
            res += scanner.nextLine() + '\n';
        }
        reader.close();
        return res;
    }

    private static void writeTextToFile(String path, String text) throws IOException {
        OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(path, true));

        writer.write(text);

        writer.close();
    }
}
