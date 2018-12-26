package utils;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ProUtil {
    public String filePath;
    Properties properties;

    public ProUtil(String filePath) {
        this.filePath = filePath;
        this.properties = getPro();
    }

    public Properties getPro() {
        Properties prop = new Properties();
        try {
            InputStream inputStream = new FileInputStream(filePath);
            BufferedInputStream in = new BufferedInputStream(inputStream);
            prop.load(in);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }

    public String getProFileValue(String key) {
        return properties.getProperty(key);
    }
}
