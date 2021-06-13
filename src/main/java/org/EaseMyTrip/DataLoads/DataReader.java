package org.EaseMyTrip.DataLoads;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataReader {


    @DataProvider(name="SearchFlight")
    //hashmaps,dataprovider, json, jackson,list
    public Object[][] getData() throws IOException {

        String jsonContent = FileUtils.readFileToString(new File(System.getProperty("user.dir")+"/src/main/java/org/EaseMyTrip/DataLoads/resrevationDetails.json"),
                StandardCharsets.UTF_8);

        ObjectMapper oM = new ObjectMapper();
        List<HashMap<String, String>> data = oM.readValue(jsonContent, new TypeReference<List<HashMap<String, String>>>() {
        });

        return new Object[][]
                {
                        { data.get(0)}
                };
    }
}
