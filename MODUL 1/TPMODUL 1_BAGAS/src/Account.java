public class Account {
    private String Name;
    private String AccountNumber;
    private double Balance;

    public Account(String Name, String AccountNumber, double Balance) {
        this.Name = Name;
        this.AccountNumber = AccountNumber;
        this.Balance = Balance;
    }

    public void deposit(double DepoAmount) {
        Balance += DepoAmount;
        System.out.println("Saldo rekening " + Name + " setelah menyetor: " + Balance);
    }

    public boolean withdraw(double WithdrawAmount) {
        if (WithdrawAmount <= Balance) {
            Balance -= WithdrawAmount;
            System.out.println("Saldo rekening " + Name + " setelah melakukan penarikan: " + Balance);
            return true;
        } else {
            System.out.println("Saldo rekening anda tidak mencukupi");
            return false;
        }
    }
//Agar bisa memunculkan norek
    public String GetAccNum() {
        return AccountNumber;
    }
//Agar bisa memunculkan nama rek
    public String GetName() {
        return Name;
    }
//Agar bisa memuculkan jumlah balance
    public double GetBal() {
        return Balance;
    }
}
