import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            File myObj = new File("/Users/topspinppy/Desktop/Assignment-java/src/input.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] arrOfStr = data.split("\\|");
                Long round = (Long.parseLong(arrOfStr[1]) - Long.parseLong(arrOfStr[0])) + 1;
                Long first = Long.parseLong(arrOfStr[0]);
                
                FileWriter writer = new FileWriter("output.txt");
                for (int i = 0; i < round ; i ++) {
                    Long temp = first + i;
                    String dataResult = String.valueOf(temp);
                    writer.write(dataResult +"\n");
                }
                writer.close();
                System.out.println("Successfully wrote to the file.");
            }   
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
