package com.company;


public class ListQA {
    public static void main(String[] args) {
        List ml = new List();
        System.out.println("Метод добавления в конец" );
        ml.add2teil(256);
        ml.add2teil(2);
        ml.add2teil("Dima");
        System.out.println("Метод добавления в начало" );
        ml.add2head(6);
        ml.add2head(6);

        System.out.println("Метод удаления всех повторений" );
        ml.removeAll(6);
        System.out.println("Метод удаления одного значения" );
        ml.remove(256);
        System.out.println("Метод печатания листа" );
        ml.printList();
        System.out.println("Метод добавление точки с запятой" );
        ml.ToString();
        System.out.println("Метод получения обьекта по индексу" );
        ml.get(2);
        System.out.println("Метод получения индекса по обьекту" );
        ml.find("Dima");
        System.out.println("метод вывода логического аргумента если он присутсвует в списке" );
        ml.contains("Dima");
        System.out.println("метод реверса на листе" );
        ml.reverse();
        System.out.println("метод печатания перевернутого листа" );
        ml.printreverseList();

    }
}