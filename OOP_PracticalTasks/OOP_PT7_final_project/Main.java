package OOP_PracticalTasks.OOP_PT7_final_project;

// import OOP_PracticalTasks.OOP_PT7_final_project.model.contactMethod.ListContactMethod;
import OOP_PracticalTasks.OOP_PT7_final_project.model.data.Partner;
import OOP_PracticalTasks.OOP_PT7_final_project.model.service.PartnerService;
import OOP_PracticalTasks.OOP_PT7_final_project.view.PartnerView;

// import java.util.ArrayList;
// import java.util.List;
// import OOP_PracticalTasks.OOP_PT7_final_project.controller.*;
// import OOP_PracticalTasks.OOP_PT7_final_project.view.PartnerView;

public class Main {
    public static void main(String[] args) {
        
        // Создание списка контрагентов
        PartnerService partnerService = new PartnerService();
        partnerService.addContact(new Partner(
            "ООО Первая компания", 
            "юридическое лицо", 
            111111, 
            "производство молочных продуктов", 
            "г. Орел, ул. Ленина, д. 45", 
            "company1@mail.ru", 
            "+7 111 1111", 
            "@company1"));
        partnerService.addContact(new Partner(
            "ПБОЮЛ Иванов Иван Иванович", 
            "физическое лицо", 
            222222,
            "доставка грузов", 
            "Орловская обл., с. Ивановка",
            "ivanovii@yandex.ru",
            "+7 222 2222",
            "@ivanovii"));
        partnerService.addContact(new Partner(
            "ЗАО Третья компания",
            "юридическое лицо",
            333333, 
            "производство хлебобулочных изделий",
            "г. Коломна, ул. Хлебная, д. 23",
            "company3@mail.ru",
            "+7 333 3333",
            "@company3"));
        partnerService.addContact(new Partner(
            "ПАО Четвертая компания",
            "юридическое лицо", 
            444444, 
            "производство газированных напитков",
            "п. Черноготовка, пригород",
            "company4@mail.ru",
            "+7 444 4444",
            "@company4"));
        partnerService.addContact(new Partner(
            "Петров Петр Петрович",
            "физическое лицо", 
            555555, 
            "утилизация отходов",
            "г. Москва, ул. Петровская, д. 23, кв. 45",
            "petrovpp@mail.ru",
            "+7 555 5555",
            "@petrovpp"));
             
        
        partnerService.save();
        
        // partnerService.load();
        
        new PartnerView(partnerService).showContacts();


    }
}