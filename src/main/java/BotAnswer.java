import java.io.IOException;
import java.util.LinkedList;

public class BotAnswer{

    private String jsonString;

    public BotAnswer(String jsonString) {
        this.jsonString = jsonString;
    }

    public Receiver botAnswer() throws IOException {

        RandomArticle ran = new RandomArticle();
        JSonParser jSonParser = new JSonParser(jsonString);
        LinkedList<Receiver> messages;
        CommandsTest commands;
        String ask,answer = "";
        messages = jSonParser.getMessages();
        Receiver reqwest = messages.get(0);

        for (Receiver message:messages) {
            commands = new CommandsTest(message.getText());
            ask = commands.checCommand();
            reqwest = message;
            if(ask.equals("Next article")){
                answer =(ran.getRandomArticle()).toString();
                reqwest.setAnswer(answer);
            }
            else reqwest.setAnswer(ask);
        }
        return reqwest;
    }


}
