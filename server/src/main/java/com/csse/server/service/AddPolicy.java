package com.csse.server.service;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.MongoTemplate;

public interface AddPolicy {
    public void addPolicy(ObjectId id, float amount, MongoTemplate mongoTemplate);
}
