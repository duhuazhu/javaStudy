package comm.d2_stream;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo02 {
    public static void main(String[] args) {
            /*Collection ���ϻ�ȡ��*/
    Collection<String> list =new ArrayList<>();
        Stream<String> stream = list.stream();
        /*Map���ϻ�ȡ��*/
        Map<String,Integer> maps = new HashMap<>();
        //����
        Stream<String> keyStream = maps.keySet().stream();
        //ֵ��
        Stream<Integer> valuesStream = maps.values().stream();
        //��ֵ��(������)
        Stream<Map.Entry<String, Integer>> keyAndValueStream = maps.entrySet().stream();

        /*�����ȡ��*/
        String[]names = {"����","С��","���","������"};
        Stream<String> nameStream = Arrays.stream(names);
        Stream<String> nameStreams = Stream.of(names);
        nameStream.forEach(System.out::println);
    }
}
