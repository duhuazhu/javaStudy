package comm.d2_stream;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class streamTest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Collections.addAll(names,"张三丰","张无忌","周芷若","赵敏","张强");
        //  System.out.println(names);

     /*   List<String>names1 = new ArrayList<>();
        for (String s : names) {
            if(s.startsWith("张")){
                names1.add(s);
            }
        }
        System.out.println(names1);
        */
        // 过滤姓张的
        //names.stream().filter(s -> s.startsWith("张")).filter(s ->s.length() ==3 ).forEach(System.out::println);

        //最大限度2
        //names.stream().filter(s -> s.startsWith("张")).limit(2).forEach(System.out::println);

        //skip 跳过两个
        // names.stream().filter(s -> s.startsWith("张")).skip(2).forEach(System.out::println);


      // names.stream().map(s -> "花猪的" + s).forEach(System.out::println);
       /*  花猪的张三丰
          花猪的张无忌
          花猪的周芷若
          花猪的赵敏
          花猪的张强*/



    }
}
