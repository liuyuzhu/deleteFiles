package com.example.deletefiles.util;

import java.io.File;
import java.util.*;

/**
 * .删除文件
 *
 * @author deyong_tong 童德勇 2019/6/16 21:16
 * @version V1.0
 */
public class Delete {

    public static Map<String, Integer> DELFILES = new HashMap<>();

    public static Map<String, Integer> delete(String projectPath, List<String> delFileNames){
        deleteFile(new File(projectPath), delFileNames);
        return DELFILES;
    }

    public static void main(String[] args) {
        System.out.println("删除开始!");
        File file = new File("C:\\Users\\deyong_tong\\Desktop\\a");
        List<String> delFileName = new ArrayList<>();
        delFileName.add("a");
        delFileName.add("b");
        deleteFile(file, delFileName);
        Set<String> keys = DELFILES.keySet();
        Iterator<String> iter = keys.iterator();
        System.out.println("已删除的文件有：");
        System.out.println("-------------------------------");
        System.out.println("|    文件名称   |" + "    文件数量   |");
        System.out.println("-------------------------------");

        while (iter.hasNext()) {
            String key = iter.next();
            System.out.println("|    "+key + "         |    " + DELFILES.get(key)+"        |");
            System.out.println("-------------------------------");
        }
        System.out.println("删除结束！");
    }

    public static void deleteFile(File file, List<String> delFileName) {

        if (file.isFile()) {
            String localFileName = file.getName().split("\\.")[0];
            for (String fileName : delFileName) {
                if (localFileName.equals(fileName)) {
                    if (DELFILES.containsKey(fileName)) {
                        DELFILES.put(fileName, DELFILES.get(fileName) + 1);
                    } else {
                        DELFILES.put(fileName, 1);
                    }
                    file.delete();
                }
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
