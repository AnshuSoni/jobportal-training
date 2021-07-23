package in.examstest.jobportal.exams;

import in.examstest.jobportal.exams.Examination;
import in.examstest.jobportal.exams.ExaminationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamService {


    @Autowired
    ExaminationRepository examinationRepository;

    public void save(Examination exam) {
        examinationRepository.save(exam);
    }

    /**
     * Find all exams in database
     * select * from examinations
     * @return
     */
    public List<Examination> findAllExams() {
        return examinationRepository.findAll();
    }
}
