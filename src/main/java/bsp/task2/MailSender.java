package bsp.task2;

public class MailSender {
    public void sendMail(MailInfo mailInfo){
        String content = mailInfo.getLetterType().generateContent(mailInfo.getClient());
        System.out.println("Sending mail to: " + mailInfo.getClient().getName());
        System.out.println("Mail content: " + content);
    }
}
