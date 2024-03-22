package KitapSırala;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<book> ts = new TreeSet<>();
        //5 tane nesne oluşturun ve nesneleri Set tipinde bir yapısında saklayınız.

        ts.add(new book("Şi'r-i Kadim","2016",153,"İskender Pala"));
        ts.add(new book("Kabus / Schrödinger'in Kedisi 1","2016",708,"Alev Alatlı"));
        ts.add(new book("Yalnızız","2016",416,"Peyami Sefa"));
        ts.add(new book("Tehlikeli Oyunlar","2022",479,"Oğuz Atay"));
        ts.add(new book("Amat","2023",239,"İhsan Oktay Anar"));


        System.out.println(" A'dan Z'ye Kitap Listesi ");
        System.out.println("**********************************");
        for (book book : ts) {
            System.out.println(book.getAuthorName()+" - "+book.getName() + " , " + book.getPageNumber());
        }
        System.out.println(" ");


        System.out.println("Sayfa Sayısına Göre Kitap Listesi ");
        System.out.println("***********************************");

        Set<book> newTreeSet = new TreeSet<>(new Comparator<book>() {
            @Override
            public int compare(book o1, book o2) {
                return o1.getPageNumber()- o2.getPageNumber();
            }
        });
        newTreeSet.addAll(ts);
        for (book book : newTreeSet) {
            System.out.println(book.getName() + ", " + book.getPageNumber());
        }




    }
}