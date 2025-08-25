package com.base.demo.core;

// abstração para apenas indicar método - arquitetura com boa prática
//lógica da aplicação, agnóstico à aplicação
public interface EmailSender {

    void SendEmail(String to, String subject, String body);
}
    

