package org.example.designpattern._02_structural.facade._02_after;

import lombok.Data;

@Data
public class EmailMessage {
    private String from;
    private String to;
    private String subject;
    private String text;
}
