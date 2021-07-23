package in.examstest.jobportal.exams;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/exams")
@Slf4j
public class ExamControllers {

    @Autowired
    ExamService examService;


    @GetMapping(value = {"/", "","all", "home"})
    public ModelAndView allExams(ModelAndView model){
        List<Examination> exams =  examService.findAllExams();
        exams.forEach(examination -> log.info(examination.getExamName()));

        model.addObject("exams", exams);
        model.setViewName("exam-index");
        return model;
    }


    @GetMapping(value = "post")
    public String showExamForm() {
        return "post-exam";
    }

    @PostMapping(value = "post")
    public String saveExam(String examName, String state) {
        log.info("examNAme :: " + examName);
        log.info("state :: "+ state);

        Examination exam = new Examination();
        exam.setExamName(examName);
        exam.setState(state);

        examService.save(exam);

        return "redirect:/exams/all";
    }

}
