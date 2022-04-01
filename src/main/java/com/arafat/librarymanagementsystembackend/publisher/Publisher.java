package com.arafat.librarymanagementsystembackend.publisher;

import com.arafat.librarymanagementsystembackend.book.Book;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Publisher {
    @Id
    @SequenceGenerator(
            name = "publisher_sequence",
            sequenceName = "publisher_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "publisher_sequence"
    )

    private Long publisherId;
    private String name;
    private String address;

    public Publisher(Long publisherId, String name, String address) {
        this.publisherId = publisherId;
        this.name = name;
        this.address = address;
    }

    public Publisher(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Publisher() {

    }

    public Long getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(Long publisherId) {
        this.publisherId = publisherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "publisherId=" + publisherId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
