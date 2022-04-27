package lesson17;

public class UncurrentAgeExeption extends Exception{

    public UncurrentAgeExeption() {
    }

    public UncurrentAgeExeption(String message) {
        super(message);
    }

    public UncurrentAgeExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public UncurrentAgeExeption(Throwable cause) {
        super(cause);
    }

    public UncurrentAgeExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
