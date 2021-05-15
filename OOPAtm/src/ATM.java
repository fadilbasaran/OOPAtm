
import java.util.Scanner;

public class ATM {
    public void calis(Hesap hesap){
        Login login=new Login();
        
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Bankamıza hoşgeldiniz...");
        
        System.out.println("********************************");
        System.out.println("Kullanıcı Girişi");
        System.out.println("********************************");
        
        int giris_hakki=3;
        while (true) {            
            if (login.login(hesap)) {//ATM çalıştan aldığı hesabı buraya gönderecek
                System.out.println("Giriş Başarılı...");
                break;
            }
            else{
                System.out.println("Giriş Başarısız....");
                giris_hakki-=1;
                System.out.println("Kalan Giris Hakkı: "+giris_hakki);
                
            }
            if (giris_hakki==0) {
                System.out.println("Giriş Hakkınız Bitti...");
                return;//dögümüzün sonlanmasını istemiyoruz sadece oanlık metodun sonlanması için
            }
        }
        
        System.out.println("********************************");
        
        String islemler="1. Bakiye Görüntüle\n"
                        +"2. Para Yatırma \n"
                        +"3. Para Çekme\n"
                        +"Çıkış yapmak için q'ya basın";
        System.out.println(islemler);
        System.out.println("********************************");
        
        while (true) {
            
            System.out.print("İşlemi seçiniz : ");
            String islem=scanner.nextLine();
            
            if (islem.equals("q")) {//döngümüz ve metot sonlanacak
                break;
            }
            else if (islem.equals("1")){
                
                System.out.println("Bakiyeniz: "+hesap.getBakiye());
            }
            else if (islem.equals("2")) {
                
                System.out.print("Yatırmak istediğiniz tutar : ");
                int tutar=scanner.nextInt();
                scanner.nextLine();//nextLine dan sonra nextInt geldiği için programı güvence altına almak için bunu kullanıyoruz
                
                hesap.paraYatir(tutar);
            }
            else if (islem.equals("3")) {
                
                System.out.print("Çekmek istediğiniz tutarı giriniz : ");
                int tutar=scanner.nextInt();
                scanner.nextLine();//nextLine dan sonra nextInt geldiği için programı güvence altına almak için bunu kullanıyoruz

                hesap.paraCek(tutar);
                
            }
            else{
                System.out.println("Geçersiz işlem...");
            }
            
        }

        
    }
}
