package OOP_PracticalTasks.OOP_PT7_final_project.model.data;

public class Partner extends User {

    private String contactType; // тип контакта
    private int individualTaxNumber; // ИНН
    private String typeOfActivity; // вид деятельности
    private String address;
    private String email;
    private String phone;
    private String telegram;
    
    public Partner(String name, String contactType, int individualTaxNumber, String typeOfActivity, String address,
            String email, String phone, String telegram) {
        super(name);
        this.contactType = contactType;
        this.individualTaxNumber = individualTaxNumber;
        this.typeOfActivity = typeOfActivity;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.telegram = telegram;
    }

    @Override
    public String toString() {
        return "[наименование организации (имя): " + super.toString() + "; \n" 
            + "\tтип контакта: " + contactType + "; \n" 
            + "\tИНН: " + individualTaxNumber + "; \n"
            + "\tвид деятельности: " + typeOfActivity + "; \n" 
            + "\tадрес: " + address + "; \n" 
            + "\temail: " + email + "; \n" 
            + "\tтелефон: " + phone + "; \n" 
            + "\ttelegram: " + telegram + "; ]";
    }

    public String getContactType() {
        return contactType;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    public int getIndividualTaxNumber() {
        return individualTaxNumber;
    }

    public void setIndividualTaxNumber(int individualTaxNumber) {
        this.individualTaxNumber = individualTaxNumber;
    }

    public String getTypeOfActivity() {
        return typeOfActivity;
    }

    public void setTypeOfActivity(String typeOfActivity) {
        this.typeOfActivity = typeOfActivity;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTelegram() {
        return telegram;
    }

    public void setTelegram(String telegram) {
        this.telegram = telegram;
    }
    
}