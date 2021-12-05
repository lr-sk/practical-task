package com.ita.u1.task1.service.impl;

import com.ita.u1.task1.dao.DataReader;
import com.ita.u1.task1.service.DataService;

import java.util.Collections;
import java.util.List;

public class SimpleDataService<T extends Comparable<? super T>> implements DataService{
    private final DataReader dataReader;

    public SimpleDataService(DataReader dataReader) {
        this.dataReader = dataReader;
    }

    public List<T> getData() {
        return dataReader.read();
    }

    public List<T> sortData() {
        List<T> sortedList = getData();
        Collections.sort(sortedList);
        return sortedList;
    }

}
