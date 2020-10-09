package elasticsearchtest;


import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import jacksonpractice.elasticserach.ElasticSearch;
import jacksonpractice.model.JSONData;
import org.json.JSONObject;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class ElasticSearchTest {
    @Test
    public void testConfigureConnection() {
        ElasticSearch elasticSearchTest = new ElasticSearch();

        assertEquals(true, elasticSearchTest.configureConnection());
    }

    @Test
    public void testInsertDoc() {
        ElasticSearch elasticSearchTest = new ElasticSearch();

        final String fileLocation = "/Users/priyadeepjaswal/Downloads/613P001.2014.csv";
        File csvFile = new File(fileLocation);
        MappingIterator<JSONData> jsonDataMappingIterator =
                null;
        try {
            jsonDataMappingIterator = new CsvMapper().readerWithTypedSchemaFor(JSONData.class).readValues(csvFile);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        while (jsonDataMappingIterator.hasNext()) {
            JSONData jsonData = jsonDataMappingIterator.next();
            JSONObject json = new JSONObject(jsonData);
            assertEquals(true, elasticSearchTest.insertDoc(json.toString(), jsonData.getLocalDateValue()));

        }
    }

    @Test
    public void testCloseConnection() {
        ElasticSearch elasticSearchTest = new ElasticSearch();
        assertEquals(true, elasticSearchTest.closeConnection());
    }

}
