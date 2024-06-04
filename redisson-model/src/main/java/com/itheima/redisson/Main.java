package com.itheima.redisson;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        String path = "D:\\Projects\\EclipseWorkspace\\redisson-model\\src\\test\\java\\com\\itheima\\redisson\\";
        String needRemoveStr = "【更多平价it资源dbbp.net】【综合资源站laomastudy.cn】【微信648765304】";
        File dir = new File(path);
        File[] listFiles = dir.listFiles();
        for (File file : listFiles) {
            file.renameTo(new File(path + file.getName().replace(needRemoveStr, "")));
            System.out.println(file.getName());
          
        }
    }
}