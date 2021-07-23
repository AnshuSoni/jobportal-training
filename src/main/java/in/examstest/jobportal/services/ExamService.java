package in.examstest.jobportal.services;

import in.examstest.jobportal.models.Examination;
import in.examstest.jobportal.repository.ExaminationRepository;
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
