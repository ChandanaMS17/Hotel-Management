import java.io.BufferedReader; 
import java.io.FileReader; 
import java.io.IOException; 
public class WordCount { 
public static void main(String[] args) { 
String filePath = "C:\\Users\\ADMIN\\OneDrive\\Documents\\10.pdf";  
int wordCount = 0; 
try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) { 
            String line; 
            while ((line = reader.readLine()) != null) { 
                 
                String[] words = line.split("\\s+"); 
                wordCount += words.length; 
            } 
        } catch (IOException e) { 
            System.out.println("Error reading the file: " + e.getMessage()); 
        } 
 
        System.out.println("Number of words in the file: " + wordCount); 
    } 
}