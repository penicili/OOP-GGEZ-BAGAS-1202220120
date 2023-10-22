// Meng import arraylist
import java.util.ArrayList;
public class Bank {
    //Membuat arrayList baru
    public ArrayList <Account> accountList = new ArrayList<>();
    //Menambahkan rekening
    public void addAccount(Account account) {
        accountList.add(account);
        System.out.println("Saldo Akun "+ account.GetName() +": "+ account.GetBal());
    }
    //Menghapus rekening
    public void removeAccount(String delAcc) {
        for (Account account : accountList) {
            if (account.GetAccNum().equals(delAcc)) {
                accountList.remove(account);
                System.out.println("Rekening berhasil dihapus");
                break;
            }
        }
    }
    // Mencari rekeining
    public void getAccount(String getAcc) {
        for (Account account : accountList) {
            if (account.GetAccNum().equals(getAcc)) {
                System.out.println("Saldo rekening " + account.GetName() + ": " + account.GetBal());
                return;
            }
        }
        System.out.println("Rekening tidak terdaftar");
    }
    //Mencetak semua rekenig
    public void getAllAccounts() {
        System.out.println("Daftar semua rekening yang ada di bank: ");
        for (Account account : accountList) {
            System.out.println("Saldo rekening " + account.GetName() + ": Rp." + account.GetBal());
        }
    }
}
