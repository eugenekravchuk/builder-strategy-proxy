package bsp.task2;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    List<MailInfo> infos = new ArrayList<>();
    MailSender mailSender = new MailSender();

    public void addMailInfo(MailInfo object){
        infos.add(object);
    }

    public void sendAll() {
        for (MailInfo mailInfo : infos) {
            mailSender.sendMail(mailInfo);
        }
        infos.clear();
    }
}
