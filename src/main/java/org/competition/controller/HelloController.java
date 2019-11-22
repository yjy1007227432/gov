package org.competition.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.internet.MimeMessage;
import java.net.URLDecoder;

@RestController
public class HelloController {
    private static String content = "<!DOCTYPE html>"
            + "<html>"
            + "<head>"
            + "<title>测试邮件2</title>"
            + "<meta name=\"content-type\" content=\"text/html; charset=UTF-8\">"
            + "</head>"
            + "<body>"
            + "<p style=\"color:#0FF\">";

    private static String content2 = "</p>"
            + "</body>"
            + "</html>"; // 可以用HTMl语言写

    @Autowired
    JavaMailSender mailSender;//自动注入
    @RequestMapping(value = "/sendEmail/{name}", method = RequestMethod.GET)
    public Object sendEmail(@PathVariable("name") String name) {
        try {

            String resultName = URLDecoder.decode(name, "utf-8");
            String[]  mail = resultName.split("    ");
            MimeMessage mimeMessage = this.mailSender.createMimeMessage();
            MimeMessageHelper message = new MimeMessageHelper(mimeMessage);
            message.setFrom("yao_junyi@qq.com");//设置发信人，发信人需要和spring.mail.username配置的一样否则报错
            String address = mail[0]+="@qq.com";					//补全地址
            message.setTo(address);				//设置收信人
            message.setSubject(mail[1]);	//设置主题
            message.setText(content+mail[2]+content2,true);  	//第二个参数true表示使用HTML语言来编写邮件
//            FileSystemResource file = new FileSystemResource(
//            new File("src/main/resources/static/image/picture.jpg"));
//            helper.addAttachment("图片.jpg", file);//添加带附件的邮件
//            helper.addInline("picture",file);//添加带静态资源的邮件
            this.mailSender.send(mimeMessage);

            return "sucesss";
        } catch (Exception ex) {
            ex.printStackTrace();
            return "error";
        }
    }

}