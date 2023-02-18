package com.huazhu.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class create {
    public static void main(String[] args) throws IOException {
        String directoryPath = "/Users/duhuazhu/Downloads/example.txt";//目录路径
        String content = "你是卧底";
            //创建目录 如果不存在
            File file = new File(directoryPath);
        System.out.println(file.createNewFile());
        try(FileWriter writer = new FileWriter(file)) {
                writer.write(content);
                writer.flush();
            }catch (IOException e) {
                e.printStackTrace();
            }

    }
}
