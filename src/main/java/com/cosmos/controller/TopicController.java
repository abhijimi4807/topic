package com.cosmos.controller;

import com.cosmos.entity.Topic;
import com.cosmos.pojo.Topics;
import com.cosmos.service.TopicService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/topic")
@Slf4j
public class TopicController {
    @Autowired
    private TopicService topicService;
    @GetMapping("/adddummy")
    public Topic addDummyTopic(){
        log.info("addDummyTopic got called");
        return topicService.addDummyTopic();
    }
    @GetMapping()
    public Topics getAllTopics(){
        log.info("getAllTopics got called");
        return topicService.getAllTopics();
    }
    @GetMapping("/{topicId}")
    public Topic getTopicByTopicId(@PathVariable Long topicId){
        log.info("getTopicByTopicId got called");
        return topicService.getTopicByTopicId(topicId);
    }
    @PostMapping
    public Topic addTopic(@RequestBody Topic topic){
        log.info("addTopic got called");
        return topicService.addTopic(topic);
    }
}
