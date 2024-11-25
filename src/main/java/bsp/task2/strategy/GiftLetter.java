package bsp.task2.strategy;

import bsp.task2.Client;

public class GiftLetter implements LetterType {
    @Override
    public String generateContent(Client client) {
        return "Hello" + client.getName() + "! You've received a special gift from us. Enjoy!";
    }
}
