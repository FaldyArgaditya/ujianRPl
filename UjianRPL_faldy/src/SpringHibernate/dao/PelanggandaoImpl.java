package SpringHibernate.dao;
import SpringHibernate.model.Pelanggan;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class PelanggandaoImpl implements Pelanggandao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void tambahPelanggan(Pelanggan pelanggan) {
        sessionFactory.getCurrentSession().save(pelanggan);
    }

    @Override
    public List<Pelanggan> semuaPelanggan() {
        return sessionFactory.getCurrentSession().createQuery("FROM Pelanggan", Pelanggan.class).list();
    }

    @Override
    public Pelanggan dapatkanPelanggan(int id) {
        return (Pelanggan) sessionFactory.getCurrentSession().get(Pelanggan.class, id);
    }

    @Override
    public void perbaruiPelanggan(Pelanggan pelanggan) {
        sessionFactory.getCurrentSession().update(pelanggan);
    }

    @Override
    public void hapusPelanggan(int id) {
        Pelanggan pelanggan = (Pelanggan) sessionFactory.getCurrentSession().get(Pelanggan.class, id);
        if (pelanggan != null) {
            sessionFactory.getCurrentSession().delete(pelanggan);
        }
    }
}
