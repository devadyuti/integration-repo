package net.ddhome.integration.spring.mongo.rest.service;

import com.mongodb.client.DistinctIterable;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.conversions.Bson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoDatabaseFactorySupport;
import org.springframework.stereotype.Component;

/**
 * @author devadyuti das
 */
@Component
public class BaseEntityService {
    @Autowired
    private MongoDatabaseFactorySupport mongoDatabaseFactorySupport;

    public void deleteCollection(String collection) {
        MongoDatabase mongoDatabase = mongoDatabaseFactorySupport.getMongoDatabase();
        MongoCollection mongoCollection = mongoDatabase.getCollection(collection);
        mongoCollection.drop();
    }

    public DistinctIterable distinct(String collection, String fieldName, Class className) {
        MongoDatabase mongoDatabase = mongoDatabaseFactorySupport.getMongoDatabase();
        MongoCollection mongoCollection = mongoDatabase.getCollection(collection);
        return mongoCollection.distinct(fieldName, className);
    }

    public DistinctIterable distinct(String collection, String fieldName, Bson filter, Class className) {
        MongoDatabase mongoDatabase = mongoDatabaseFactorySupport.getMongoDatabase();
        MongoCollection mongoCollection = mongoDatabase.getCollection(collection);
        return mongoCollection.distinct(fieldName, filter, className);
    }

    public DistinctIterable distinct(String db, String collection, String fieldName, Bson filter, Class className) {
        MongoDatabase mongoDatabase = mongoDatabaseFactorySupport.getMongoDatabase(db);
        MongoCollection mongoCollection = mongoDatabase.getCollection(collection);
        return mongoCollection.distinct(fieldName, filter, className);
    }

    public FindIterable find(String collection, Bson filter) {
        MongoDatabase mongoDatabase = mongoDatabaseFactorySupport.getMongoDatabase();
        MongoCollection mongoCollection = mongoDatabase.getCollection(collection);
        return mongoCollection.find(filter);
    }

    public FindIterable find(String collection, Bson filter, Class className) {
        MongoDatabase mongoDatabase = mongoDatabaseFactorySupport.getMongoDatabase();
        MongoCollection mongoCollection = mongoDatabase.getCollection(collection);
        return mongoCollection.find(filter, className);
    }

    public FindIterable find(String db, String collection, Bson filter, Class className) {
        MongoDatabase mongoDatabase = mongoDatabaseFactorySupport.getMongoDatabase(db);
        MongoCollection mongoCollection = mongoDatabase.getCollection(collection);
        return mongoCollection.find(filter, className);
    }
}
