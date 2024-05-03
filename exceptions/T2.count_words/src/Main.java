import java.io.BufferedReader;
import java.io.FileReader;

/**
 * The type Main.
 */
public class Main
{
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws Exception the exception
     */
    public static void main(String[] args) throws Exception {
        String line;
        int count = 0;

        FileReader file = new FileReader("C:\\Users\\menna\\Desktop\\Lincon.txt");
        BufferedReader br = new BufferedReader(file);

        while((line = br.readLine()) != null) {
            String[] words = line.split("");
            count = count + words.length;
        }

        System.out.println("number of words: " + count);
        br.close();
    }
} 