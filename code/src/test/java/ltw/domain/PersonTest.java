package ltw.domain;

import static org.mockito.Mockito.mock;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Eclipse Run Configuration VM-args: -javaagent:${user.home}/.m2/repository/org/springframework/spring-agent/2.5.6/spring-agent-2.5.6.jar
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext-core.xml" })
public class PersonTest {

    @Test
    public void testGetFullNameDoesNotThrowNullPointer() {
        new Person("Ole Christian", "Langfjæran").getFullName();
    }

    @Test()
    @Ignore
    public void testThatDoesNotCompute() {
        Person mock = mock(Person.class);
        mock.getFullName();
    }
}
