package com.ita.u1.task1.dao.impl;

import com.ita.u1.task1.dao.DataReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MyFileReader implements DataReader {

    private final Logger logger = LogManager.getLogger("MyFileReader");
    private final String FILE_NAME = "input.txt";
    private final URL FILE_URL = MyFileReader.class.getClassLoader().getResource(FILE_NAME);

    public List<String> read(){
        List<String> textListFromFile = new ArrayList<>();
        String line;

        try {
            File file = Paths.get(FILE_URL.toURI()).toFile();
            FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            while (true) {
                if ((line = br.readLine()) != null) {
                    textListFromFile.add(line);
                } else {
                    break;
                }
            }
            br.close();
        } catch (URISyntaxException | IOException e) {
            logger.error("Something went wrong. Cannot read file");
            e.printStackTrace();
        }
        return textListFromFile;
    }
}
