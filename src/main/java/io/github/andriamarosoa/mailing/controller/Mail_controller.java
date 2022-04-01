package io.github.andriamarosoa.mailing.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.andriamarosoa.mail.Mail;
import io.github.andriamarosoa.mail.Message;
import io.github.andriamarosoa.mail.Sender;

@CrossOrigin
@RestController
@RequestMapping("/send")
public class Mail_controller {
    @PostMapping(value="/{mdp}")
    public void send(@PathVariable String mdp, Message msg) throws Exception{
        if (!mdp.equals("huhu123456")) throw new Exception("veuillez contacter l'Admin");
        Sender sender=new Sender();
        sender.setEmail("andrianainahenintsoa@gmail.com");
        sender.setMdp("h30122001");
        

        Mail.sendMail(sender, msg);

    }

    @PostMapping(value="/mail/{mdp}")
    public void sendRq(@PathVariable String mdp, @RequestBody Message msg) throws Exception{
        if (!mdp.equals("huhu123456")) throw new Exception("veuillez contacter l'Admin");
        Sender sender=new Sender();
        sender.setEmail("andrianainahenintsoa@gmail.com");
        sender.setMdp("h30122001");
        

        Mail.sendMail(sender, msg);

    }


}
