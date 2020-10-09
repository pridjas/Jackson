import jacksonpractice.elasticserach.ElasticSearch;
import jacksonpractice.mongodb.JacksonT;
import jacksonpractice.mongodb.MongoDB;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class JacksonPracticeProgram {
    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("/Users/priyadeepjaswal/Documents/JacksonPractice copy/src/main/resources/config.properties");
            Properties prop = new Properties();
            prop.load(input);
            String dbName = prop.getProperty("db.name");
            String dbCollection = prop.getProperty("db.collection");
            System.out.println(dbCollection + " " + dbName);
            JacksonT jackson = new JacksonT();

            MongoDB mongoDB = new MongoDB();
            ElasticSearch elasticSearch = new ElasticSearch();

            boolean elasticConfigConnection = elasticSearch.configureConnection();
            if (elasticConfigConnection == false) {
                System.exit(-1);
            }

            boolean isMongoConnected = mongoDB.connectToDB();
            if (isMongoConnected == false) {
                System.exit(-1);
            }

            boolean isInserted = jackson.defineSchema(mongoDB, elasticSearch, dbName, dbCollection);
            if (isInserted == false) {
                System.exit(-1);
            }

            boolean isConnectionClosed = elasticSearch.closeConnection();
            if (isConnectionClosed == false) {
                System.exit(-1);
            }
            System.exit(0);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Config File Error");
            System.exit(-1);
        }

    }
}
