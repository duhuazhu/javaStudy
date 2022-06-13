package comm.d2_stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class streamDemo04 {
    public static void main(String[] args) {

        List<employees> one = new ArrayList<>();
        one.add(new employees("����ͮ",30000.0,"Ů",500.5,"����"));
        one.add(new employees("��",10000.0,"Ů",500.5,"����"));
        one.add(new employees("ŷ",20000.0,"Ů",500.5,"����"));
//        employees e =  one.stream().max(( o1,  o2) -> (int) (Double.compare(o1.getBonus()+ o1.getSalary(), o2.getBonus())+ o2.getSalary())).get();
        TopEmployees e =  one.stream().max((o1, o2) -> (int) (Double.compare(o1.getBonus()+ o1.getSalary(), o2.getBonus())+ o2.getSalary())).map(ee -> new TopEmployees(ee.getName(), ee.getSalary()+ee.getBonus())).get();
        System.out.println(e.toString());
    }
}
