package com.cosmos.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long topicId;
    //Ex:OOPs,Framework,DB etc..
    private String technologyStack;
    //Ex:CoreJava,Spring etc..
    private String subjectName;
    //Ex:basics,programs etc..
    private String topicName;
    //Ex:static,final etc..
    private String topicDescription;
}
