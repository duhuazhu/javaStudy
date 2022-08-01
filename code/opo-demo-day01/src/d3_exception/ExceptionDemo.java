package d3_exception;

import java.io.FileInputStream;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo {
    // throw Exception
    public static void main(String[] args)   {
        System.out.println("程序开始......");

        try {
            parseTime("2011-11-11 11:11:11");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println("程序结束......");

    }

    public static void parseTime(String date) throws Exception {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date d = sdf.parse(date);
            System.out.println(d);

            InputStream is = new FileInputStream("E:/meinv.jpg");
    }

}
