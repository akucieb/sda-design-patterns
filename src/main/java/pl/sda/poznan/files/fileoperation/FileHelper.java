package pl.sda.poznan.files.fileoperation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileHelper {

    public static List<String> readAllLines(String path) {
        List<String> lines = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = null;
            while((line = br.readLine()) != null){
                lines.add(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return lines;
    }
    public static List<String> splitLinesIntoWords(List<String> lines){
        List<String> words = new ArrayList<>();
        for (String line : lines){
            words.addAll(Arrays.asList(line.split("\\s|\\, |\\. |\\.")));
        }
        return words;
    }
}
