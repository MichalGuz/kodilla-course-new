package com.kodilla.good.patterns.food.to.door;

public class FoodToDoorMailService implements InformationService{
    String emailOfUser;

    public FoodToDoorMailService(String emailOfUser) {
        this.emailOfUser = emailOfUser;
    }

    public String getEmailOfUser() {
        return emailOfUser;
    }

    @Override
    public void inform(User user) {
        System.out.println("Sending email with confirmation of order\n"
                + "Name and surname: " + user.getUserName() + " "
                + user.getUserSurname());
    }

    public void sendEmail(FoodToDoorMailService mailService) {
        System.out.println("Confirmation message was sent: " + mailService.getEmailOfUser());
    }
}

