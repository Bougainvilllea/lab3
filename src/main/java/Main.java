import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ToDoList.collection(3);

        PrimesGeneratorTest test = new PrimesGeneratorTest(new PrimesGenerator(100));
        test.test(3);
    }
}
