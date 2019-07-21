package login.login.rest_controller;

import login.login.dao.studentRepository;
import login.login.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restControllerTest {

    @Qualifier("StudentRepository")
    private studentRepository studentrepository;

    @Autowired
    public restControllerTest(studentRepository studentrepository) {
        this.studentrepository = studentrepository;
    }

    @RequestMapping(value = "/restControllerTest", method = RequestMethod.GET)
    public Student restAPITest(@RequestParam("name") String name) {
        return studentrepository.findStudentByName(name);
    }

}