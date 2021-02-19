
import java.util.Scanner;


public class Yolcu implements YurtDisiKurallari{
    
    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;
    
    
    public Yolcu(){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Yatırdığınız Harç Bedeli : ");
        this.harc = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Her hangi bir siyasi yasağınız bulunuyor mu ? (evet ya da hayır) : ");
        
        String cevap = scanner.nextLine();
        
        if(cevap.equals("evet")){
            
            this.siyasiYasak = true;
            
          }
        else {
            
            this.siyasiYasak = false;
            
        }
        
        System.out.println("Vizeniz bulunuyor mu ? (evet ya da hayır) : ");
        String cevap2 = scanner.nextLine();
        
        if(cevap2.equals("evet")){
            
            this.vizeDurumu = true;
            
        }
        else {
            
            this.vizeDurumu = false;
            
        }
        
        
    }
      
    @Override
    public boolean yurtdisiHarciKontrol() {
        
        if(this.harc < 15 ){
            
            System.out.println("Lütfen yurt dışı harcını tam yatırın...");
            return false;
        }
        else{
            System.out.println("Yurt Dışı Harcı İşlemi Tamam! ");
            return true;
            
        }
        
        
        
    }
     @Override
    public boolean siyasiYasakKontrol() {
        
        if(this.siyasiYasak == true){
            
            System.out.println("Siyası Yasağınız Bulunuyor.Yurt Dışına Çıkamazsınız..");
            return false;
            
     }
        else{
            System.out.println("Siyasi Yasağınız Bulunmuyor..");
            return true;
            
            
        }
        
        
        
    }

    @Override
    public boolean vizeDurumuKontrol() {
        
        if(this.vizeDurumu == true){
            
            System.out.println("Vizeniz işlemleri Tamam...");
            return true;
            
        }
        else{
            
            System.out.println("Vizeniz Bulunmuyor...");
            return false;
        }
        
        
        
        
    }
    
    
    
    
}
