package comm.d2_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("���޼�");
        list.add("������");
        list.add("���");
        list.add("�Ƿ�");
        list.add("����");

//         list.stream().filter(s -> s.startsWith("��")).forEach(System.out::println);

        long count = list.stream().filter(s -> s.length() == 3).count();
        System.out.println(count);


        list.stream().filter(s -> s.startsWith("��")).limit(2).forEach(System.out::println);



        //map �ӹ�����
        list.stream().map(s -> "�����"+s).forEach(System.out::println);

        //�������Ʒ���ѧ������
        list.stream().map(Student::new).forEach(System.out::println);


        Stream<String> s1 = list.stream().filter(s -> s.startsWith("��"));
        Stream<String> s2 = Stream.of("Java1","Java2");
        Stream<String> s3 = Stream.concat(s1, s2);
        s3.forEach(System.out::println);


    }
}
