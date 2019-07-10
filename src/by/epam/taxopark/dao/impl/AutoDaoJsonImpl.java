package by.epam.taxopark.dao.impl;

import by.epam.taxopark.dao.AutoDao;
import by.epam.taxopark.entity.Auto;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;


public class AutoDaoJsonImpl implements AutoDao {

    @Override
    public List<Auto> readAll() {


       /* try {

            Object obj = parser.parse(new FileReader("Auto.json"));
            JSONObject  jsonObject = (JSONObject) obj;


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        return null;
    }
}
