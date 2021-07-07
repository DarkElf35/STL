package com.company;

public class Main {

    public static void main(String[] args) {

    }
}


class Item {
    Item next;
    Object value;
}

 class List {

    private Item head;
    private Item tail;


    void add2head(Object value)
    {
        Item a = new Item();
        a.value = value;

        if(head == null)
        {
            head = a;
            tail = a;
        }
        else {
            a.next = head;
            head = a;
        }
    }

    void add2teil(Object value) {
        Item a = new Item();
        a.value = value;
        if (tail == null)
        {
            head = a;
            tail = a;
        } else {
            tail.next = a;
            tail = a;
        }
    }



    void ToString()
    {
        Item t = head;
        while (t != null)
        {
            System.out.print(t.value + ";");
            t = t.next;
        }
    }



    void remove(Object value)
    {
        if(head == null)
            return;

        if (head == tail) {
            head = null;
            tail = null;
            return;
        }

        if (head.value == value) {
            head = head.next;
            return;
        }

        Item t = head;
        while (t.next != null) {
            if (t.next.value == value) {
                if(tail == t.next)
                {
                    tail = t;
                }
                t.next = t.next.next;
                return;
            }
            t = t.next;
        }
    }
    public void removeAll(Object value)
    {


        Item t = this.head;
        while (t != null) {
            if (t.value == value ) {
                head = head.next;


            }
            t = t.next;
        }

    }
    void printList()
    {
        Item t = head;
        while (t != null)
        {
            System.out.print(t.value + " ");
            t = t.next;
        }
    }
     Object get(int i) {
        int count=0;
         Item t = head;
         while (t != null)
         {
             if(i==count){
                 System.out.println("Ваш выбранный аргумент"+" : "+t.value );
                 break;

             }
             count++;

             t = t.next;

         }
         return count; }



       void reverse() {


         Item next = null, previous = null;

         while(head.next != null){
             next = head.next;
             head.next = previous;
             previous = head;
             head = next;

         }

         head.next = previous;
         System.out.println("\nРеверс отработал");

     }
       void printreverseList() {
         System.out.println("Вывод реверса");
         Item temp = head;
         while(temp.next != null){
             System.out.print(temp.value+" ");
             temp = temp.next;
         }
         System.out.print(temp.value+" ");
}
     int find (Object value){

         int count=0;
         int z=0;
         Item t = head;
         while (t != null)
         {
             if(value==t.value){
                 System.out.println("Позиция обьекта в списке"+" : "+count );
                 z++;
                 break;

             }

             count++;

             t = t.next;

         }
         if(z==0){
             System.out.print("Возвращаем : -1");
         }

         return count; }

  public  int contains (Object value){
        boolean logick=false;
        int i =1;
        int y =0;
        Item t = head;
        while (t != null)
        {
            if(value==t.value){
                logick=true;
                y++;
                System.out.print("Обьект найден"+" : "+logick );
                break;


            }



            t = t.next;

        }
      if(y==0){
          System.out.print("Обьект не найден");
      }
        return i;
    }
}






