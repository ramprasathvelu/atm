import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.FindIterable;
import org.bson.Document;

import java.time.LocalDateTime;

public class TransactionLogger {

    public static void logTransaction(String user, String type, int amount, int balance) {

        MongoDatabase db = MongoDBConnection.getDatabase();

        MongoCollection<Document> collection = db.getCollection("Transactions");

        Document doc = new Document("user", user)
                .append("type", type)
                .append("amount", amount)
                .append("balance", balance)
                .append("time", LocalDateTime.now().toString());

        collection.insertOne(doc);

        System.out.println("Transaction stored in MongoDB");
    }

    public static void showMongoDB(){

        MongoDatabase db = MongoDBConnection.getDatabase();

        MongoCollection<Document> collection = db.getCollection("Transactions");

        FindIterable<Document> docs = collection.find();

        System.out.println("----- TRANSACTIONS FROM MONGODB -----");

        for(Document d : docs){
            System.out.println(d.toJson());
        }
    }
}