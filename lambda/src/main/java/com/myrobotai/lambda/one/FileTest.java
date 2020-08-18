package com.myrobotai.lambda.one;

import java.io.File;
import java.io.FileFilter;

public class FileTest {
    public static void main(String[] args) {
        File[] hiddenFile = new File(".").listFiles(new FileFilter() {
            @Override
            public boolean accept(java.io.File pathname) {
                return pathname.isHidden();
            }
        });
        File[] hiddenFiles = new File(".").listFiles(File::isHidden);
        System.out.println( hiddenFile);
    }
}
