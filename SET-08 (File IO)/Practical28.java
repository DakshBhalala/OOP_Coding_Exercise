import java.io.*;
public class Practical28 {
    public static void main(String[] args) {
        String fileName = "data.txt";
        System.out.println("--- Text File Analyzer ---");
        createDummyFileIfNotExists(fileName);
        long lineCount = 0;
        long wordCount = 0;
        long charCountNoSpace = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;
                String trimmed = line.trim();
                if (!trimmed.isEmpty()) {
                    wordCount += trimmed.split("\\s+").length;
                }
                for (char c : line.toCharArray()) {
                    if (!Character.isWhitespace(c)) {
                        charCountNoSpace++;
                    }
                }
            }
            System.out.println("\n[Metrics for '" + fileName + "']");
            System.out.println("Total Lines      : " + lineCount);
            System.out.println("Total Words      : " + wordCount);
            System.out.println("Chars (no space) : " + charCountNoSpace);
        } catch (FileNotFoundException e) {
            System.err.println("Initialization Error: File '" + fileName + "' not found.");
        } catch (IOException e) {
            System.err.println("I/O Error: Issues while reading data -> " + e.getMessage());
        }
    }
    private static void createDummyFileIfNotExists(String fileName) {
        File targetFile = new File(fileName);
        if (!targetFile.exists()) {
            try (FileWriter fw = new FileWriter(targetFile)) {
                fw.write("Java is an object-oriented programming language.\n");
                fw.write("It relies heavily on abstractions and classes.\n");
                fw.write("File handling in Java is highly structured!\n");
                System.out.println("[Notice] Dummy test file created: " + fileName);
            } catch (IOException e) {
                System.err.println("Setup Error: Failed to generate dummy file.");
            }
        } else {
            System.out.println("[Notice] Located existing file: " + fileName);
        }
    }
}
