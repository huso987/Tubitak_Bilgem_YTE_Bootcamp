import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) throws IOException {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squarenumbers = numbers.stream().map(i -> i*i).distinct().collect(Collectors.toList());
        System.out.println(squarenumbers);


        }
    }
