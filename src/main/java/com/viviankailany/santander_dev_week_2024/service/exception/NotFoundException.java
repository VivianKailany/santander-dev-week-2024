package com.viviankailany.santander_dev_week_2024.service.exception;

public class NotFoundException extends BusinessException {

    private static final long serialVersionUID = 1L;

    public NotFoundException() {
        super("Resource not found.");
    }

}
