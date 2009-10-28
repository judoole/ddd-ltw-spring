package no.bekk.examples.domain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext-core.xml"})
public class PersonTest {

    @Test
    public void testSendMailToMomDoesNotThrowNullPointer() {
        new Person("Ole Christian", "mom@mommys.com").sendMailToMom();
    }

}
