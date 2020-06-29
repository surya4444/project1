package com.upgrad.blog.exceptions;

/**
 * TODO: 3.1. Convert this class to a custom Exception class.
 * TODO: 3.2. Provide a constructor which accepts a custom message as input
 * parameter and passes it to its base class.
 */
public class EmailNotValidException extends Exception{
	//*****************START*****************Solution 3.1 + 3.2*****************

    public EmailNotValidException() {
    }

    public EmailNotValidException(String message) {
        super(message);
    }

    public EmailNotValidException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmailNotValidException(Throwable cause) {
        super(cause);
    }

    public EmailNotValidException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }


    //*****************END*****************Solution 3.1 + 3.2*****************
    
    public static void main(String[] args) {
		try {
			throw new EmailNotValidException("Custom Message");
		} catch (EmailNotValidException e) {
			System.out.println(e.getMessage());
		}

		/**
		 * Your output should look like this.
		 * Custom Message
		 */
	}
}
