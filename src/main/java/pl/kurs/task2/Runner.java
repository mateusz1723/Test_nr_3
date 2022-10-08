package pl.kurs.task2;

import javax.print.attribute.standard.DateTimeAtCreation;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Runner {
    public static void main(String[] args) throws IOException {

        FileServices fileServices = new FileServices();

        List<File> myJavaFiles = new ArrayList<>();
        fileServices.addFilesToList(new File("C:\\Users\\48504\\IdeaProjects"), myJavaFiles);
        for (File myJavaFile : myJavaFiles) {
            System.out.println(myJavaFile);
        }

        int size = myJavaFiles.size();
        System.out.println(size);

        fileServices.printAmountOfJavaFilesCreatedInEveryWeek(myJavaFiles);

        //Ilosc plikow zrobione w dni tygodnia :
        //Monday: 36
        //Tuesday: 67
        //Wednesday: 41
        //Thursday: 37
        //Friday: 29
        //Saturday: 65
        //Sunday: 59

    }
}

