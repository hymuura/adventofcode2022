package problem1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

/*
 * A X 1 L Rock
 * B Y 2 D Paper
 * C Z 3 W Scissors
 *
 * W 6
 * D 3
 * L 0
 * */
public class Problem2 {

    public static void main(String args[]) throws IOException {
        long start = System.currentTimeMillis();
        String fileName = "resources/problem-2.txt";
        File file = new File(fileName);
        System.out.println(file.getAbsolutePath());
        BufferedReader reader = new BufferedReader(new FileReader(file));
        HashMap<String, Integer> scores = loadValues2();

        try {
            String line;
            Integer scoreFinal = 0;
            while ((line = reader.readLine()) != null) {
                scoreFinal += scores.get(line);
            }
            System.out.println(scoreFinal);
        } finally {
            reader.close();
        }
        long finish = System.currentTimeMillis();
        System.out.println(finish - start);
    }

    //part one
    private static HashMap<String, Integer> loadValues(){
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("A X", 4);
        scores.put("A Y", 8);
        scores.put("A Z", 3);
        scores.put("B X", 1);
        scores.put("B Y", 5);
        scores.put("B Z", 9);
        scores.put("C X", 7);
        scores.put("C Y", 2);
        scores.put("C Z", 6);
        return scores;
    }

    //part two
    private static HashMap<String, Integer> loadValues2(){
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("A X", 3);
        scores.put("A Y", 4);
        scores.put("A Z", 8);
        scores.put("B X", 1);
        scores.put("B Y", 5);
        scores.put("B Z", 9);
        scores.put("C X", 2);
        scores.put("C Y", 6);
        scores.put("C Z", 7);
        return scores;
    }
}
