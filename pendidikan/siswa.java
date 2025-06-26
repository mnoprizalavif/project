/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pendidikan;
import javax.swing.JOptionPane;
/**
 *
 * @author ACER
 */
public class siswa extends admin{
    
    private String nis,
            nama_siswa,
            nama_ayah,
            nama_ibu;
    
    public siswa(){}

    public String getNis() {
        return nis;
    }

    public void setNis(String nis) {
       try {
          //erea jika benar
          if (nis.equals(null) || nis.equals("")){
              JOptionPane.showMessageDialog(null, "NIS Wajib diisi");
              nis="-";
          } else {
              this.nis = nis;
          }
        } catch (Exception salah) {
          //area jika salah
          JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }

    public String getNama_siswa() {
        return nama_siswa;
    }

    public void setNama_siswa(String nama_siswa) {
        this.nama_siswa = nama_siswa;
    }

    public String getNama_ayah() {
        return nama_ayah;
    }

    public void setNama_ayah(String nama_ayah) {
        this.nama_ayah = nama_ayah;
    }

    public String getNama_ibu() {
        return nama_ibu;
    }

    public void setNama_ibu(String nama_ibu) {
        this.nama_ibu = nama_ibu;
    }
    
    public String infosiswa(){
        String pesan = super.infoadmin()+
                "\nNIS :"+getNis()+
                "\nNAMA SISWA :"+getNama_siswa()+
                "\nNAMA AYAH :"+getNama_ayah()+
                "\nNAMA IBU :"+getNama_ibu();
        
                JOptionPane.showMessageDialog(null , pesan);

        return pesan;
     }

}
