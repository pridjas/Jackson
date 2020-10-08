package MongoDB;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

import java.net.UnknownHostException;

public class MongoDB {
    private MongoClient mongoClient;
    private DB database;
    private DBCollection collection;

    public void connectToDB() throws UnknownHostException {


        try {
            this.mongoClient = new MongoClient();
            this.database = mongoClient.getDB("JacksonDB");
            this.collection = database.getCollection("JacksonCollection");
        } catch (Exception e) {
            throw new UnknownHostException();
        }
    }

    public void insertToDB(DBObject dataObject) throws UnknownHostException {
        this.database = mongoClient.getDB("JacksonDB");
        this.collection = database.getCollection("JacksonCollection");
        this.collection.insert(dataObject);
    }


}
