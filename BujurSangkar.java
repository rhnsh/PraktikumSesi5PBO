/**
 *
 * @author KOMPUTER JARKOM 39
 */
public class BujurSangkar extends BangunDatar {
    
    BujurSangkar(int s){
        super(s);
    }
    
    int HitungLuas(){
        int s = super.getS();
        return s*s;
    } 
    
    int HitungKeliling(){
        int s = super.getS();
        return 4*s;
    }
    
    public String toString(){
        String hasil = "Luas Bujur Sangkar :" + HitungLuas() + "\n"+
        "Keliling Bujur Sangkar" + HitungKeliling();
        
        return hasil;
    }
}