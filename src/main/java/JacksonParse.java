import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.LinkedList;
public class JacksonParse {
    public static void main(String[] args) throws IOException {
        String jsonString = "[\n" +
                "  {\"update_id\":418672078,\"message\":\n" +
                "  {\"message_id\":24,\"from\":\n" +
                "  {\"id\":300759932,\"is_bot\":false,\"first_name\":\"Aslan\",\"last_name\":\"Sugarov\",\"language_code\":\"ru-ru\"},\n" +
                "    \"chat\":{\"id\":300759932,\"first_name\":\"Aslan\",\"last_name\":\"Sugarov\",\"type\":\"private\"},\n" +
                "    \"date\":1525940847,\"text\":\"/start\",\"entities\":[{\"offset\":0,\"length\":6,\"type\":\"bot_command\"}]}}]";
        String jsS = "{\"update_id\":83132086, \"message\":" +
                "{\"message_id\":110,\"from\":{\"id\":197457261,\"is_bot\":false,\"first_name\":\"Nikolay\",\"last_name\":\"Savin\",\"username\":\"ksavin22\",\"language_code\":\"en\"}," +
                "\"chat\":{\"id\":197457261,\"first_name\":\"Nikolay\",\"last_name\":\"Savin\",\"username\":\"ksavin22\",\"type\":\"private\"}," +
                "\"date\":1528204162,\"text\":\"Booii\"}}";
        BotInterfase botInterfase = new BotInterfase();
        System.out.println(botInterfase.initiate(jsS));
    }
}

