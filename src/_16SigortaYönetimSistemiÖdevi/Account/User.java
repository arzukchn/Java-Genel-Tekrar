package _16SigortaYönetimSistemiÖdevi.Account;

import _16SigortaYönetimSistemiÖdevi.Adress.Adress;

import java.time.LocalDate;
import java.util.ArrayList;

public class User {
    private String name;
    private String Surname;
    private String email;
    private String password;
    private String job;
    private int age;
    private ArrayList<Adress> adresses;
    private LocalDate lastLoginDate;



    public User(String name, String surname, String email, String password, String job, int age) {
        this.name = name;
        Surname = surname;
        this.email = email;
        this.password = password;
        this.job = job;
        this.age = age;
        this.adresses = adresses;
        this.lastLoginDate = lastLoginDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Adress> getAdresses() {
        return adresses;
    }

    public void setAdresses(ArrayList<Adress> adresses) {
        this.adresses = adresses;
    }

    public LocalDate getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(LocalDate lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public void addAdress(Adress adress){
        this.adresses.add(adress);
    }

    public void removeAdress(Adress adress){
        this.adresses.remove(adress);
    }

    public void updateLastLogin(){
        this.lastLoginDate = LocalDate.now();
    }

    public boolean checkPassword(String password){
        return this.password.equals(password);
    }
}
