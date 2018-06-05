import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.LinkedList;

public class JSonParser{
    private String jsoString;
    private String update_id;
    private String chat_id;
    private String messageText;
    private Receiver receive;

    LinkedList<Receiver> messages = new LinkedList<Receiver>();

    public JSonParser(String jsoString) {
        this.jsoString = jsoString;
    }

    public void setJsoString(String jsoString) {
        this.jsoString = jsoString;
    }

    public LinkedList<Receiver> getMessages() throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        JsonNode actObj = mapper.readTree(jsoString);
            update_id = actObj.get("update_id").toString();
            chat_id = ((actObj.get("message")).get("chat")).get("id").toString();
            messageText = (actObj.get("message")).get("text").toString();
            receive = new Receiver(update_id,chat_id,messageText);
            messages.add(receive);


        return messages;
    }


}
