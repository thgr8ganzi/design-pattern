package org.example.designpattern._02_structural.facade._02_after;

import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

import java.util.Properties;

public class Client {
    public static void main(String[] args) {
        EmailSettings emailSettings = new EmailSettings();
        emailSettings.setHost("127.0.0.1");
        EmailSender emailSender = new EmailSender(emailSettings);
        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setFrom("me");
        emailMessage.setTo("you");
        emailMessage.setSubject("Hello");
        emailMessage.setText("Hello, how are you?");
        emailSender.sendEmail(emailMessage);
    }
}
