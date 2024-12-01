package models.books;

import lombok.Data;

import java.util.List;

@Data
public class AddBooksCollectionRequestModel {

    private String userId;
    private List<IsbnModel> collectionOfIsbns;
}