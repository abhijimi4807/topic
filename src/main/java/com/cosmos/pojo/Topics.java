package com.cosmos.pojo;

import com.cosmos.entity.Topic;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Topics {
    private List<Topic> topics;
}
