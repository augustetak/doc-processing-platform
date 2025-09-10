package com.augustetek.doc.processing.controller;

import com.augustetek.doc.processing.entity.Document;
import com.augustetek.doc.processing.repository.DocumentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/documents")
@RequiredArgsConstructor
public class DocumentController {

    private final DocumentRepository documentRepository;

    @GetMapping
    public List<Document> getAll() {
        return documentRepository.findAll();
    }
}
