import java.util.Iterator;

public class PrimesGeneratorTest {
    public PrimesGenerator generator;

    public PrimesGeneratorTest(PrimesGenerator generator) {
        this.generator = generator;

    }
    public void test(Integer n) {
        Integer i = 0;
        Iterator<Integer> iterator = generator.list.iterator();
        while (i <= n) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();


    }
}
