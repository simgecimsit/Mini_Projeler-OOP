
public class Main {
    
    public static void main(String[] args) {
        /*
        Object Oriented (Nesne Yönelimli) ATM Programı
        
        Login class ı kullanıcı girişini kontrol edecek.
        Hesap class ı hesap işlemlerini yapacak.
        ATM ise atm mizi çalıştıracak.
        
        */
        
         ATM atm=new ATM();
        
         Hesap hesap=new Hesap("Simge Cimsit", "12345", 2000);
         
         
        atm.calis(hesap);
        System.out.println("Programdan Cikiliyor...");
    }
}
