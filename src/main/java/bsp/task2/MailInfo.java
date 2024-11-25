package bsp.task2;

import bsp.task2.strategy.LetterType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class MailInfo {
    private Client client;
    private LetterType letterType;
}