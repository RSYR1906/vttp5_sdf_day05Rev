package workshop;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LanguageModel {

    public static void main(String[] args) throws IOException {

        File f = new File(args[0]); // Read file

        // check if file exists
        if (!(f.exists() && f.isFile())) {
            System.err.printf("%s is not a file", args[0]);
        }

        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr); // reading the text file
        String line = null;
        ArrayList<String> wordsList = new ArrayList<>(); // creating ArrayList to store the text file

        while ((line = br.readLine()) != null) { // going through the text file line by line

            if (line.trim().isEmpty()) {
                continue;
            }
            line = line.replaceAll("\\p{Punct}", "");
            String[] words = line.split("\\s+");
            for (int i = 0; i < words.length - 1; i++) {
                String currWord = words[i];
                String nextWord = words[i + 1];
                System.out.printf("current word: %s , next word: %s\n", currWord, nextWord);
            }
        }
        HashMap<String, Map<String,Integer>> counter = new HashMap<>();


        br.close();
    }
}