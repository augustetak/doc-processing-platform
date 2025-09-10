package com.augustetek.doc.processing.repository;

import com.augustetek.doc.processing.entity.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<Document, Long> {
}
