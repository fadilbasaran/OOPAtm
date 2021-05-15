public class Main {
    public static void main(String[] args) {
        //Obje Oriented(Nesne Yönelimli ) ATM Programı.
        
        //login Class'ı Kullanıcı Girişini Kontrol Edecek.
        
        //Hesap Class'ı Hesap İşlemlerini Yapacak.
        
        //ATM ise atm'mizi çalıştıracak
        
        
        ATM atm=new ATM();
        
        Hesap hesap=new Hesap("Gernas", "12345", 2000);
        Hesap hesap1=new Hesap("Ikram", "0707", 1000);
        atm.calis(hesap1);//Atm classı içindeki calistir metodunun parametresiyle eşit oluyor
        
        System.out.println("Programdan çıkılıyor...");
    }
}
