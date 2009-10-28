package no.bekk.examples.service.mail.mock;

import org.springframework.stereotype.Service;

import no.bekk.examples.service.mail.MailSender;

@Service
public class MockMailSender implements MailSender {

    public void sendMail(String emailAddress, String from) {
        System.out.println("Hi Mom! I just sent you an email. Heart U, "+from);
    }

}
