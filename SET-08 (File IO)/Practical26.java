import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Practical26 {
    public static void main(String[] args) {
        System.out.println("--- FIle Analysis Tool ---");
        if (args.length < 1) {
            System.err.println("Usage Error: Please provide the target file path via command-line arguments.");
            System.err.println("Example: java Practical26 sample.txt");
            return;
        }
        String fileName = args[0];
        long charCount = 0;
        long wordCount = 0;
        long lineCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                String trimmedLine = line.trim();
                if (!trimmedLine.isEmpty()) {
                    String[] words = trimmedLine.split("\\s+");
                    wordCount += words.length;
                }
            }
            System.out.println("\n[Analysis Results for '" + fileName + "']");
            System.out.println("Total Lines      : " + lineCount);
            System.out.println("Total Words      : " + wordCount);
            System.out.println("Total Characters : " + charCount);
        } catch (IOException e) {
            System.err.println("File I/O Error: Unable to access or read '" + fileName + "'.");
            System.err.println("Details: " + e.getMessage());
        }
    }
}
