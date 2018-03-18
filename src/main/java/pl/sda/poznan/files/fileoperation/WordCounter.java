package pl.sda.poznan.files.fileoperation;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        System.out.println("Word counter");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj sciezke do pliku");
        String path = scanner.next();
        List<String> lines = FileHelper.readAllLines(path);
        lines.forEach(System.out::println);
        List<String> words = FileHelper.splitLinesIntoWords(lines);
        words.forEach(System.out::println);
        Map<String,Integer> results = StringHelper.getWordsMap(words);
        results.forEach((k,v)->System.out.println(k + " -> " + v));

    }
}
