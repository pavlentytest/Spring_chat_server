package ru.pavlenty.chat;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.AbstractWebSocketHandler;

import java.io.IOException;

public class MyWebSocket extends AbstractWebSocketHandler {
    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws IOException {
        String msg = message.getPayload();
        switch(msg){
            case("1"):
                System.out.println("User1 button was pressed");
                session.sendMessage(new TextMessage("Woooof"));
                break;
            case("2"):
                System.out.println("User2 button was pressed");
                session.sendMessage(new TextMessage("Meooow"));
                break;
            case("3"):
                System.out.println("User3 button was pressed");
                session.sendMessage(new TextMessage("Bork Bork"));
                break;
            case("4"):
                System.out.println("User4 button was pressed");
                session.sendMessage(new TextMessage("Fraka-kaka-kaka"));
                break;
            default:
                System.out.println("Connected to Client");
        }
    }
}
