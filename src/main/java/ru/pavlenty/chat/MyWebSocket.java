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
                System.out.println("Ответ от сервера (пользователь нажал кнопку1) ");
                session.sendMessage(new TextMessage("Я пользователь 1, меня зовут Иван!"));
                break;
            case("2"):
                System.out.println("Ответ от сервера (пользователь нажал кнопку2) ");
                session.sendMessage(new TextMessage("Я пользователь 2, меня зовут Мария!"));
                break;
            case("3"):
                System.out.println("Ответ от сервера (пользователь нажал кнопку3) ");
                session.sendMessage(new TextMessage("Я пользователь 3, меня зовут Александр!"));
                break;
            case("4"):
                System.out.println("Ответ от сервера (пользователь нажал кнопку4) ");
                session.sendMessage(new TextMessage("Я пользователь 4, меня зовут Марина!"));
                break;
            default:
                System.out.println("Подключились к клиенту...");
        }
    }
}
