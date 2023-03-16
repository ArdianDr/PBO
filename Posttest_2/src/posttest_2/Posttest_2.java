package posttest_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Posttest_2 {
    static ArrayList<Data> dataList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        while (true) {
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
            int pilih = scanner.nextInt();

            switch (pilih) {
                case 1:
                    addData();
                    break;
                case 2:
                    showData();
                    break;
                case 3:
                    updateData();
                    break;
                case 4:
                    deleteData();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan program ini!");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    static void addData() { 
        System.out.println("\n\tMenu Menambahkan Data ");
        System.out.println("====================================");
        System.out.print("Nama Pembayar Zakat : ");
        scanner.nextLine(); 
        String nama = scanner.next();
        System.out.print("Tanggal(DD/MM/YYYY): ");
        scanner.nextLine();
        String tanggal = scanner.next();
        System.out.print("Gender :  ");
        scanner.nextLine();
        String gender = scanner.next();
        System.out.print("Nominal : ");
        int nominal = scanner.nextInt();
        

        Data data = new Data(nama, tanggal, gender, nominal);
        dataList.add(data);
        System.out.println("====================================");
        System.out.println("Data berhasil ditambahkan!");
    }

    static void showData() {// Fungsi showData() untuk melihat data
        System.out.println("\n\tData Pembayar Zakat ");
        System.out.println("====================================");
        if (dataList.isEmpty()) {
            System.out.println("Belum ada data!");
        } else {
            for (int i = 0; i < dataList.size(); i++) {
                System.out.println("\nData ke-" + (i + 1));
                System.out.println("====================================");
                System.out.println("Nama          : " + dataList.get(i).getNama());
                System.out.println("Tanggal       : " + dataList.get(i).getTanggal());
                System.out.println("Gender        : " + dataList.get(i).getGender());
                System.out.println("Nominal       : " + dataList.get(i).getNominal());
                System.out.println("====================================");
            }
        }
    }

    static void updateData() { 
        if (dataList.isEmpty()) {
            System.out.println("\nBelum ada data!");
        } else {
            showData();
            System.out.print("Nomor data yang akan diupdate: ");
            int index = scanner.nextInt() - 1; 

            if (index < 0 || index >= dataList.size()) {
                System.out.println("Nomor data tidak valid!");
            } else {
                System.out.println("\n\tMenu Mengubah Data ");
                System.out.println("====================================");
                System.out.print("Masukkan Nama baru : ");
                String nama = scanner.next();

                System.out.print("Masukkan Tanggal baru : ");
                String tanggal = scanner.next();

                System.out.print("Masukkan Gender baru : ");
                String gender = scanner.next();

                System.out.print("Masukkan Nominal baru : ");
                int nominal = scanner.nextInt();

                Data data = new Data(nama, tanggal, gender, nominal);
                dataList.set(index, data); //ini setnya
                System.out.println("====================================");
                System.out.println("Data berhasil diupdate!");
            }
        }
    }

    static void deleteData() { 
        if (dataList.isEmpty()) {
            System.out.println("\nBelum ada data!");
        } else {
            showData();
            System.out.println("\n\tMenu Menghapus Data ");
            System.out.println("====================================");
            System.out.print("Nomor data yang akan dihapus: ");
            int index = scanner.nextInt() - 1;

            if (index < 0 || index >= dataList.size()) {
                System.out.println("Nomor data tidak valid!");
            } else {
                dataList.remove(index);
                System.out.println("====================================");
                System.out.println("Data berhasil dihapus!");
            }
        }
    }
}
