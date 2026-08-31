package com.example.internassignment.service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class EmailService {

    private final JavaMailSender mailSender;

    public EmailService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void sendEmail(
            String senderEmail,
            String name,
            String semester,
            String branch,
            String rollNumber,
            String attachmentPath
    ) throws MessagingException {

        MimeMessage message = mailSender.createMimeMessage();

        MimeMessageHelper helper = new MimeMessageHelper(message, true);

        helper.setFrom(senderEmail);
        helper.setTo("hr@ignitershub.com");
        helper.setSubject("Challenge 3 Completed");

        String body = """
                Hello HR Team,

                I have completed the internship assignment.

                Name: %s
                Semester: %s
                Branch: %s
                Roll Number: %s

                Please find the required image attached.

                Regards,
                %s
                """.formatted(name, semester, branch, rollNumber, name);

        helper.setText(body);

        File attachmentFile = new File(attachmentPath);

        String fileName = attachmentFile.getName().toLowerCase();

        if (!(fileName.endsWith(".png")
                || fileName.endsWith(".jpg")
                || fileName.endsWith(".jpeg"))) {
            throw new IllegalArgumentException(
                    "Only PNG, JPG, and JPEG files are allowed."
            );
        }

        helper.addAttachment(
                attachmentFile.getName(),
                new FileSystemResource(attachmentFile)
        );

        mailSender.send(message);
    }
}
