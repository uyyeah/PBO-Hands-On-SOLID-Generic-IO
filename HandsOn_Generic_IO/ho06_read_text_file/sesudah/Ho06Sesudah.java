import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

public class Ho06Sesudah {
    public static void main(String[] args) {
        Path path = Paths.get("employees.txt");
        try (BufferedReader br = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            br.lines().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}