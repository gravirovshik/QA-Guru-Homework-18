package models.books;

import lombok.Data;

import java.util.List;

@Data
public class AllBooksFromStoreResponseModel {

    private List<BookModel> books;
}