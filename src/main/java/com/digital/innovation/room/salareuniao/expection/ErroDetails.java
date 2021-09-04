package com.digital.innovation.room.salareuniao.expection;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ErroDetails {

    private Date timestamp;
    private String message;
    private String details;

    public ErroDetails(Date timestamp, String message, String details) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }
}
