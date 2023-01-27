package OOP_PracticalTasks.OOP_PT7_final_project.view;

import OOP_PracticalTasks.OOP_PT7_final_project.model.data.Partner;
import OOP_PracticalTasks.OOP_PT7_final_project.model.service.UserService;

public class PartnerView extends UserView<Partner> {

    public PartnerView(UserService<Partner> model) {
        super(model);
    }

    @Override
    public void showContacts() {
        super.showContacts();
    }

}