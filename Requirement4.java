import java.util.ArrayList;

public class Requirement4 {
    ArrayList<Account> accountList;

    public Requirement4(){
        this.accountList = new ArrayList<>();
    }

    //Add account, return account with heighest balance, total balance, deposit into lowest balance, return UID account, remove UID account;

    public void addAccount(Account account){
        this.accountList.add(account);
    }

    public Account highestBalance(){
        Account highestBalance = null;
        for(int i =0; i<accountList.size(); i++){
            if(i==0)highestBalance = accountList.get(i);
            if(highestBalance.getBalance() < accountList.get(i).getBalance())highestBalance = accountList.get(i);
        }
        return highestBalance;
    }

    public int totalBalance(){
        int total = 0;
        for(int i=0; i<accountList.size(); i++){
            total += accountList.get(i).getBalance();
        }
        return total;
    }

    public void lowestBalance(int amount){
        Account lowestBalance = null;
        for(int i =0; i<accountList.size(); i++){
            if(i==0)lowestBalance = accountList.get(i);
            if(lowestBalance.getBalance() > accountList.get(i).getBalance())lowestBalance = accountList.get(i);
        }
        lowestBalance.deposit(amount); // this works because of aliasing as this points to the object inside of accountList
    }

    public Account returnUID(int UniqueID){
        Account found = null;
        for(int i = 0; i < accountList.size(); i++){
            if(accountList.get(i).getUniqueId() == UniqueID){
                found = accountList.get(i);
            }
        }
        if(found == null)System.out.println("Error UID not found!");
        return found;
    }

    public void removeUID(int UniqueID){
        boolean found = false;
        for(int i = 0; i < accountList.size(); i++){
            if(accountList.get(i).getUniqueId() == UniqueID){
                accountList.remove(i);
                found = true;

            }
        }

        if(found == false)System.out.println("Error UID not found!");
    }


}

