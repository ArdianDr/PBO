package posttest_3;

public class MakananPokok extends Data{
    int Kilo;
    String Jenis;
    
    public MakananPokok(String nama, String tanggal, String gender,String Jenis, int Kilo){
        super(nama, tanggal, gender);
        this.Kilo = Kilo;
        this.Jenis = Jenis;
    }

    /**
     * @return the Kilo
     */
    public int getKilo() {
        return Kilo;
    }

    /**
     * @param Kilo the Kilo to set
     */
    public void setKilo(int Kilo) {
        this.Kilo = Kilo;
    }

    /**
     * @return the Jenis
     */
    public String getJenis() {
        return Jenis;
    }

    /**
     * @param Jenis the Jenis to set
     */
    public void setJenis(String Jenis) {
        this.Jenis = Jenis;
    }
 
}
