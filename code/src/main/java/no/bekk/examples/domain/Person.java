package no.bekk.examples.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

import no.bekk.examples.service.mail.MailSender;

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