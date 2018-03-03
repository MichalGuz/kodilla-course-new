package com.kodilla.good.patterns.challenges;

public class MailService implements InformationService {
    String emailOfUser;

    public MailService(String emailOfUser) {
         this.emailOfUser = emailOfUser;
    }

    public String getEmailOfUser() {
        return emailOfUser;
    }

    @Override
    public void inform(User user) {
        System.out.println("Sending email with confirmation of order\n"
                + "Name and surname: " + user.getNameOfUser() + " "
                + user.getSurnameOfUser());
    }

    public void sendEmail(MailService mailService) {
        System.out.println("Confirmation message was sent: " + mailService.getEmailOfUser());
    }
}
