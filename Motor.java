public class Motor{
    public String vario;
    public String beat;

    void Jenis(){
        System.out.println("Program ini menunjukan spesifikasi motor dengan merk HONDA ");
        System.out.println("\n spesifikasi motor Vario adalah:");
        System.out.println("---------------------------------------------------------");
        System.out.println("1.Panjang,lebar dan tingginya : 1919 X 679 X 1062 mm");
        System.out.println("2.Ukuran ban depan : 80/90-14 M/C 40 p Tubeless ");
        System.out.println("3.Ukuran ban belakang : 90/90- 14 M/C 46P Tubeless ");
        System.out.println("4.Rem depan : Cakram hidrolik,piston tunggal");
        System.out.println("5.Rem belakang : Tromol");
        System.out.println("6.Mesin :4-langkah,SOHC,eSP,pendinginan cairan 124,8 cc ");
        System.out.println("Spesifikasi motor Beat adalah");
        System.out.println("---------------------------------------------------------");
        System.out.println("Spesifikasi motor Beat adalah");
        System.out.println("1.Panjang,lebar dan tingginya : 1877 X 669 X 1074 mm");
        System.out.println("2.Ukuran ban depan : 80/90-14 M/C  Tubeless ");
        System.out.println("3.Ukuran ban belakang : 90/90- 14 M/C  Tubeless ");
        System.out.println("4.Rem depan : Cakram hidrolik,piston tunggal");
        System.out.println("5.Rem belakang : Tromol");
        System.out.println("6.Mesin :4-langkah,SOHC,eSP,pendinginan cairan 109,5 cc ");
        
    }
}
class ukuran extends Motor {
    public String ukuran;
    public String getukuran(){
        return ukuran;
    }
    public void setukuran(String newukuran){
        this.ukuran = newukuran;
    }
}
class ban extends Motor{
    public String ban;
    public String getban(){
        return ban;
    }
    public void setban(String newban){
        this.ban = newban;
    }
}

class rem extends Motor {
    public String rem;

    public String getrem(){
        return rem;
    }
    public void setrem(String newrem){
        this.rem = newrem;
    }

}
class transportasi {
    public static void main (String[] args){
        Motor myMotor = new Motor(); 
        myMotor.Jenis();
    }
}