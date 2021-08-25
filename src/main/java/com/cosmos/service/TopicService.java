package com.cosmos.service;

import com.cosmos.entity.Topic;
import com.cosmos.exception.TopicNotAvailableException;
import com.cosmos.pojo.Topics;
import com.cosmos.repository.TopicRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static java.util.Optional.empty;

@Service
@Slf4j
public class TopicService {
    @Autowired
    private TopicRepository topicRepository;
    public Topic addDummyTopic() {
        Topic topic = new Topic();
        topic.setTechnologyStack("OOPs");
        topic.setSubjectName("Core Java");
        topic.setTopicName("basics");
        topic.setTopicDescription("memory management");
        log.info("New topic to add: "+topic);
        return topicRepository.save(topic);
    }

    public Topic addTopic(Topic topic) {
        log.info("New topic to add: "+topic);
        return topicRepository.save(topic);
    }

    public Topics getAllTopics() {
        List topicList = topicRepository.findAll();
        Topics topics = new Topics();
        topics.setTopics(topicList);
        log.info("Entire topic list got called..");
        return topics;
    }

    public Topic getTopicByTopicId(Long topicId) {
        Optional<Topic> optionalTopic = topicRepository.findById(topicId);
        if(optionalTopic.isPresent()){
            log.info("Topic is available");
            return optionalTopic.get();
        }else
            throw new TopicNotAvailableException("This Topic not available");
    }
}
