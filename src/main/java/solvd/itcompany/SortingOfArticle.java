package solvd.itcompany;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortingOfArticle {
    public static void main(String[] args) throws IOException {
        File article = new File("src/main/resources/dsarticle.txt");
        FileUtils.write(new File("src/main/resources/sortedarticle.txt"), sorter(article), "UTF-8");
    }

    public static String sorter(File file) throws IOException {
        Map<String, Integer> sortedWords = new HashMap<>();
        String text = FileUtils.readFileToString(file, "UTF-8").toLowerCase();
        Arrays.stream(StringUtils.split(text, " ”“.,-/\r\"\n–;")).forEach((word) -> {
            if (sortedWords.containsKey(word)) sortedWords.replace(word, sortedWords.get(word) + 1);
            else sortedWords.put(word, 1);
        });

        text = "";
        for (Map.Entry<String, Integer> entry : sortedWords.entrySet()) {
            String word = entry.getKey();
            Integer number = entry.getValue();
            text = text + word + "-" + number + "\n";
        }
        return text;
    }

}
