package posttest_3;

class Data {
    private String nama, tanggal, gender; 

    public Data(String nama, String tanggal, String gender) {
        this.nama = nama; 
        this.tanggal = tanggal;
        this.gender = gender;
    }    
  
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
