package comm.d2_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("五峰");
        list.add("乔峰");
        list.add("虚竹");

//         list.stream().filter(s -> s.startsWith("张")).forEach(System.out::println);

        long count = list.stream().filter(s -> s.length() == 3).count();
        System.out.println(count);


        list.stream().filter(s -> s.startsWith("张")).limit(2).forEach(System.out::println);



        //map 加工方法
        list.stream().map(s -> "花猪的"+s).forEach(System.out::println);

        //所有名称放入学生对象
        list.stream().map(Student::new).forEach(System.out::println);


        Stream<String> s1 = list.stream().filter(s -> s.startsWith("张"));
        Stream<String> s2 = Stream.of("Java1","Java2");
        Stream<String> s3 = Stream.concat(s1, s2);
        s3.forEach(System.out::println);


    }
}
