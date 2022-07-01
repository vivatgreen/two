package BasicCourseWork.two.services;

import BasicCourseWork.two.data.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}
