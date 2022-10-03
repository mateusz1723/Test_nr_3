package pl.kurs.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        List<File> myJavaFiles = new ArrayList<>();
        addFilesToList(new File("C:\\Users\\48504\\IdeaProjects"), myJavaFiles);
        for (File myJavaFile : myJavaFiles) {
            System.out.println(myJavaFile);
        }

        System.out.println();
        System.out.println(printHeaviestJavaFile(myJavaFiles));

    }

    static void addFilesToList(File dir, List<File> javaFiles) {
        if(dir == null || javaFiles == null)
            throw new IllegalArgumentException("Pola nie moga byc null");

        if (!dir.isDirectory())
            return;

        File[] files = dir.listFiles();
        for (File f : files) {
            if (f.isDirectory())
                addFilesToList(f, javaFiles);
            else if (f.getName().endsWith(".java"))
                javaFiles.add(f);
        }
    }


    static File printHeaviestJavaFile(List<File> fileList){
        if(fileList == null)
            throw new IllegalArgumentException("Pola nie moga byc null");

            File heaviestFile = fileList.get(0);
            for (File f : fileList) {
                if (f.length() > heaviestFile.length())
                    heaviestFile = f;
            }
            return heaviestFile;

    }
    }

