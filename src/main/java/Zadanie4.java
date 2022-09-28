import java.io.File;
import java.io.FileReader;

public class Zadanie4 {

    public static void main(String[] args) {
        File file = new File("Test2.txt");
        if (file.canWrite()){
            System.out.print(file.getAbsolutePath() + " Can write:) \n");
        }
        else
            System.out.print(file.getAbsolutePath() + " Cannot write :( \n");
        if (file.canRead()){
            System.out.print(file.getAbsolutePath() + " Can read :) \n");
        }
        else
            System.out.print(file.getAbsolutePath() + " Cannot read :( \n");
    }


}
