package ltw.domain;

import ltw.service.NameGeneratorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

@Configurable
public class Person {
    @Autowired
    private NameGeneratorService nameGenerator;
    private String firstname;
    private String lastname;
    private String nickName;

    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFullName() {
        return firstname + " '" + getNickName() + "' " + lastname;
    }

    private String getNickName() {
        return nickName == null ? nickName = nameGenerator.generateName() : nickName;
    }
}