
package pkg22205015.pbo.lat56;

// * Nama         : Ahmad Nurfaqih
// * Nim          : 22205015
// * prodi        : Teknik Informatia
// * Deskripsi    : Umur Barang Antik


class BarangAntik {
    
    private final int umur;
    
    public BarangAntik(int umur){
        this.umur = umur;
    }
    
    public void tampilUmur(){
        System.out.println("Umur barang antik ini adalah : " + this.umur + " tahun");
    }
}

class Radio extends BarangAntik{
    
    private String name;
    
    public Radio(int umur){
        super(umur);
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
}

public class PBOLAT56 {

    public static void main(String[] args) {
        
        System.out.println("===LATIHAN 56===\n");
        Radio oo1 = new Radio(234);
        oo1.setName("Radio AM");
        System.out.println("Nama barang antik : " + oo1.getName());
        oo1.tampilUmur();
    }
}
    

