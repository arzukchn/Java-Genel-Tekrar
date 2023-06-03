package _16SigortaYönetimSistemiÖdevi.Management;


import _16SigortaYönetimSistemiÖdevi.Account.*;

public class Management {

  private AccountManager accountManager;

  public Management(){
      accountManager = new AccountManager();
  }

  public void displayMenu() {
      System.out.println("#################################################");
      System.out.println("Policy Management Panel!");
      System.out.println("1. Add user (Individual or Enterprise)");
      System.out.println("2. Login");
      System.out.println("3. Show List Accounts");
      System.out.println("0. Exit");
      System.out.println("#################################################");
      System.out.print("Enter your choice: ");
  }

  //Bu bölümde sigorta şirketinin, Bireysel mi (Individual) yoksa Kurumsal(Enterprise) mı müşteri profili eklemesi yapacağını seçiyoruz
  public void addUser(String userType, String name, String surname, String email, String password, String job,
                      int age, String companyName){
      User user = new User(name, surname, email, password, job, age);
      //Burada "equalsIgnorCase karşılaştırılan metni küçük harfe çevirir
      //Böylelikle büyük küçük harf karışıklığının önüne geçer
      if (userType.equalsIgnoreCase("I")){
          Account account = new Individual(user);
          accountManager.addAccount(account);
          System.out.println("User added succesfully!");
      }else if (userType.equalsIgnoreCase("E")){
          Account account = new Enterprise(user, companyName);
          accountManager.addAccount(account);
          System.out.println("User added successfully!");
      }else {
          System.out.println("Invalid user type, Please try again!");
      }
  }


}
