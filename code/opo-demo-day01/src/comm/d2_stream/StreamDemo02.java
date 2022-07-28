package comm.d2_stream;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo02 {
    public static void main(String[] args) {
            /*Collection 集合获取流*/
    Collection<String> list =new ArrayList<>();
        Stream<String> stream = list.stream();
        /*Map集合获取流*/
        Map<String,Integer> maps = new HashMap<>();
        //键流
        Stream<String> keyStream = maps.keySet().stream();
        //值流
        Stream<Integer> valuesStream = maps.values().stream();
        //键值对(拿整体)
        Stream<Map.Entry<String, Integer>> keyAndValueStream = maps.entrySet().stream();

        /*数组获取流*/
        String[]names = {"赵敏","小昭","灭绝","周芷若"};
        Stream<String> nameStream = Arrays.stream(names);
        Stream<String> nameStreams = Stream.of(names);
        nameStream.forEach(System.out::println);
    }
}
