package SpringHibernate;


import SpringHibernate.configuration.configuration;
import SpringHibernate.service.PelangganService;
import SpringHibernate.View.PelangganForm;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    private static ApplicationContext applicationContext;

    public static void main(String[] args) {
        // Inisialisasi ApplicationContext dengan konfigurasi Java
        applicationContext = new AnnotationConfigApplicationContext(configuration.class);
        new PelangganForm(getPelangganService()).setVisible(true);
    }

    public static PelangganService getPelangganService() {
        return applicationContext.getBean(PelangganService.class);
    }
}
