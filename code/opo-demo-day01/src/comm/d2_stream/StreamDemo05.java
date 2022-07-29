package comm.d2_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo05 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("张无忌");
        list.add("张无忌");
        list.add("周芷若");
        list.add("五峰");
        list.add("乔峰");
        list.add("虚竹");

        Stream<String> s1 = list.stream().filter(s -> s.startsWith("张"));
        List<String> zhangList = s1.collect(Collectors.toList());
        System.out.println(zhangList);
    }

}
