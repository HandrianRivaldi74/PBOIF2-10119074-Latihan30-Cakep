/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2_10119074_latihan30_cakep;

import java.util.Scanner;

/**
 *
 * @author Acer
 * NAMA     : Handrian Rivaldi
 * KELAS    : PBOIF2
 * NIM      : 10119074
 * Deskripsi : Program kepribadian dari warna
 * 
 */
public class PBOIF2_10119074_Latihan30_Cakep {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        String jawab;
        String normal   = "\u001b[0m";
        String merah    = "\u001b[31m";
        String hijau    = "\u001b[32m";
        String kuning   = "\u001b[33m";
        String biru     = "\u001b[34m";
        String ungu     = "\u001b[35m";
        String birumuda = "\u001b[36m";

        System.out.print(merah + "Kamu " + hijau + "ngerjain sendiri " + kuning + "latihan 17 sampe " + biru + "latihan 30 ini? \nJawab " + merah + "(Yoi/Enggak) : " + normal);
        jawab = input.next();
        jawab = jawab.toUpperCase();
        System.out.println();
        switch (jawab) {
            case ("YOI"):
                System.out.println(merah + "Cakep bener. " + ungu + "Good Job" + normal);
                break;
            case ("ENGGAK"):
                System.out.println(merah + "Tetep cakep sih.\n" + birumuda + "Sing penting paham konsep nya yee.\n" + normal + "Keep the code works dude");
                break;
            default:
                System.out.println(" ");
        }
    }
    
}
