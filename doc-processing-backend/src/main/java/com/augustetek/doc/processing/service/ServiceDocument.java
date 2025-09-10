package com.augustetek.doc.processing.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.augustetek.doc.processing.dto.DocumentDTO;
import com.augustetek.doc.processing.entity.Document;
import com.augustetek.doc.processing.repository.DocumentRepository;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Slf4j
@Service
public class ServiceDocument {

    private final DocumentRepository documentRepository;

    @GetMapping
    public List<DocumentDTO> getAll() {
       List<Document> docs =  documentRepository.findAll();
       //TODO integrate mapstruct as mapper between entity and dto
      return docs.stream().map(d -> DocumentDTO.builder().build()).collect(Collectors.toList());

    }
}
