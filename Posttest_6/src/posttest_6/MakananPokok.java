package posttest_6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MakananPokok extends Data implements Tambahan{
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<MakananPokok> listMK = new ArrayList<>();
    
    private int Kilo;
    private String Jenis;
    
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
        System.out.println("Masjid              : " + NamaMasjid());
        System.out.println("Nominal             : " + amilZakat());
        System.out.println(data);
    }
    
    @Override
    public String NamaMasjid(){
        return "Sabilusalam";
    }
    @Override
    public String amilZakat(){
        return "Abdulah";
    }
    }
