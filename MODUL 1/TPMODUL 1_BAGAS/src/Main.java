public class Main {public static void main(String[] args){
        Bank bank = new Bank();
        Account Bagas = new Account("Bagas_SI4606", "1202220120", 100000);
        bank.addAccount(Bagas);

        Account Lail = new Account("Lail_SI4606", "1202220121",200000);
        bank.addAccount(Lail);

        Account Esok = new Account("Esok_SI4606", "1202220122",300000 );
        bank.addAccount(Esok);

        Bagas.deposit(50000);
        Esok.withdraw(120000);

        bank.removeAccount("Lail");
        bank.getAllAccounts();
    }
}
