package servicies;

import model.Text;
import org.springframework.stereotype.Service;
import proxi.TextNotificationProxy;
import repo.TextRepository;

@Service
public class TextService {
    private final TextNotificationProxy textNotificationProxy;
    private final TextRepository textRepository;

    public TextService(TextNotificationProxy textNotificationProxy, TextRepository textRepository) {
        this.textNotificationProxy = textNotificationProxy;
        this.textRepository = textRepository;
    }

    public void workingProcess(Text text){
        textNotificationProxy.SendText(text);
        textRepository.saveText(text);
    }
}
