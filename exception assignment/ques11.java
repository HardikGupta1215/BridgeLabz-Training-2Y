class InvalidRatingException extends Exception { InvalidRatingException(String m){super(m);} }
class EmptyReviewException extends Exception { EmptyReviewException(String m){super(m);} }
class Review {
    void submitReview(int rating, String comment) throws InvalidRatingException, EmptyReviewException {
        if (rating < 1 || rating > 5) throw new InvalidRatingException("Invalid rating!");
        if (comment == null || comment.isEmpty()) throw new EmptyReviewException("Comment cannot be empty!");
        System.out.println("Review submitted successfully.");
    }
    public static void main(String[] args) {
        Review r = new Review();
        try {
            r.submitReview(6, "");
        } catch (InvalidRatingException e) {
            System.out.println(e.getMessage());
        } catch (EmptyReviewException e) {
            System.out.println(e.getMessage());
        }
    }
}

