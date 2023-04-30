package repo;

import model.Text;
import org.springframework.stereotype.Repository;

@Repository
public class DBTextRepository implements TextRepository{
    @Override
    public void saveText(Text text) {
        System.out.println("Сохранен текст: " + text.getText());
    }
}
