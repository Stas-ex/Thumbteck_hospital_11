package net.thumbtack.school.hospital.request;

public class RegistrationPatientDtoRequest {
    private  String firstName;
    private  String lastName;
    private  String diseaseName;
    private  String login;
    private  String password;
    private  String tokenDoc;

    public RegistrationPatientDtoRequest(String firstName, String lastName, String nameDisease, String login, String password, String tokenDoc) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.diseaseName = nameDisease;
        this.login = login;
        this.password = password;
        this.tokenDoc = tokenDoc;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getTokenDoc() {
        return tokenDoc;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTokenDoc(String tokenDoc) {
        this.tokenDoc = tokenDoc;
    }
}
