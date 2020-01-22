package Homework6.Homework6_3;
/*Написать дженерик класс FilterApplicator который умеет обрабатывать коллекцию ЛЮБЫХ элементов и будет
иметь следующие методы:

 3.1. статический метод filter. У метода filter будет два параметра. 1 коллекция в которой будет происходить фильтрация,
  2 класс который реализует алгоритм фильтрации. И будет возвращать результат фильтрации

 3.2. статический ДЖЕНЕРИК МЕТОД sort который будет принимать 1 параметр коллекцию элементов реализующих интерфейс
 Comparable. И будет возвращать результат сортировки*/

import Homework6.Homework6_3.Filter;

import java.util.Collection;

public class FilterApplicator <T> {
    public static Collection filter(Collection collection, Filter filter) {
        filter.NumbersOff(collection);
        return collection;
    }
}




