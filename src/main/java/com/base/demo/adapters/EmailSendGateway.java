package com.base.demo.adapters;

public interface EmailSendGateway {


    void SendEmail(String to, String subject, String body);
    
} 
