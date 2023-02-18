package com.huazhu.file;

import java.io.File;

public class FileDelete {
    public static void main(String[] args) {
        String directoryPath = "/Users/duhuazhu/Downloads/filename.txt";//目录路径
        File file = new File(directoryPath);
        if (file.delete()) {
            System.out.println("File deleted successfully");
        } else {
            System.out.println("Failed to delete the file");
        }
    }
}
