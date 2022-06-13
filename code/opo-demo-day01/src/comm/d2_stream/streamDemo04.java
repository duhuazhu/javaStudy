package comm.d2_stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class streamDemo04 {
    public static void main(String[] args) {

        List<employees> one = new ArrayList<>();
        one.add(new employees("邱若彤",30000.0,"女",500.5,"骂人"));
        one.add(new employees("杜",10000.0,"女",500.5,"骂人"));
        one.add(new employees("欧",20000.0,"女",500.5,"骂人"));
//        employees e =  one.stream().max(( o1,  o2) -> (int) (Double.compare(o1.getBonus()+ o1.getSalary(), o2.getBonus())+ o2.getSalary())).get();
        TopEmployees e =  one.stream().max((o1, o2) -> (int) (Double.compare(o1.getBonus()+ o1.getSalary(), o2.getBonus())+ o2.getSalary())).map(ee -> new TopEmployees(ee.getName(), ee.getSalary()+ee.getBonus())).get();
        System.out.println(e.toString());
    }
}
