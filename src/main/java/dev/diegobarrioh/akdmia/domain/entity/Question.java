package dev.diegobarrioh.akdmia.domain.entity;

import lombok.Data;

import java.util.List;

@Data
public class Question {
    private Long id;
    private String text;
    private List<Answer> answers;
}
