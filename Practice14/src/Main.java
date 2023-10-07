import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) throws IOException {
       List<String> strings = Arrays.asList("abc", "", "bc", "efg");
       long count  = strings.stream().filter(string -> !string.isEmpty()).count();
       System.out.println(count);


        }
    }
