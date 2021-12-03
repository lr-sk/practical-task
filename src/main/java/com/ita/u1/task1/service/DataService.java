package com.ita.u1.task1.service;

import com.ita.u1.task1.dao.MyFileReader;

import java.util.Collections;
import java.util.List;

public class DataService {
    private MyFileReader myFileReader = new MyFileReader();

    public List<String> getData() {
        return myFileReader.readFile();
    }

    public List<String> sortData() {
        List<String> sortedList = getData();
        Collections.sort(sortedList);
        return sortedList;
    }
}
