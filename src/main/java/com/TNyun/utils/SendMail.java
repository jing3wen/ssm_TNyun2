package com.TNyun.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.util.Properties;

/**
 * @Author jingwen
 * @Date 2020/9/1 20:11
 * (ﾉꐦ ๑´Д`๑)ﾉ彡┻━┻  I have to type the code again   (▼皿▼#)
 **/
@Component
public class SendMail {

    @Autowired
    private JavaMailSender javaMailSender;


    public String sendmail(String mailaderss,String context) throws IOException, MessagingException {

        SimpleMailMessage message = new SimpleMailMessage();
        //发件人的邮箱地址
        message.setFrom("1584591284@qq.com");
        //收件人的邮箱地址
        message.setTo(mailaderss);
        //邮件主题
        message.setSubject("管理员通知");
        //邮件内容
        message.setText(context);
        //发送邮件
        javaMailSender.send(message);


        return "send mail is ok";
    }
}
