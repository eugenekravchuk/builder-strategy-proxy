package bsp.task2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Client {
    private static int counter = 0;
    private int id;
    private String name;
    private int age;
    private String sex;
}
