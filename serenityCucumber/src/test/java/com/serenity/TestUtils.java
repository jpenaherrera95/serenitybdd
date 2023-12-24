package com.serenity;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;

public class TestUtils {
    private static final ObjectMapper objectMapper = new ObjectMapper();
    public static JsonNode getTestData(String filePath) throws IOException {
        try (InputStream inputStream = TestUtils.class.getClassLoader().getResourceAsStream(filePath)){
            if (inputStream == null) {
                throw new IOException("File not found: " + filePath);
            }
            return objectMapper.readTree(inputStream);
        }
    }
}
