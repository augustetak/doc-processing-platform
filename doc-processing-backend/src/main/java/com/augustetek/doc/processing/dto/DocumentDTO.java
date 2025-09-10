package com.augustetek.doc.processing.dto;

import java.time.Instant;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class DocumentDTO {

    private String filename;
    private String storagePath;
    private String status;
    private Instant uploadedAt;
}
