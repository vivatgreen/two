package BasicCourseWork.two.services.impl;

import BasicCourseWork.two.data.Question;
import BasicCourseWork.two.exceptions.TheAmountOfQuestionsException;
import BasicCourseWork.two.exceptions.TheEmptyListOfQuestionsException;
import BasicCourseWork.two.services.ExaminerService;
import BasicCourseWork.two.services.QuestionService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    private QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        Collection<Question> randomQuestionsList = new HashSet<>();
        if (amount > questionService.getAll().size()) {
            throw new TheAmountOfQuestionsException("Enter another amount of questions");
        }
        if (questionService.getAll().isEmpty()) {
            throw new TheEmptyListOfQuestionsException("Add questions to the list");
        }
        while (randomQuestionsList.size() != amount) {
            randomQuestionsList.add(questionService.getRandomQuestion());
        }
        return randomQuestionsList;
    }
}
