package ElasticSerach;

import com.mongodb.util.JSON;
import org.apache.http.HttpHost;
import org.apache.http.util.EntityUtils;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.*;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.json.JSONObject;

import java.io.IOException;

public class ElasticSearch {


    private RestHighLevelClient client;


    public void configureConnection() {
        this.client = new RestHighLevelClient(
                RestClient.builder(
                        new HttpHost("localhost", 9200, "http"),
                        new HttpHost("localhost", 9201, "http")));
    }

    public void insertDoc(String jsonString) throws IOException {

        try {
            IndexRequest request = new IndexRequest("weather");
            request.id("1");
            request.source(jsonString, XContentType.JSON);
            IndexResponse indexResponse = client.index(request, RequestOptions.DEFAULT);
            System.out.println(indexResponse);
        } catch (IOException e) {
            throw new IOException();
        }

    }

    public void closeConnection() throws IOException {
        try {
            this.client.close();
        } catch (IOException e) {
            throw new IOException();
        }

    }

}
