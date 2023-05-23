package propertiesExtension;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Objects;
import java.util.Properties;

public class PropertiesFile {
    private Properties properties;
    private FileInputStream fileInputStream;

    public PropertiesFile() {
        properties = new Properties();
        try {
            fileInputStream = new FileInputStream("src/test/resources/testData/testDataValues.properties");
            properties.load(fileInputStream);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public HashMap getAllTestData(){
        HashMap<String, String> testData = new HashMap<>();

        for(Object Key : properties.keySet()){
            testData.put(Key.toString(), properties.getProperty(Key.toString()));
        }
        return testData;
    }
}
