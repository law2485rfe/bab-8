/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab8;

import javax.swing.JOptionPane;

/**
 *
 * @author MyBook Hype AMD
 */

public class Bab8 {
    public static void main(String[] args) {
        // ambil jumlah kelas
       int jumlahKelas = Integer.parseInt(
    JOptionPane.showInputDialog("Masukan jumlah kelas : ")
);


        String isiKelas[][][] = new String[jumlahKelas][][];
        String namaKelas[] = new String[jumlahKelas];

        for (int kelas = 0; kelas < jumlahKelas; kelas++) {
            // ambil nama kelas
            namaKelas[kelas] = JOptionPane.showInputDialog(
                    null,
                    "Nama Kelas : ",
                    "Masukan Nama Kelas",
                    JOptionPane.INFORMATION_MESSAGE);

            // ambil jumlah kursi per kelas
            int jumlahKursi = Integer.parseInt(JOptionPane.showInputDialog(
                    null,
                    "Jumlah murid masing-masing kelas : ",
                    "Input",
                    JOptionPane.INFORMATION_MESSAGE));

            isiKelas[kelas] = new String[jumlahKursi][];

            System.out.println("Kelas " + namaKelas[kelas] + " : ");
            for (int kursi = 0; kursi < jumlahKursi; kursi++) {
                String namaSiswa = JOptionPane.showInputDialog(
                        null,
                        "Nama Siswa", 
                        "Kelas " + namaKelas[kelas],
                        JOptionPane.INFORMATION_MESSAGE);

                // simpan nama siswa
                isiKelas[kelas][kursi] = new String[]{namaSiswa};

                System.out.println("Nama Siswa: " + isiKelas[kelas][kursi][0]);
            }

            System.out.println("---------------------------------------------------");
        }
    }
}

    
    
