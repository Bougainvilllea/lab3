import java.util.ArrayList;
import java.util.List;


public class PrimesGenerator {
    public List<Integer> list = new ArrayList<Integer>();
    public PrimesGenerator(Integer n){


        int i = 2;
        while(list.size() <= n) {

            if ((i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) || i == 2 || i == 3 || i == 5 || i == 7)  {
                list.add(i);
            }
            i++;


        }


    }
}


