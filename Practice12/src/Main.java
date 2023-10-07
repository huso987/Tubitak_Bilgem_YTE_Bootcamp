import java.io.*;
import java.util.Random;


public class Main {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);


        }
    }
