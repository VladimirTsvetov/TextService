package proxi;

import model.Text;
import org.springframework.stereotype.Component;

@Component
public class MailTextNotificationProxy implements TextNotificationProxy{
    @Override
    public void SendText(Text text) {
        System.out.println("В издатесльство отправлен почтой текст: " + text.getText());
    }
}
