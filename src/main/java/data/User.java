package data;

public class User {
    String name;
    String lastName;
    String email;
    String telephone;
    String gender;

    public User(String name, String lastName, String email, String gender, String telephone) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.telephone = telephone;
        this.gender = gender;
    }

    public User() {
        this.name = "firstName";
        this.lastName = "lastName";
        this.email = "userEmail";
        this.telephone = "userNumber";
        this.gender = "genderWrapper";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
