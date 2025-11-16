package Pekan7_2511533007;

public class Akun {
    private String username;
    private String password;
    private String email;
    private int pinAngka;
    

    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPinAngka(int pinAngka) {
        this.pinAngka = pinAngka;
    }
    
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public String getEmail() {
        return email;
    }
    public int getPinAngka() {
        return pinAngka;
    }

    public boolean isPasswordValid() {
        if (password.length() >= 8) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isEmailValid() {
        if (email.indexOf("@") != -1 && email.indexOf(".") != -1) {
            return true;
        } else {
            return false;
        }
    }
}