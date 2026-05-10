package krishnaprasath_assessment_3_1;

import java.io.*;
import java.util.*;

public class word_frequency {

	public static void main(String[] args) {

		TreeMap<String, Integer> map = new TreeMap<>();

		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Krishnaprasath\\Documents\\words.txt"));
			String line;

			while ((line = br.readLine()) != null) {

				String words[] = line.split(" ");

				for (String w : words) {

					if (map.containsKey(w)) {
						map.put(w, map.get(w) + 1);
					} else {
						map.put(w, 1);
					}
				}
			}

			br.close();

			
			for (String key : map.keySet()) {
				System.out.println(key + ": " + map.get(key));
			}

			System.out.println("Unique words: " + map.size());

		} catch (FileNotFoundException e) {
			System.out.println("Error: words.txt not found");
		} catch (IOException e) {
			System.out.println("Error reading file");
		}
	}
}
