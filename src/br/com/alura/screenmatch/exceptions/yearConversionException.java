package br.com.alura.screenmatch.exceptions;

public class yearConversionException extends RuntimeException {
    private String message;

    public yearConversionException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
