package main.javaIO;

import java.io.File;
import java.io.IOException;

/**
 * Created by Bashark on 2016/12/7.
 */
public class ErgodicFile {
    static int count;

    public static void main(String[] args) throws IOException {

        File files = new File("C:");
//        System.out.println(files.canExecute());
//        System.out.println(files.canWrite());
//        System.out.println(files.getTotalSpace());
//        for (File file : files.listFiles()) {
//
//            System.out.println(file.getName());
//            System.out.println("this is file " + file.isFile());
//        }
        count = 0;
        ergodicFile(files);
        System.out.println("文件总数" + count);

    }

    public static void ergodicFile(File file) {
        File[] files = file.listFiles();
        if (files == null || !file.canExecute())
            return;

        for (File file1 : files) {

            if (file1.isFile()) {
                System.out.println("file " + file1.getName() + " path " + file1.getParent());
                count++;
            } else if (file1.isDirectory()) {
                ergodicFile(file1);
                System.out.println("director " + file1.getName() + " path " + file1.getParent());
            }

        }
    }

}
