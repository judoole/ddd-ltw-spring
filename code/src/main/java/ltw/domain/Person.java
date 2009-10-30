package ltw.domain;

import ltw.service.MailSender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

@Configurable
public class Person {
    @Autowired
    private MailSender mailSender;
    private String name;
    private String emailAddressMom;

    public Person(String name, String emailAddressMom) {
        this.name = name;
        this.emailAddressMom = emailAddressMom;
    }
    
    public void sendMailToMom(){
        mailSender.sendMail(emailAddressMom, name);
    }
}