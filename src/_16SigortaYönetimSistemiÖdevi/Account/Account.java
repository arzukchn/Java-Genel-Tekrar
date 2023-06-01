package _16SigortaYönetimSistemiÖdevi.Account;

import _16SigortaYönetimSistemiÖdevi.Adress.Adress;
import _16SigortaYönetimSistemiÖdevi.Insurances.Insurance;

import java.util.ArrayList;

public abstract class Account implements Comparable<Account>{

    private AuthenticationStatus authenticationStatus;
    private User user;
    private ArrayList<Insurance> insurances;

    public enum AuthenticationStatus{
        SUCCESS, FAIL
    }

    public Account(User user){
        this.authenticationStatus = authenticationStatus;
        this.user = user;
        this.insurances = insurances;
    }

    public void login(String email, String password) throws InvalidAuthenticationException {
        if (user.getEmail().equals(email) && user.getPassword().equals(password)){
            this.authenticationStatus = AuthenticationStatus.SUCCESS;
        }else{
            throw new InvalidAuthenticationException("Invalid account");
        }
    }

    public void addAdress(Adress adress){
        if (authenticationStatus == AuthenticationStatus.SUCCESS){
            user.addAdress(adress);
        }
    }

    public void removeAdress(Adress adress){
        if (authenticationStatus == AuthenticationStatus.SUCCESS){
            user.removeAdress(adress);
        }
    }

    public abstract void addInsurance(Insurance insurance);

    public final void showUserInfo(){
        System.out.println("------------------------------------------");
        System.out.println("Name : " + user.getName());
        System.out.println("Surname : " + user.getSurname());
        System.out.println("Email : " + user.getEmail());
        System.out.println("Password : " + user.getPassword());
        System.out.println("Job : " + user.getJob());
        System.out.println("Age : " + user.getAge());
        user.updateLastLogin();
        System.out.println("Last login date : " + user.getLastLoginDate());
        if (this instanceof Enterprise){
            System.out.println("Company Name : " + ((Enterprise) this).getCompanyName());
        }
    }


}
