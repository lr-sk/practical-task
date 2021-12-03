package itechart.tasks.task1.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MyFileReader {

    private static final Logger logger = LogManager.getLogger("MyFileReader");
    private static final String FILE_NAME = "input.txt";
    private static final URL FILE_URL = MyFileReader.class.getClassLoader().getResource(FILE_NAME);

    public static List<String> readFile(){

        File file = null;
        try {
            file = Paths.get(FILE_URL.toURI()).toFile();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String line = "";
        List<String> textListFromFile = new ArrayList<>();

        while(true){
            try {
                if (((line = br.readLine()) == null)) {
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            textListFromFile.add(line);
        }

        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return textListFromFile;
    }
}
