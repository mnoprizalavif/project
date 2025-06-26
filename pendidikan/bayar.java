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
public class bayar extends admin {
    
    private String idpembayaran,
                   nama,
                   tanggal,
                   bayar;
    
    public bayar(){}

    public void setIdpembayaran(String idpembayaran) {
        try {
          //erea jika benar
          if (idpembayaran.equals(null) || idpembayaran.equals("")){
              JOptionPane.showMessageDialog(null, "ID PEMBAYARAN Wajib diisi");
              idpembayaran="-";
          } else {
              this.idpembayaran = idpembayaran;
          }
        } catch (Exception salah) {
          //area jika salah
          JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }
    
    public String getIdpembayaran(){
        return this.idpembayaran;
    }
    
    public void setNama(String nama) {
        try {
          //erea jika benar
          if (nama.equals(null) || nama.equals("")){
              JOptionPane.showMessageDialog(null, "Nama Wajib diisi");
              nama="-";
          } else {
              this.nama = nama;
          }
        } catch (Exception salah) {
          //area jika salah
          JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public void setTanggal(String tanggal) {
        try {
          //erea jika benar
          if (tanggal.equals(null) || tanggal.equals("")){
              JOptionPane.showMessageDialog(null, "Tanggal Wajib diisi");
              tanggal="-";
          } else {
              this.tanggal = tanggal;
          }
        } catch (Exception salah) {
          //area jika salah
          JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }
    
    public String getTangggal(){
        return this.tanggal;
    }

    public void setBayar(String bayar) {
        this.bayar = bayar;
    }
    
    public String getBayar(){
        return this.bayar;
    }

     public String infobayar(){
        String pesan = super.infoadmin()+
                "\nNis :"+getIdpembayaran()+
                "\nNama :"+getNama()+
                "\nTanggal :"+getTangggal()+
                "\nBayar :"+getBayar();
        
                JOptionPane.showMessageDialog(null , pesan);

        return pesan;
     }
}
