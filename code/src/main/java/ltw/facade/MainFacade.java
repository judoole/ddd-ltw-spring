package ltw.facade;

import ltw.domain.Person;

import org.apache.log4j.Logger;

public class MainFacade {
    private static Logger log = Logger.getLogger(MainFacade.class);

    public MainFacade() {
        Person mrLogan = new Person("Johhny", "Logan");
        log.info("The full name of mr. Logan is " + mrLogan.getFullName());
    }
}
