import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        try {
            byte bWrite[] = {47, 72, 53, 45, 65};
            OutputStream os = new FileOutputStream("test.txt");
            for (int x = 0; x < bWrite.length; x++){
                os.write(bWrite[x]);
            }
            os.close();
            InputStream is = new FileInputStream("test.txt");
            int size = is.available();
            for (int i = 0; i < size; i++){
                System.out.print((char) is.read() + " ");
            }
            is.close();
        }catch (IOException e){
                System.out.println("Exception");
            }
        }
    }
