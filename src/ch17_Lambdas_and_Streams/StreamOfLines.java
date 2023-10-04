package ch17_Lambdas_and_Streams;
// Counting word occurrences in a text file.
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StreamOfLines {
    public static void main(String[] args) throws IOException {
        // Kelimeleri ayırmak için kullanılacak regex deseni tanımlanıyor
        Pattern pattern = Pattern.compile("\\s+");

        // Kelime sayılarını depolamak için bir Map oluşturuluyor.
        // TreeMap kullanarak kelimelerin alfabetik sırayla sıralanmasını sağlıyoruz.
        Map<String, Long> wordCounts =
                Files.lines(Paths.get("src/ch17_Lambdas_and_Streams/Chapter2Paragraph.txt"))
                        .flatMap(line -> pattern.splitAsStream(line))
                        .collect(Collectors.groupingBy(String::toLowerCase,
                                TreeMap::new, Collectors.counting()));


        // Kelimeler, başlangıç harflerine göre gruplandırılıyor ve bir TreeMap içinde depolanıyor.
        Map<Character, Map<String, Long>> groupedByFirstLetter =
                wordCounts.entrySet()
                        .stream()
                        .collect(Collectors.groupingBy(
                                entry -> entry.getKey().charAt(0),
                                TreeMap::new,
                                Collectors.toMap(
                                        Map.Entry::getKey,
                                        Map.Entry::getValue,
                                        (existing, replacement) -> existing,
                                        TreeMap::new)));

        // Her harf grubu ve bu grupların içindeki kelimelerin sayıları ekrana yazdırılıyor.
        groupedByFirstLetter.forEach((letter, wordList) -> {
            System.out.printf("%n%c%n", letter);
            wordList.forEach((word, count) -> System.out.printf(
                    "%13s: %d%n", word, count));
        });
    }
}
