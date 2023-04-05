package posttest_5;

public class MakananPokok extends Data{
    int Kilo;
    String Jenis;
    
    public MakananPokok(String nama, String tanggal, String gender,String Jenis, int Kilo){
        super(nama, tanggal, gender);
        this.Kilo = Kilo;
        this.Jenis = Jenis;
    }

    public int getKilo() {
        return Kilo;
    }

    public void setKilo(int Kilo) {
        this.Kilo = Kilo;
    }

    public String getJenis() {
        return Jenis;
    }

    public void setJenis(String Jenis) {
        this.Jenis = Jenis;
    }
    
    @Override
    public void tampil(){
        System.out.println("Nama                : " + getNama() );
        System.out.println("Tanggal             : " + getTanggal() );
        System.out.println("Gender              : " + getGender() );
        System.out.println("Jenis makanan pokok : " + Jenis);
        System.out.println("Berat               : " + Kilo);
        System.out.println(data);
        }
    }
