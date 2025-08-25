package com.base.demo.application;

import org.springframework.beans.factory.annotation.Autowired;

import com.base.demo.adapters.EmailSendGateway;
import com.base.demo.core.EmailSender;


//camada que se conecta ao core para implementar uso de interface
public class EmailSenderService implements EmailSender {

    private final EmailSendGateway emailsendgateway;

    //interface que se comunica com o AWS para esse arquivo não precisar se conectar diretamente
    @Autowired
    public EmailSenderService(EmailSendGateway emailgateway) {
        this.emailsendgateway = emailgateway;
    }



    @Override
    public void SendEmail(String to, String subject, String body) {
        this.emailsendgateway.SendEmail(to, subject, body);
        throw new UnsupportedOperationException("Unimplemented method 'SendEmail'");
    }
    
}
