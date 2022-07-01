package BasicCourseWork.two.exceptions;

public class QuestionDoNotExistException extends RuntimeException {
    public QuestionDoNotExistException(String message) {
        super(message);
    }
}
