
public class Main {
    
    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("Sabiha Gökçen Havalimanına Hoşgeldiniz...");
        String sartlar = "***Yurtdışı Çıkış Kuralları***\n"+
                         "-Herhangi Bir Siyasi Yasağınızın Bulunmaması Gerekiyor-\n"+
                         "-15TL Harç Bedelini Tam Olarak Yatırmanız Gerekiyor-\n"+ 
                         "-Vizenizin Bulunması Gerekiyor-";
        String message = "Yurtdışı Şartlarının Hepsini Sağlamanız Gerekiyor";
        
        while(true){
            
            System.out.println("*********************************");
            System.out.println(sartlar);
            System.out.println("*********************************");
            
            Yolcu yolcu = new Yolcu();
            
            System.out.println("Harç Bedeli Kontrol Edliyor...");
            Thread.sleep(3000);  // 3 sn çalışmayı yavaşlatıyor
            if(yolcu.yurtdisiHarciKontrol() == false){
                
                System.out.println(message);
                continue;  //while döngüsnün başına dönüyor
                
                
            }
            System.out.println("Siyasi Yasak Kontrol Ediliyor...");
            Thread.sleep(3000);
            
            if(yolcu.siyasiYasakKontrol() == false){
                
                System.out.println(message);
                continue;
                
            }
            System.out.println("Vize Durumu Kontrol Ediliyor...");
            Thread.sleep(3000);
            if(yolcu.vizeDurumuKontrol() == false){
                System.out.println(message);
                continue;
                
                
            }
            System.out.println("İşlemleriniz Tamam Yurt Dışına Çıkabilirsiniz....");
            break;
             
            
        }
        
        
        
    }
    
}
