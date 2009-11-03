package ltw.web;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import ltw.domain.Person;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/generateName.do")
public class GenerateNameDo {

    @RequestMapping(method = GET)
    public ModelAndView generateName(@RequestParam("firstname") String firstname, @RequestParam("surname") String surname) {
        Person person = new Person(firstname, surname);
        System.out.println("Generated name. All without nullpointers: " + person.getFullName());
        return new ModelAndView("WEB-INF/jsp/generateNameView.jsp", "name", person.getFullName());
    }
}
