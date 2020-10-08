package MongoDB;

import ElasticSerach.ElasticSearch;
import Model.JSONData;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.mongodb.DBObject;
import com.mongodb.util.JSON;
import org.json.JSONObject;


import java.io.File;
import java.io.IOException;

public class JacksonT {
    final String fileLocation = "/Users/priyadeepjaswal/Downloads/613P001.2014.csv";

    public void defineSchema(MongoDB mongoDB, ElasticSearch elasticSearch) throws IOException {
        try {
            File csvFile = new File(fileLocation);
            MappingIterator<JSONData> jsonDataMappingIterator =
                    new CsvMapper().readerWithTypedSchemaFor(JSONData.class).readValues(csvFile);

            while (jsonDataMappingIterator.hasNext()) {
                JSONData jsonData = jsonDataMappingIterator.next();

                JSONObject json = new JSONObject(jsonData);
                DBObject dbObject = (DBObject) JSON.parse(json.toString());
                elasticSearch.insertDoc(json.toString());
                mongoDB.insertToDB(dbObject);


            }
        } catch (IOException e) {
            throw new IOException();
        }


    }
}



















