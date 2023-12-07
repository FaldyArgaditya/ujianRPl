
package SpringHibernate.dao;

import SpringHibernate.model.Pelanggan;
import java.util.List;

public interface Pelanggandao {
    void tambahPelanggan(Pelanggan pelanggan);
    List<Pelanggan> semuaPelanggan();
    Pelanggan dapatkanPelanggan(int id);
    void perbaruiPelanggan(Pelanggan pelanggan);
    void hapusPelanggan(int id);
}
