package com.augustetek.doc.processing.controller;

import com.augustetek.doc.processing.dto.DocumentDTO;
import com.augustetek.doc.processing.service.ServiceDocument;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/documents")
@RequiredArgsConstructor
public class DocumentController {

    private final ServiceDocument serviceDocument;

    @GetMapping
    public List<DocumentDTO> getAll() {
        return serviceDocument.getAll();
    }
}
