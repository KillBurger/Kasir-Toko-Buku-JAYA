/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokobukujaya;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class TokoBukuJaya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String identitas = "Muhammad Yusuf Ragil Syah An Naas / XRPL6 / 33";
        System.out.println("Identitas: " + identitas);
        System.out.println("\nToko Buku Jaya, membuat anda semakin JAYA\nSilahkan berbelanja\n");
        Scanner Kasir = new Scanner(System.in);
        String nama_barang;
        byte proses_diulang, jumlah_barang;
        double harga_barang, diskon, harga_bayar, total_harga_barang;
        do {
            System.out.print("Nama Barang: ");
            nama_barang = Kasir.next();
            System.out.print("Jumlah Barang: ");
            jumlah_barang = Kasir.nextByte();
            System.out.print("Harga Barang Satuan: ");
            harga_barang = Kasir.nextDouble();
            total_harga_barang = jumlah_barang * harga_barang;
            diskon = 0;
            if (total_harga_barang > 1000000) {

                diskon = 0.10 * total_harga_barang;
            }
            if (total_harga_barang > 200000) {
                diskon = 0.20 * total_harga_barang;
            }
            if (total_harga_barang > 500000) {
                diskon = 0.50 * total_harga_barang;
            }
            harga_bayar = total_harga_barang - diskon;
            System.out.println("Total Harga Barang: " + String.format("%1$,.2f", total_harga_barang));
            System.out.println("Diskon: " + String.format("%1$,.2f", diskon));
            System.out.println("Harga Bayar: " + String.format("%1$,.2f", harga_bayar));
            System.out.print("Apakah ingin membeli lagi?\n1.Ya\n2.Tidak: ");
            proses_diulang = Kasir.nextByte();
        } while (proses_diulang == 1);
        System.out.print("Terimakasih atas pembeliannya\nSampai Jumpa, Hati-hati");
    }
}
