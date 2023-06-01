package _16SigortaYönetimSistemiÖdevi.Adress;

import _16SigortaYönetimSistemiÖdevi.Account.User;

public class AdressManager {

    public static void addAdress(User user, Adress adress){
        user.getAdresses().add(adress);
    }

    public static void removeAdress(User user, Adress adress){
        user.getAdresses().remove(adress);
    }

}
