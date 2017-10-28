//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment1
//Matrik: #239527
//Name: #LeongShyeLi

package com.uum._a1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class countFiles {

    static ArrayList<String> files = new ArrayList<>();
    static String directory, path, fileName;

    public static String getPath() {
        String workingDirectory = System.getProperty("user.dir");

        countFiles fd = new countFiles();
        directory = fd.getClass().getPackage().getName();
        directory = directory.replace(".", "/");
        path = workingDirectory + File.separator + "/src/main/java/" + directory;
        return path;
    }

    public static int CountFileInFolder(int count) throws IOException {
        path = countFiles.getPath();
        File f = new File(path);
        for (File file : f.listFiles()) {
            String name = file.getName();
            if (name.endsWith(".java") && (!"countFiles.java".equals(name))) {
                count++;
                fileName = file.getCanonicalPath();
                files.add(fileName);
            }
        }
        return count;
    }

    public static int CountIssueInFolder(int countmainmethod) throws IOException {
        String main1 = "public static void main(String[] args)";
        String main2 = "public static void main(String args[])";
        path = countFiles.getPath();
         File f = new File(path);
        for (File file : f.listFiles()) {
            String name = file.getName();
            if (name.endsWith(".java") && (!"countFiles.java".equals(name))) {
                fileName = file.getCanonicalPath();
                files.add(fileName);

                FileReader readFile = new FileReader(fileName);
                BufferedReader br = new BufferedReader(readFile);
                String line = br.readLine();
                while (line != null) {
                    if (line.contains(main1) || line.contains(main2)) {
                        countmainmethod++;
                    }
                    line = br.readLine();
                }
                br.close();
            }
        }
        return countmainmethod;
    }

    public static void main(String[] args) throws IOException {
        int count = 0, countmainmethod = 0;
        countFiles javaFile = new countFiles();
        System.out.println("Number of java files = " + CountFileInFolder(count));
        System.out.println("Number of issue =" + CountIssueInFolder(countmainmethod));
    }//end main method

}//end class
