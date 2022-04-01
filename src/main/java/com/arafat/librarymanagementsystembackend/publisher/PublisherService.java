package com.arafat.librarymanagementsystembackend.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class PublisherService {
    private final PublisherRepository publisherRepository;


    @Autowired
    public PublisherService(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    public List<Publisher> getPublishers(){
        return publisherRepository.findAll();
    }
    public void addNewPublisher(Publisher publisher){
        publisherRepository.save(publisher);
    }
}
