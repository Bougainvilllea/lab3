import java.math.BigInteger;

import java.util.ArrayList;
import java.util.List;


public class PrimesGenerator {
    public List<Integer> list = new ArrayList<Integer>();
    public PrimesGenerator(Integer n){

        int i = 2;
        while(list.size() <= n) {
            int integer = i;
            BigInteger bigInteger = BigInteger.valueOf(integer);
            boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(integer));
            if (integer == 1){
                list.add(i);
            }
            i++;
            }

        }


    }
