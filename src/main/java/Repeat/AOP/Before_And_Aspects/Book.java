package Repeat.AOP.Before_And_Aspects;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    private String title;
    private String author;
    private int pages;

    public String getTitle() {
        return title;
    }
    @Value("Благодатный дождь")
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    @Value("Ибн-Каййим")
    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }
    @Value("400")
    public void setPages(int pages) {
        this.pages = pages;
    }
}
