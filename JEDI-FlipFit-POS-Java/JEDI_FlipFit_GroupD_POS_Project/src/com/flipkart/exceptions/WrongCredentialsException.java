package com.flipkart.exceptions;

import static com.flipkart.constant.Constants.RED_COLOR;
import static com.flipkart.constant.Constants.RESET_COLOR;

/**
 * Exception thrown when wrong credentials entered
 */
public class WrongCredentialsException extends Exception {
    public WrongCredentialsException() {
        super(RED_COLOR+"Wrong username or password!"+RESET_COLOR);
    }
}