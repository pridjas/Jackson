import ElasticSerach.ElasticSearch;
import MongoDB.JacksonT;
import MongoDB.MongoDB;

import java.io.IOException;

public class JacksonPracticeProgram {
    public static void main(String[] args) {

        try {
            JacksonT jackson = new JacksonT();
            MongoDB mongoDB = new MongoDB();
            ElasticSearch elasticSearch = new ElasticSearch();
            elasticSearch.configureConnection();
            mongoDB.connectToDB();
            jackson.defineSchema(mongoDB, elasticSearch);
            elasticSearch.closeConnection();

        } catch (IOException e) {
            System.out.println("IO Exception");
            System.exit(-1);
        }
    }
}
