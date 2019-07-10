package by.epam.taxopark.service.impl;

import by.epam.taxopark.dao.AutoDao;
import by.epam.taxopark.dao.impl.AutoDaoFileImpl;
import by.epam.taxopark.dao.impl.AutoDaoManualImpl;
import by.epam.taxopark.entity.Auto;
import by.epam.taxopark.service.TaxoParkService;

import java.util.List;

public class TaxoparkServiceImpl implements TaxoParkService {

    //AutoDao autoparkFile = new AutoDaoFileImpl();
    AutoDao autoparkManual = new AutoDaoManualImpl();
    //AutoDao uatoparkDB = new AutoDaoSqlImpl();

    @Override
    public List<Auto> getAuto() {

        //return uatoparkDB.readAll();
        //return autoparkFile.readAll();
        return autoparkManual.readAll();

    }

}
