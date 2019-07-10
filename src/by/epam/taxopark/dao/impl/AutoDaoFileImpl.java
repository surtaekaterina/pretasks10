package by.epam.taxopark.dao.impl;

import by.epam.taxopark.dao.AutoDao;
import by.epam.taxopark.entity.Auto;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;




public class AutoDaoFileImpl implements AutoDao {
    @Override
    public List<Auto> readAll() {

        List<Auto> taxopark = new LinkedList();


        try{
            FileInputStream file = new FileInputStream("C:/my/Auto.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(file));
            String strLine;
            while ((strLine = br.readLine()) != null) {
                System.out.println(strLine);

                }
        }catch (IOException e){
            System.out.println("Ошибка");
        }

        return taxopark;
    }
}
