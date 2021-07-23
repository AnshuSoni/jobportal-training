package in.examstest.jobportal.exams;

import javax.persistence.*;

@Entity
public class Examination {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long examId;   // exam_id     JH/2021/03/JAPIT/0023

    @Column(name = "examname")
    private String examName; //exam_name
    private String state;

    public Examination() {
    }

    public Long getExamId() {
        return examId;
    }

    public void setExamId(Long examId) {
        this.examId = examId;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Examination{" +
                "examId=" + examId +
                ", examName='" + examName + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
