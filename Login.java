package TUGAS_PBO;

public class Login {
    private String usernameUser, passwordUser,
                   usernameAdmin1, passwordAdmin1,
                   usernameAdmin2, passwordAdmin2;

    public Login(){
        usernameUser = "pelanggan";
        passwordUser = "password";

        usernameAdmin1 = "Tara";
        passwordAdmin1 = "12345";

        usernameAdmin2 = "Evan";
        passwordAdmin2 = "54321";
    }

    public void setUsernameUser(String usernameUser){
        this.usernameUser = usernameUser;
    }
    public void setPasswordUser(String passwordUser){
        this.passwordUser = passwordUser;
    }
    public void setUsernameAdmin1(String usernameAdmin1){
        this.usernameAdmin1 = usernameAdmin1;
    }
    public void setPasswordAdmin1(String passwordAdmin1){
        this.passwordAdmin1 = passwordAdmin1;
    }
    public void setUsernameAdmin2(String usernameAdmin2){
        this.usernameAdmin2 = usernameAdmin2;
    }
    public void setPasswordAdmin2(String passwordAdmin2){
        this.passwordAdmin2 = passwordAdmin2;
    }

    public String getUsernameUser() {
        return usernameUser;
    }
    public String getPasswordUser() {
        return passwordUser;
    }
    public String getUsernameAdmin1() {
        return usernameAdmin1;
    }
    public String getPasswordAdmin1() {
        return passwordAdmin1;
    }
    public String getUsernameAdmin2() {
        return usernameAdmin2;
    }
    public String getPasswordAdmin2() {
        return passwordAdmin2;
    }
}
