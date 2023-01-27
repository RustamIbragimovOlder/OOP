package OOP_PracticalTasks.OOP_PT7_final_project.controller;

import java.util.Scanner;
import OOP_PracticalTasks.OOP_PT7_final_project.model.data.Partner;
import OOP_PracticalTasks.OOP_PT7_final_project.model.service.PartnerService;
import OOP_PracticalTasks.OOP_PT7_final_project.view.PartnerView;

public class PartnerController implements ContactController {

    private PartnerService model;
    private PartnerView view;

    public PartnerController(PartnerService model, PartnerView view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите действие");
            System.out.println("1. Загрузить контрагентов из файла");
            System.out.println("2. Добавить контрагента");
            System.out.println("3. Напечатать всех контрагента");
            System.out.println("4. Сохранить контрагентов");
            System.out.println("5. Найти контрагента");
            System.out.println("6. Выйти из программы");

            int index = scanner.nextInt();

            switch (index) {
                case 1:
                    model.load();
                    break;
                case 2:
                    model.addContact(new Partner(scanner.next(), "юридическое лицо", 777777, "продажа всего", "Москва, ул. Новая, д. 5", "rfd@mail.ru", "+7 777 7777", "@rfd"));
                    
                    break;
                case 3:
                    view.showContacts();;
                    break;
                case 4:
                    model.save();
                    break;
                // case 5:
                //     model.поиск();
                //     break;
                case 6:
                    return;
            }
            // scanner.close();
        }
    }

}