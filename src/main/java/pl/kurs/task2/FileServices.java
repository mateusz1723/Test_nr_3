package pl.kurs.task2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

public class FileServices {
    private int monday;
    private int tuesday;
    private int wednesday;
    private int thursday;
    private int friday ;
    private int saturday;
    private int sunday ;


    public FileServices() {
    }

    public void addFilesToList(File dir, List<File> javaFiles) {
        if (dir == null || javaFiles == null)
            throw new NullPointerException("Pola nie moga byc null");

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


    public void printAmountOfJavaFilesCreatedInEveryWeek(List<File> fileList) throws IOException {
        if(fileList == null)
            throw new NullPointerException("Nie moze byc null");

        countCreatedFilesInEveryWeek(fileList);
        System.out.println(
                "Monday: " + this.monday + '\n' +
                        "Tuesday: " + this.tuesday + '\n' +
                        "Wednesday: " + this.wednesday + '\n' +
                        "Thursday: " + this.thursday + '\n' +
                        "Friday: " + this.friday + '\n' +
                        "Saturday: " + this.saturday + '\n' +
                        "Sunday: " + this.sunday
        );

    }

    private void countCreatedFilesInEveryWeek(List<File> fileList) throws IOException {
        for (File f : fileList) {
            Path path = Path.of(f.getPath());
            BasicFileAttributes bfa = Files.readAttributes(path, BasicFileAttributes.class);
            String time = bfa.creationTime().toString().substring(0, 10);
            LocalDate dayOfWeek = LocalDate.parse(time);

            if (dayOfWeek.getDayOfWeek().equals(DayOfWeek.MONDAY))
                this.monday++;
            if (dayOfWeek.getDayOfWeek().equals(DayOfWeek.TUESDAY))
                this.tuesday++;
            if (dayOfWeek.getDayOfWeek().equals(DayOfWeek.WEDNESDAY))
                this.wednesday++;
            if (dayOfWeek.getDayOfWeek().equals(DayOfWeek.THURSDAY))
                this.thursday++;
            if (dayOfWeek.getDayOfWeek().equals(DayOfWeek.FRIDAY))
                this.friday++;
            if (dayOfWeek.getDayOfWeek().equals(DayOfWeek.SATURDAY))
                this.saturday++;
            if (dayOfWeek.getDayOfWeek().equals(DayOfWeek.SUNDAY))
                this.sunday++;
        }
    }


}
