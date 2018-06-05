import java.io.IOException;

public class BotInterfase{
    public Receiver initiate(String jsonString) throws IOException {
        BotAnswer botAsk = new BotAnswer(jsonString);
        return botAsk.botAnswer();
    }
}
