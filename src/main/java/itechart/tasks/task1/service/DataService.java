package itechart.tasks.task1.service;

import itechart.tasks.task1.dao.MyFileReader;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.List;

public class DataService {
    public static List<String> getData() {
        try {
            return MyFileReader.readFile();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> sortData() {
        List<String> sortedList = getData();
        Collections.sort(sortedList);
        return sortedList;
    }
}
