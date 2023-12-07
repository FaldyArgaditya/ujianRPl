
package SpringHibernate.controller;


import SpringHibernate.model.Pelanggan;
import SpringHibernate.service.PelangganService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/pelanggan")
public class PelangganController {

    private final PelangganService pelangganService;

    @Autowired
    public PelangganController(PelangganService pelangganService) {
        this.pelangganService = pelangganService;
    }

    @RequestMapping(value = "/daftar", method = RequestMethod.GET)
    public String daftarPelanggan(Model model) {
        model.addAttribute("daftarPelanggan", pelangganService.semuaPelanggan());
        return "daftar-pelanggan";
    }

    @RequestMapping(value = "/tambah", method = RequestMethod.GET)
    public String tampilFormTambah(Model model) {
        model.addAttribute("pelanggan", new Pelanggan());
        return "form-tambah-pelanggan";
    }

    @RequestMapping(value = "/simpan", method = RequestMethod.POST)
    public String simpanPelanggan(@ModelAttribute("pelanggan") Pelanggan pelanggan) {
        pelangganService.tambahPelanggan(pelanggan);
        return "redirect:/pelanggan/daftar";
    }

    @RequestMapping(value = "/ubah/{id}", method = RequestMethod.GET)
    public String tampilFormUbah(@PathVariable int id, Model model) {
        Pelanggan pelanggan = pelangganService.dapatkanPelanggan(id);
        model.addAttribute("pelanggan", pelanggan);
        return "form-ubah-pelanggan";
    }

    @RequestMapping(value = "/perbarui", method = RequestMethod.POST)
    public String perbaruiPelanggan(@ModelAttribute("pelanggan") Pelanggan pelanggan) {
        pelangganService.perbaruiPelanggan(pelanggan);
        return "redirect:/pelanggan/daftar";
    }

    @RequestMapping(value = "/hapus/{id}", method = RequestMethod.GET)
    public String hapusPelanggan(@PathVariable int id) {
        pelangganService.hapusPelanggan(id);
        return "redirect:/pelanggan/daftar";
    }
}
