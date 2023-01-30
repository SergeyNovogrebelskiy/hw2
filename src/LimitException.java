public class LimitException extends RuntimeException {
    private int attempts;

    public LimitException() {
    }

    public LimitException(String message, int attempts) {
        super(message);
        this.attempts = attempts;
    }

    public LimitException(String message, Throwable cause) {
        super(message, cause);
    }

    public LimitException(Throwable cause) {
        super(cause);
    }

    public LimitException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public String getDetails() {
        return getMessage() + " = " + attempts;
    }


}
