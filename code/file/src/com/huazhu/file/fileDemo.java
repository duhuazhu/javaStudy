package com.huazhu.file;
import java.io.*;

// 创造文件 文件夹
// 这里编写了 读 和 写入的代码
public class fileDemo {

    public static void main(String[] args)  {
        try {
            File file = new File("/Users/duhuazhu/Downloads/filename.txt");
//            BufferedReader br = new BufferedReader( new FileReader(file));
            if(file.exists()) {
                BufferedWriter bw = new BufferedWriter( new FileWriter(file,true));
                bw.write("hua zhu");
                bw.newLine();
                bw.write("haha zhu");
                bw.close();
            }else {
                System.out.println("找不到文件");
            }
        /*    String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
            br.close();*/
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
