package posttest_6;
    
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Uang extends Data implements Tambahan{
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Uang> listUang = new ArrayList<>();
    
    private int uang;
    private String MataUang;
    
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
        System.out.println("Nama                : " + getNama() );
        System.out.println("Tanggal             : " + getTanggal() );
        System.out.println("Gender              : " + getGender() );
        System.out.println("Mata Uang           : " + uang);
        System.out.println("Nominal             : " + MataUang);
        System.out.println("Masjid              : " + NamaMasjid());
        System.out.println("Amil                : " + amilZakat());
        System.out.println(data);
    }
    public static void test(){
        System.out.println("Masjid              : Seumur Hidup");
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


