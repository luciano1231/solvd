package com.solvd.mavenUberCarService.jsonparsing;
import com.fasterxml.jackson.databind.JsonNode;
import java.io.IOException;
import static com.solvd.mavenUberCarService.jsonparsing.Json.parse;


public class JsonRunner {
    public static void main(String[] arg) {
        String jsonSource= "{\"title\": \"Coder from Scratch\"}";
        try {
            JsonNode node = parse(jsonSource);
            System.out.println(node.get("title").asText());
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
