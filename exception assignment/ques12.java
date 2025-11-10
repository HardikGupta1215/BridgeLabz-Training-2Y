import java.io.*;
class InvalidStudentException extends Exception { InvalidStudentException(String m){super(m);} }
class OnlineExam {
    void validateStudent(boolean valid) throws InvalidStudentException {
        if (!valid) throw new InvalidStudentException("Invalid student details!");
    }
    void submitExam(boolean valid) throws InvalidStudentException, IOException {
        validateStudent(valid);
        throw new IOException("File error!");
    }
    public static void main(String[] args) {
        OnlineExam e = new OnlineExam();
        try {
            e.submitExam(false);
        } catch (InvalidStudentException | IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally {
            System.out.println("Exam submission process completed.");
        }
    }
}

