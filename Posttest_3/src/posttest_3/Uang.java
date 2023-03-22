package posttest_3;
    
public class Uang extends Data{
    int uang;
    String MataUang;
    
    public Uang(String nama, String tanggal, String gender,String MataUang, int uang){
        super(nama, tanggal, gender);
        this.uang = uang;
        this.MataUang = MataUang;
    }

    /**
     * @return the uang
     */
    public int getUang() {
        return uang;
    }

    /**
     * @param uang the uang to set
     */
    public void setUang(int uang) {
        this.uang = uang;
    }

    /**
     * @return the MataUang
     */
    public String getMataUang() {
        return MataUang;
    }

    /**
     * @param MataUang the MataUang to set
     */
    public void setMataUang(String MataUang) {
        this.MataUang = MataUang;
    }
    
}

