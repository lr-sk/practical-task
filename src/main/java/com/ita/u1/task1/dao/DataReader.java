package com.ita.u1.task1.dao;

import java.util.List;

public interface DataReader {
    <T> List<T> read();
}
