package comm.d2_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class streamTest1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        Collections.addAll(names, "������","���޼�","����","������","����");

      /*  //����
        List<String> names1 = new ArrayList<String>();

       for(String name : names){
           if(name.startsWith("��")){
               names1.add(name);
           }
       }
        List<String> names2 = new ArrayList<String>();
       for(String name : names1){
           if(name.length() ==3){
               names2.add(name);
           }
       }
        System.out.println(names2);*/

        names.stream().filter(s->s.startsWith("��")).filter(e->e.length()==3).forEach(s -> System.out.println(s));
    }
}
