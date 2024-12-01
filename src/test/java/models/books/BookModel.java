package models.books;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class BookModel {

    private String isbn, title, subTitle, author, publisher, description, website;

    @JsonProperty("publish_date")
    private String publishDate;

    private int pages;
}