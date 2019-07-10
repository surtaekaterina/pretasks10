package by.epam.taxopark.dao.impl;

import by.epam.taxopark.dao.AutoDao;
import by.epam.taxopark.entity.Auto;

import java.util.LinkedList;
import java.util.List;

public class AutoDaoManualImpl implements AutoDao {
    @Override
    public List<Auto> readAll() {

        List<Auto> autoparkManual = new LinkedList<>();

        autoparkManual.add(new Auto(1, "mazda", 2.0, "red"));
        autoparkManual.add(new Auto(2, "audi", 2.0, "red"));
        autoparkManual.add(new Auto(3, "opel", 2.0, "red"));
        autoparkManual.add(new Auto(4, "mazda", 2.2, "blue"));
        autoparkManual.add(new Auto(5, "mazda", 2.2, "black"));

        return autoparkManual;

    }
}
