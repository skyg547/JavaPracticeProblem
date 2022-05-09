package CollectionFrameWork;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExamples {

    public static void main(String[] args) throws Exception {
        Properties prop = new Properties();
        String path = PropertiesExamples.class.getResource("database.properties").getPath();
        path = URLDecoder.decode(path, "UTF-8");
        prop.load(new FileReader(path));

        String driver = prop.getProperty("driver");
        String url = prop.getProperty("url");
        String username = prop.getProperty("username");
        String password = prop.getProperty("password");

        System.out.println("driver: " + driver);
        System.out.println("url: " + url);
        System.out.println("username: " + username);
        System.out.println("password: " + password);

    }
}
