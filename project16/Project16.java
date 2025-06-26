/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project16;
import pendidikan.admin;
import frame.frameadmin;
import pendidikan.bayar;
import frame.framebayar;
import pendidikan.siswa;
import frame.framesiswa;
import pendidikan.prodi;
import frame.frameprodi;
/**
 *
 * @author ACER
 */
public class Project16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        bayar tes = new bayar();
//        tes.isiId("ID001");
//        tes.isiUsername("Avif");
//        tes.isiKontak("08XXXXX");
//        tes.setNis("234");
//        tes.setNama("Alen");
//        tes.setTanggal("27-11-2025");
//        tes.setBayar("Rp100.000");
//        
//        System.out.println(tes.infobayar());

          frameadmin formAdmin = new frameadmin();
          formAdmin.setVisible(true);
          
          framebayar formBayar = new framebayar();
          formBayar.setVisible(true);
          
          framesiswa formSiswa = new framesiswa();
          formSiswa.setVisible(true);
          
          frameprodi formProdi = new frameprodi();
          formProdi.setVisible(true);
    }
    
}
