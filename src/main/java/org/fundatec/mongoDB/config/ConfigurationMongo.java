package org.fundatec.mongoDB.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;


@Configuration
public class ConfigurationMongo {

    @Bean
    public MongoClient mongoCliente(){
        return MongoClients.create("mongodb+srv://root:root@cluster0.9ir0p.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0");
    }

    @Bean
    public MongoTemplate mongoTemplate(MongoClient mongoCliente){
        MongoDatabase database = mongoCliente.getDatabase("cluster0");
        return new MongoTemplate(mongoCliente, database.getName());
    }
}
