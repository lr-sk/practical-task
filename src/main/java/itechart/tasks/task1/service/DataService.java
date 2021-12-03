package itechart.tasks.task1.service;

import itechart.tasks.task1.dao.MyFileReader;

import java.util.Collections;
import java.util.List;

public class DataService {
    public static List<String> getData() {
        return MyFileReader.readFile();
    }

    public static List<String> sortData() {
        List<String> sortedList = getData();
        Collections.sort(sortedList);
        return sortedList;
    }
}
