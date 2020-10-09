package jacksonpractice.mongodb;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

import java.net.UnknownHostException;

public class MongoDB {
    private MongoClient mongoClient;
    private DB database;
    private DBCollection collection;

    public boolean connectToDB() {
        this.mongoClient = new MongoClient();
        if (this.mongoClient != null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean insertToDB(DBObject dataObject, String dbName, String dbCollection) throws UnknownHostException {
        boolean isInserted = true;
        if (dataObject == null) {
            isInserted = false;
        } else if (dbName == null) {
            isInserted = false;
        } else if (dbCollection == null) {
            isInserted = false;
        } else {
            this.database = this.mongoClient.getDB(dbName);
            this.collection = this.database.getCollection(dbCollection);
            if (this.collection.insert(dataObject) != null) {
                isInserted = true;
            } else {
                isInserted = false;
            }
        }
        return isInserted;

    }


}
