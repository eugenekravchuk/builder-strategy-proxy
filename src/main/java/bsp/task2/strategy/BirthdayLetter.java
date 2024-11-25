package bsp.task2.strategy;

import bsp.task2.Client;

public class BirthdayLetter implements LetterType {
    @Override
    public String generateContent(Client client) {
        return "Happy Birthday, " + client.getName() + "! Wishing you a wonderful year ahead.";
    }
}
