package wrapper;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        int x = 10;
        Integer a = x;///Boxing
        int i = a;// unboxing
        Integer p = 0;
        p.toString();
        Integer u = null;
//        u.toString();

//        System.out.println(p);
        Integer b = Integer.valueOf("10");
        // System.out.println(b);
        Double dWrap = new Double(12.34d);
        Double dWrap1 = 12.34d;
        Double dWrap2 = Double.valueOf("12.34d");

        Boolean bool = true;
        List<Integer> list = new ArrayList<>();
        list.add(13);
        list.add(67);
        list.add(87);
        list.add(100);
        for (Integer integer : list) {
            System.out.println(integer.compareTo(87));
        }

//        BigInteger bigInteger = new BigInteger("10");
//        System.out.println(bigInteger.sqrt().toString());
    }
}
