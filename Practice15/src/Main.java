import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

class  Base{
    public void display() {
        System.out.println("Base Display()");
    }
}

public class Main extends  Base {
    public static void main(String[] args) throws IOException {
           Main obj = new Main();
           obj.display();

    }
    @Override
    public void display(){
        System.out.println("derived");
    }

    }
