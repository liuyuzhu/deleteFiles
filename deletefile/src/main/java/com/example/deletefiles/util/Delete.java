package com.example.deletefiles.util;

import java.io.File;

/**
 * .删除文件
 *
 * @author deyong_tong 童德勇 2019/6/16 21:16
 * @version V1.0
 */
public class Delete {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        File file = new File("C:\\Users\\deyong_tong\\Desktop\\a");

        String delFileName = "a";

        deleteFile(file, delFileName);
    }

    private static void deleteFile(File file, String delFileName) {

        if (file.isFile()) {
            if (file.getName().split("\\.")[0].equals(delFileName)) {
                file.delete();
            }
        } else if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f : files) {
                deleteFile(f, delFileName);
            }
        } else {
            System.out.println("文件不存在");
        }

    }
}
