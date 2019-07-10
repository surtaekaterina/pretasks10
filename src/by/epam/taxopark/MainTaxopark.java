/*6.	Таксопарк. Определить иерархию легковых автомобилей. Создать таксопарк.
Посчитать стоимость автопарка. Провести сортировку автомобилей парка по расходу топлива.
Найти автомобиль в компании, соответствующий заданному диапазону параметров.

Task 3/1
Для объектной модели, реализованной в задании 2.1, необходимо реализовать классы пользовательских исключений и организовать обработку возможных исключительных ситуаций, например, если элемент отсутствует в коллекции, если мы не можем удалить текущий элемент и т.д. Комментарии оставлять в классах исключений. Создать минимум 3 пользовательских исключения и использовать минимум 5 встроенных исключений.

Task 3/2
Дополнить сценарии, реализованные в задании 2.1 – добавить чтение данных из файла / запись данных в файл, используя I/O Streams.



4 Дополнить объектную модель, реализованную в рамках заданий 2.1, 3.1, 3.2. Добавить чтение данных из следующих источников:
- из базы данных (базу данных можно выбрать самостоятельно) с использованием jdbc – драйвера;
- из xml-файла или из json-файла (на выбор).
	Все источники данных должны реализовывать общий интерфейс или наследовать общий абстрактный класс.


*/

package by.epam.taxopark;

import by.epam.taxopark.entity.Auto;
import by.epam.taxopark.service.TaxoParkService;
import by.epam.taxopark.service.impl.TaxoparkServiceImpl;
import by.epam.taxopark.util.CulcCostAutopark;

import java.util.List;

public class MainTaxopark {
    public static void main(String[] args) {



        TaxoParkService taxoparkService = new TaxoparkServiceImpl();
        List<Auto> mycars  = taxoparkService.getAuto();
        System.out.println(mycars);

        int sumCost = CulcCostAutopark.culcCost(mycars);
        System.out.println(sumCost);




    }
}
