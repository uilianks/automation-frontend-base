package utils;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Utils {
    public static Map<String, String> map = new HashMap<String,String>();

    public String readFileProperties(String property){
        String propertyUse = "";
        try {
            FileInputStream fis = new FileInputStream("resources/config.properties"); //Change the path to your ChromeDriver.exe
            Properties prop = new Properties();
            prop.load(fis);
            propertyUse = prop.getProperty(property);
        }catch (Exception e){
            System.out.println("FileInputStream don't found");
        }
        return propertyUse;
    }

    public static void setVariable(String key, String value){
        map.put(key, value);
    }

    public static String getVariable(String key){
        return map.get(key);
    }

}
