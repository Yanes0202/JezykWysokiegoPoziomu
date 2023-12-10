package org.zjazd.dziesiaty;

import lombok.Builder;

import java.util.ArrayList;
import java.util.List;

public class Zad1 {



    public static void main(String[] args) {
        List<Book> bookList1 = new ArrayList<>();

        List<Book> bookList2 = new ArrayList<>();

        for (int i = 0; i< 10; i++) {
            bookList1.add(Book.builder().id(i).idAuth(i).title("Ksiazka" + i).build());
            bookList2.add(Book.builder().id(i).idAuth(i).title("Ksiazka" + i).build());
        }

        List<Book> filteredList1 = new ArrayList<>(bookList1.stream().filter(book -> book.idAuth != 2).toList());
        List<Book> filteredList2 = bookList2.stream().filter(book -> book.idAuth == 2).toList();

         filteredList1.addAll(filteredList2);
        List<Book> s = filteredList1.stream().distinct().toList();
        s.forEach(book -> {
            System.out.println(book.id);
            System.out.println(book.idAuth);
            System.out.println(book.title);
        });
    }


}

@Builder
class Book {
    int id, idAuth;
    String title;


}
