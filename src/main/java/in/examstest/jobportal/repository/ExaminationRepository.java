package in.examstest.jobportal.repository;

import in.examstest.jobportal.models.Examination;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExaminationRepository extends JpaRepository<Examination, Long> {
    // sab kuch khud se ho jaega , this is black magic
}
