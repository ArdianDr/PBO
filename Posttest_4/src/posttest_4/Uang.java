package posttest_4;
    
public class Uang extends Data{
    int uang;
    String MataUang;
    
    public Uang(String nama, String tanggal, String gender,String MataUang, int uang){
        super(nama, tanggal, gender);
        this.uang = uang;
        this.MataUang = MataUang;
    }

    public int getUang() {
        return uang;
    }

    public void setUang(int uang) {
        this.uang = uang;
    }

    public String getMataUang() {
        return MataUang;
    }

    public void setMataUang(String MataUang) {
        this.MataUang = MataUang;
    }
    
    @Override
    public void tampil(){
        super.tampil();
        System.out.println("Mata Uang           : " + uang);
        System.out.println("Nominal             : " + MataUang);
    }
    
    // overloading
    public void tampil(boolean showID){
        if(showID) tampil();
        else super.tampil();
    }
}

