/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbo_day7_irsalfaal;
import person.person;

/**
 *
 * @author A-15
 */
public class latihanpbo7 {
    public static void main(String[] args){
        System.out.println("latihanpbo7");
        String judulbuku = "java 1";
        String authorbuku = "yun xuan";
        String judulbuku2 = "java 2";
        String authorbuku2 = "xin yuan";
        
        Buku buku1 = new Buku();
        Buku buku2 = new Buku();
        buku1.judul = "java 1"; 
        buku1.author.nama = "yun xuan";
        buku2.judul = "java 2"; 
        buku2.author.nama = "xin yuan";
        
        System.out.println(buku1.judul);
        buku1.author.sebutNama();
//        System.out.printIn(buku1.author);
        System.out.println(buku2.judul);
        buku2.author.sebutNama();
//        System.out.printIn(buku2.author);
        System.out.println(buku1.tahunpenerbitan);
        System.out.println(buku1.harga.beli);
        System.out.println(buku1.penerbit.nama);
        
        
        
    }
    
}

class Buku{
    String judul;
    person author = new person();
    int tahunpenerbitan = 2024;
    Harga harga = new Harga();
    Perusahaanbuku penerbit = new Perusahaanbuku();
    
}

class Harga{
    double jual = 100000.00;
    double beli = 80000.00;
}

