import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PrimesGenerator {
    public List<Integer> list = new ArrayList<Integer>();
    public PrimesGenerator(Integer n){
        Random random = new Random();

        int i = 2;
        while(list.size() <= n) {

            if ((n % 2 != 0 && n % 3 != 0 && n % 5 != 0 && n % 7 != 0) || n == 2 || n == 3 || n == 5 || n == 7)  {
                list.add(i);
            }
            i++;

        }
    }
}


