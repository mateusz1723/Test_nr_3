package pl.kurs.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        FileServices fileServices = new FileServices();

        List<File> myJavaFiles = new ArrayList<>();
        fileServices.addFilesToList(new File("C:\\Users\\48504\\IdeaProjects"), myJavaFiles);
        for (File myJavaFile : myJavaFiles) {
            System.out.println(myJavaFile);
        }

        System.out.println();
        System.out.println(fileServices.printHeaviestJavaFile(myJavaFiles));

    }
}

