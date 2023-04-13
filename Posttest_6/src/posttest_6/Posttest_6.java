package posttest_6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public final class Posttest_6 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Uang> listUang = new ArrayList<>();
    static ArrayList<MakananPokok> listMK = new ArrayList<>();
    
public static void froze() throws IOException {
        System.out.print("Tekan enter untuk melanjutkan... ");
        input.readLine();
        System.out.println("");
    }

    public static void jenisZakat()
    {
        System.out.println("| 1. Dengan Uang                   |");
        System.out.println("| 2. Dengan Makanan Pokok          |");
        System.out.println("====================================");
    }
    static final void display() {
        System.out.println("====================================");
        System.out.println("====   Jenis Pembayaran Zakat  =====");            
        System.out.println("====================================");
    }

    public static void addData() throws IOException {
        jenisZakat();
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            System.out.println("\n\tMenu Menambahkan Data  ");
            System.out.println("====================================");
            System.out.print("Nama Pembayar Zakat : ");
            String nama = input.readLine();
            System.out.print("Tanggal(DD/MM/YYYY): ");
            String tanggal = input.readLine();
            System.out.print("Gender :  ");
            String gender = input.readLine();
            System.out.print("Mata Uang :  ");
            String MataUang = input.readLine();
            System.out.print("Nominal :  ");
            int uang = Integer.parseInt(input.readLine());
            System.out.println("====================================");          
//            listUang.add(new Uang(nama, tanggal, gender, MataUang, uang));
            Uang un =new Uang(nama, tanggal, gender, MataUang, uang);
            listUang.add(un);
            un.info(nama);           

        }else if(pil == 2){
            System.out.println("\n\tMenu Menambahkan Data  ");
            System.out.println("====================================");
            System.out.print("Nama Pembayar Zakat : ");
            String nama = input.readLine();
            System.out.print("Tanggal(DD/MM/YYYY): ");
            String tanggal = input.readLine();
            System.out.print("Gender :  ");
            String gender = input.readLine();
            System.out.print("Masukkan Jenis makanan pokok :  ");
            String Jenis = input.readLine();
            System.out.print("Masukkan Berat Dalam Kg :  ");
            int Kilo = Integer.parseInt(input.readLine());
            System.out.println("====================================");
//            listMK.add(new MakananPokok(nama, tanggal, gender,Jenis, Kilo));
            MakananPokok mk = new MakananPokok(nama, tanggal, gender,Jenis, Kilo);
            listMK.add(mk);
        }else{
            System.out.println("Pilihan Salah");
        }
    }
         
    public static void showData() throws IOException{
        jenisZakat();
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            display();
            System.out.println("\nData Pembayar Zakat ");
            System.out.println("\nDengan Uang "); 
            System.out.println("====================================");
            if (listUang.isEmpty()){
                System.out.println("Data belum ditambahkan");
            }else{
                for(int i = 0; i < listUang.size();i++){
                    System.out.println("Data pada indeks ke-" + (i + 1));
                    listUang.get(i).tampil();
                   }
                }
                System.out.println("====================================");
        }else if(pil == 2){
            display();
            System.out.println("\nData Pembayar Zakat ");
            System.out.println("\nDengan Makanan "); 
            System.out.println("====================================");
            if (listMK.isEmpty()){
                System.out.println("Data belum ditambahkan");
            }else{
                for(int i = 0; i < listMK.size();i++){
                    System.out.println("Data pada indeks ke-" + (i + 1));
                    listMK.get(i).tampil();
                   }
                }
                System.out.println("====================================");
        }
    }
    
    public static void updateData() throws IOException{
        jenisZakat();
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            if (listUang.isEmpty()){
                System.out.println("Belum ada data yang tersimpan!");
            } else {
                System.out.print("Masukkan indeks data yang ingin diubah: ");
                int index = Integer.parseInt(input.readLine());
                if (index < 0 || index >= listUang.size()) {
                    System.out.println("Indeks tidak ditemukan!");
                } else {
                    Uang ua = listUang.get(index);
                    System.out.println("Data mahasiswa dengan indeks " + index);
                    System.out.println(ua);
                    System.out.println("\n\tMenambahkan Data Baru ");
                    System.out.println("====================================");
                    
                    System.out.print("Nama Baru: ");                    
                    ua.setNama(input.readLine());

                    System.out.print("Tanggal(DD/MM/YYYY): ");
                    ua.setTanggal(input.readLine());
                    
                    System.out.print("Gender :  ");
                    ua.setGender(input.readLine());
                   
                    System.out.print("Mata Uang :  ");
                    ua.setMataUang(input.readLine());

                    System.out.print("Nominal :  ");
                    ua.setUang(Integer.parseInt(input.readLine()));
                    
                }
    }
        }else if(pil == 2){
            if (listMK.isEmpty()) {
                System.out.println("Belum ada data yang tersimpan!");    
            } else {
                System.out.print("Masukkan indeks data yang ingin diubah: ");
                int index = Integer.parseInt(input.readLine());
                if (index < 0 || index >= listMK.size()) {
                    System.out.println("Indeks tidak ditemukan!");
                } else {
                    MakananPokok MK = listMK.get(index);
                    System.out.println("Data mahasiswa dengan indeks " + index);
                    System.out.println(MK);
                    System.out.println("\n\tMenambahkan Data Baru ");
                    System.out.println("====================================");
                    MK.setNama(input.readLine());
                    System.out.print("Tanggal(DD/MM/YYYY): ");
                    MK.setTanggal(input.readLine());             
                    System.out.print("Gender :  ");
                    MK.setGender(input.readLine());                
                    System.out.print("Jenis Makanan Pokok :  ");
                    MK.setJenis(input.readLine());
                    System.out.print("Berat :  ");
                    MK.setKilo(Integer.parseInt(input.readLine()));
                }
            }
        }
    }    
        
    public static void deleteData() throws IOException{
        jenisZakat();
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            if (listUang.isEmpty()) {
                System.out.println("Belum ada data yang tersimpan!");
            } else {
                System.out.print("Masukkan indeks data mahasiswa yang ingin dihapus: ");
                int index = Integer.parseInt(input.readLine());
                if (index < 0 || index >= listUang.size()) {
                    System.out.println("Indeks tidak ditemukan!");
                } else {
                    Uang ua = listUang.get(index);
                    listUang.remove(index);
                    System.out.println("Data mahasiswa dengan indeks " + index + " berhasil dihapus:");
                    System.out.println(ua);
                }
            }
        }else if(pil == 2){
            if (listMK.isEmpty()) {
                System.out.println("Belum ada data yang tersimpan!");
            } else {
                System.out.print("Masukkan indeks data dosen yang ingin dihapus: ");
                int index = Integer.parseInt(input.readLine());
                if (index < 0 || index >= listMK.size()) {
                    System.out.println("Indeks tidak ditemukan!");
                } else {
                    MakananPokok MK = listMK.get(index);
                    listMK.remove(index);
                    System.out.println("Data dosen dengan indeks " + index + " berhasil dihapus:");
                    System.out.println(MK);
                }
            }
        }else{
            System.out.println("Input Salah");
        }
    }
         
    public static void main(String[] args)throws IOException  {
        boolean menu = true;
        while(menu == true){
            System.out.println("====================================");
            System.out.println("====  Program Pendataan Zakat  =====");            
            System.out.println("====================================");
            System.out.println("| 1. Tambah Data Zakat             |");
            System.out.println("| 2. Tampilkan Data Zakat          |");
            System.out.println("| 3. Edit Data Zakat               |");
            System.out.println("| 4. Hapus Data Zakat              |");
            System.out.println("| 5. Exit Program                  |");
            System.out.println("====================================");
            System.out.print("Pilihan: ");
            
            int pilih = Integer.parseInt(input.readLine());
            switch(pilih){
                case 1:
                    addData();
                    froze();
                    break;
                case 2:
                    showData();
                    froze();
                    break;
                case 3:
                    updateData();
                    froze();
                    break;
                case 4:
                    deleteData();
      
                    
                    froze();
                    break;
                case 5:
                    System.out.println("Program dihentikan");
                    menu = false;
                    break;
                default:
                    System.out.println("Pilihan salah");
                    froze();
                    break;
                } 
            }
     }
}