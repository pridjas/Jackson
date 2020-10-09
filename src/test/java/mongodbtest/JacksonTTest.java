package mongodbtest;

import jacksonpractice.elasticserach.ElasticSearch;
import jacksonpractice.mongodb.JacksonT;
import jacksonpractice.mongodb.MongoDB;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JacksonTTest {

    @Test
    public void testDefineSchema() {
        MongoDB mongoDB = new MongoDB();
        ElasticSearch elasticSearch = new ElasticSearch();
        JacksonT jacksonT = new JacksonT();
        mongoDB.connectToDB();
        elasticSearch.configureConnection();

         assertEquals(true, jacksonT.defineSchema (mongoDB, elasticSearch, "JacksonDB", "JacksonCollection"));


    }

}
