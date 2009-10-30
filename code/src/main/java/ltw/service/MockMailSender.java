package ltw.service;

import org.springframework.stereotype.Service;

@Service
public class MockMailSender implements MailSender {

    public void sendMail(String emailAddress, String from) {
        System.out.println("Hi Mom! I just sent you an email. Heart U, "+from);
    }

}
