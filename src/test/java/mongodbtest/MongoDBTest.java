package mongodbtest;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.mongodb.DBObject;
import com.mongodb.util.JSON;
import jacksonpractice.model.JSONData;
import jacksonpractice.mongodb.MongoDB;
import org.json.JSONObject;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.net.UnknownHostException;

import static org.junit.Assert.assertEquals;

public class MongoDBTest {
    @Test
    public void testConnectToDB() {
        MongoDB mongoDB = new MongoDB();
        assertEquals(true, mongoDB.connectToDB());
    }

    @Test
    public void testInsertToDB() {


        final String fileLocation = "/Users/priyadeepjaswal/Downloads/613P001.2014.csv";
        File csvFile = new File(fileLocation);
        MappingIterator<JSONData> jsonDataMappingIterator = null;
        MongoDB mongoDB = new MongoDB();
        mongoDB.connectToDB();
        try {
            jsonDataMappingIterator = new CsvMapper().readerWithTypedSchemaFor(JSONData.class).readValues(csvFile);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        while (jsonDataMappingIterator.hasNext()) {
            JSONData jsonData = jsonDataMappingIterator.next();
            JSONObject json = new JSONObject(jsonData);
            DBObject dbObject = (DBObject) JSON.parse(json.toString());
            try {
                assertEquals(true, mongoDB.insertToDB(dbObject, "JacksonDB", "JacksonCollection"));
            } catch (UnknownHostException e) {
                System.out.println(e.getMessage());
            }

        }

    }
}
