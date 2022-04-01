package com.arafat.librarymanagementsystembackend.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/publisher")
public class PublisherController {
    private final PublisherService publisherService;

    @Autowired
    public PublisherController(PublisherService publisherService) {
        this.publisherService = publisherService;
    }

    @GetMapping
    public List<Publisher> getPublishers(){
        return publisherService.getPublishers();
    }

    @PostMapping
    public void addNewPublisher(@RequestBody Publisher publisher){
        publisherService.addNewPublisher(publisher);
    }
}
