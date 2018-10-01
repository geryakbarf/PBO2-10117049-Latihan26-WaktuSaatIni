/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117049.latihan26.waktusaatini;

/**
 *
 * @author Gery Akbar Fauzi
 * Nama : Gery Akbar Fauzi 
 * Kelas : PBO2 
 * Nim : 10117049
 * Deskripsi Program : Program ini berisi program untuk menampilkan waktu
 * saat ini
 */
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class PBO210117049Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Objek Tanggal

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat tanggal = new SimpleDateFormat("EEEE, d MMMM yyyy, "
                + "HH:mm:ss");
               
        String kalender = tanggal.format(calendar.getTime());
        
        System.out.println("Hari ini adalah hari : "+kalender);
    }

}
