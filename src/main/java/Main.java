import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        ToDoList.collection(15);

        PrimesGeneratorTest test = new PrimesGeneratorTest(new PrimesGenerator(10));
        test.test(3);
    }
}
