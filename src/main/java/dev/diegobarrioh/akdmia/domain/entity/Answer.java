package dev.diegobarrioh.akdmia.domain.entity;

import lombok.Data;

@Data
public class Answer {
    private Long id;
    private String text;
    private boolean ok;
}
