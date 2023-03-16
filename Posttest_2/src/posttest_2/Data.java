package posttest_2;

class Data {
    private String nama, tanggal, gender; 
    private int nominal;

    public Data(String nama, String tanggal, String gender, int nominal) {
        this.nama = nama; 
        this.tanggal = tanggal;
        this.gender = gender;
        this.nominal = nominal;
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

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }
}
