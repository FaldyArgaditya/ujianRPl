
package SpringHibernate.service;

import SpringHibernate.dao.Pelanggandao;
import SpringHibernate.model.Pelanggan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class PelangganServiceImpl implements PelangganService {

    @Autowired
    private Pelanggandao pelangganDAO;

    @Override
    @Transactional
    public void tambahPelanggan(Pelanggan pelanggan) {
        pelangganDAO.tambahPelanggan(pelanggan);
    }

    @Override
    @Transactional
    public List<Pelanggan> semuaPelanggan() {
        return pelangganDAO.semuaPelanggan();
    }

    @Override
    @Transactional
    public Pelanggan dapatkanPelanggan(int id) {
        return pelangganDAO.dapatkanPelanggan(id);
    }

    @Override
    @Transactional
    public void perbaruiPelanggan(Pelanggan pelanggan) {
        pelangganDAO.perbaruiPelanggan(pelanggan);
    }

    @Override
    @Transactional
    public void hapusPelanggan(int id) {
        pelangganDAO.hapusPelanggan(id);
    }
}
