package comm.d2_stream;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class streamTest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Collections.addAll(names,"������","���޼�","������","����","��ǿ");
        //  System.out.println(names);

     /*   List<String>names1 = new ArrayList<>();
        for (String s : names) {
            if(s.startsWith("��")){
                names1.add(s);
            }
        }
        System.out.println(names1);
        */
        // �������ŵ�
        //names.stream().filter(s -> s.startsWith("��")).filter(s ->s.length() ==3 ).forEach(System.out::println);

        //����޶�2
        //names.stream().filter(s -> s.startsWith("��")).limit(2).forEach(System.out::println);

        //skip ��������
        // names.stream().filter(s -> s.startsWith("��")).skip(2).forEach(System.out::println);


      // names.stream().map(s -> "������" + s).forEach(System.out::println);
       /*  ������������
          ���������޼�
          ������������
          ����������
          ��������ǿ*/



    }
}