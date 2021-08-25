package com.cosmos.exception;

public class TopicNotAvailableException extends RuntimeException {
    public TopicNotAvailableException() {
        super();
    }

    public TopicNotAvailableException(String topic_is_available) {
        super(topic_is_available);
    }

    public TopicNotAvailableException(String message, Throwable cause) {
        super(message, cause);
    }

    public TopicNotAvailableException(Throwable cause) {
        super(cause);
    }

    protected TopicNotAvailableException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
