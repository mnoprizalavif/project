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
public class prodi extends admin {
    
    private String kelas,
            prodi;
    
public prodi(){}

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
         try {
          //erea jika benar
          if (kelas.equals(null) || kelas.equals("")){
              JOptionPane.showMessageDialog(null, "KELAS Wajib diisi");
              kelas="-";
          } else {
              this.kelas = kelas;
          }
        } catch (Exception salah) {
          //area jika salah
          JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
    
    public String infoprodi(){
        String pesan = super.infoadmin()+
                "\nKelas :"+getKelas()+
                "\nProdi :"+getProdi();
        
                JOptionPane.showMessageDialog(null , pesan);

        return pesan;
     }


    
}
