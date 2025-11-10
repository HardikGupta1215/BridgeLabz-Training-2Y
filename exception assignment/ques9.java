import java.time.*;
class LateSubmissionException extends Exception { LateSubmissionException(String m){super(m);} }
class InvalidFileFormatException extends Exception { InvalidFileFormatException(String m){super(m);} }
class Exam {
    void submitExam(String file, LocalDateTime time) throws LateSubmissionException, InvalidFileFormatException {
        LocalDateTime deadline = LocalDateTime.of(2025, 11, 5, 23, 59);
        if (!file.endsWith(".pdf")) throw new InvalidFileFormatException("Invalid file format!");
        if (time.isAfter(deadline)) throw new LateSubmissionException("Submission is late!");
        System.out.println("Submission successful.");
    }
    public static void main(String[] args) {
        Exam e = new Exam();
        try {
            e.submitExam("exam.docx", LocalDateTime.now());
        } catch (Exception ex) {
            System.out.println("Submission failed: " + ex.getMessage());
        }
    }
}
