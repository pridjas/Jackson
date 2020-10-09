package jacksonpractice.elasticserach;


import org.apache.http.HttpHost;

import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;


import java.io.IOException;

public class ElasticSearch {


    private RestHighLevelClient client;


    public boolean configureConnection() {
        boolean result = true;
        this.client = new RestHighLevelClient(
                RestClient.builder(
                        new HttpHost("localhost", 9200, "http")));
        if (this.client == null) {
            result = false;
        }
        return result;
    }

    public boolean insertDoc(String jsonString, String id) {
        boolean isIndexed = true;

        try {
            if (jsonString == null) {
                isIndexed = false;
            } else if (id == null) {
                isIndexed = false;
            } else {
                IndexRequest request = new IndexRequest("weather");
                request.id(id);
                request.source(jsonString, XContentType.JSON);
                IndexResponse indexResponse = client.index(request, RequestOptions.DEFAULT);

                if (indexResponse == null) {
                    isIndexed = false;
                }
            }


        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Index Respones error");

        }
        return isIndexed;

    }

    public boolean closeConnection() {
        boolean isConnectionClosed = true;

        try {
            this.client.close();
            return true;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Client close error");
            return false;
        }

    }

}
