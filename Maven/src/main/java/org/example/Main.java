package org.example;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

// will need to add real username and password to the connection string
public class Main {
    public static void main(String[] args) {
        MongoClient client = MongoClients.create("mongodb+srv://<yourUser>:<yourPassword>@cluster0.vpy6bvu.mongodb.net/?retryWrites=true&w=majority");

        MongoDatabase db = client.getDatabase("sampleDB");

        MongoCollection coll = db.getCollection("sampleCollection");

        Document sampleDoc = new Document("_id", "1").append("name", "Karmen Durbin");

        coll.insertOne(sampleDoc);
    }
}