package models.books;

import lombok.Data;

import java.util.List;

@Data
public class AllBooksFromProfileResponseModel {

    private String userId, username;
    private List<BookModel> books;
}