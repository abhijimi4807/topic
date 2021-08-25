package com.cosmos.util;

import com.cosmos.exception.TopicError;
import com.cosmos.exception.TopicNotAvailableException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class TopicControllerAdvice {
    @ExceptionHandler(TopicNotAvailableException.class)
    public ResponseEntity<TopicError> errorCreator(TopicNotAvailableException ex){
        log.error("Topic not available: "+ex.getMessage());
        TopicError topicError = new TopicError(HttpStatus.INTERNAL_SERVER_ERROR.value(),ex.getMessage());
        return new ResponseEntity<TopicError>(topicError, HttpStatus.INTERNAL_SERVER_ERROR);

    }
}
