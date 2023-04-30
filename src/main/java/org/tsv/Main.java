package org.tsv;

import conf.ProjectConfiguration;
import model.Text;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import servicies.TextService;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        var text = new Text();
        text.setAuthor("Л.Н. Толстой");
        text.setText("4 тома Войны и Мира - занудство!");

        var commentService = context.getBean(TextService.class);
        commentService.workingProcess(text);
    }
}