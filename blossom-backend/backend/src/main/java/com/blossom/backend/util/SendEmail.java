package com.blossom.backend.util;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class SendEmail {

    public static void main(String[] args) throws MessagingException {
        sendEmail("老李是傻逼");
    }

    public static void sendEmail(String str) throws MessagingException {
        // 收件人的电子邮箱
        String to = "1069608034@qq.com";

        // 发件人的电子邮箱
        String from = "xinhxu0720@163.com";
        final String username = "xinhxu0720@163.com"; // 发件人的邮箱用户名
        final String password = "EA4SdXgJTbnAwaht"; // 发件人的邮箱密码或授权码

        // 假设SMTP服务器是163邮箱的
        String host = "smtp.163.com";

        // 获取默认Session对象
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true"); // 对于163邮箱需要启用TLS
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", "25"); // 或使用465（SSL）或587（TLS）端口

        // 获取默认的Session对象
        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        // 创建默认的 MimeMessage 对象
        Message message = new MimeMessage(session);

        // 设置 From: 头部域字段
        message.setFrom(new InternetAddress(from));

        // 设置 To: 头部域字段
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

        // 设置 Subject: 头部域字段
        message.setSubject(str);

        // 现在设置实际消息
        message.setText("你好，这是一封来自163邮箱的测试邮件！");

        // 发送消息
        Transport.send(message);
        System.out.println("邮件发送成功....");


    }
}
