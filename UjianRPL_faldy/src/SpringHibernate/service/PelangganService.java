/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpringHibernate.service;


import SpringHibernate.model.Pelanggan;
import java.util.List;

public interface PelangganService {
    void tambahPelanggan(Pelanggan pelanggan);
    List<Pelanggan> semuaPelanggan();
    Pelanggan dapatkanPelanggan(int id);
    void perbaruiPelanggan(Pelanggan pelanggan);
    void hapusPelanggan(int id);
}
