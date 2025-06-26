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
public class admin {
    private String id,
           username,
           kontak;
    
    public admin(){
        
    }

    public admin(String id, String username, String kontak) {
        this.id = id;
        this.username = username;
        this.kontak = kontak;
    }

    public String ambilId() {
        return id;
    }

    public void isiId(String id) {
        this.id = id;
    }

    public String ambilUsername() {
        return username;
    }

    public void isiUsername(String username) {
        this.username = username;
    }

    public String ambilKontak() {
        return kontak;
    }

    public void isiKontak(String kontak) {
        this.kontak = kontak;
    }
    
    public String infoadmin(){
        String pesan ="ID :"+ambilId()+
                "\nUSERNAME :"+ambilUsername()+
                "\nKONTAK :"+ambilKontak();
        
                JOptionPane.showMessageDialog(null , pesan);

        return pesan;
    }
    
}
