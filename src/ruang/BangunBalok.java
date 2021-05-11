/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruang;
import bidang.BangunPersegi;
/**
 *
 * @author istim
 */
public class BangunBalok extends BangunPersegi implements MenghitungRuang{
    
    private int tinggi;
    public BangunBalok(int panjang, int lebar, int tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double menghitungVolume() {
        return menghitungLuas()*tinggi;
    }

    @Override
    public double menghitungLuasPermukaan() {
        int panjangPersegi = getPanjang();
        int lebarPersegi = getLebar();
        return 2*(menghitungLuas())+2*(panjangPersegi*tinggi)+2*(lebarPersegi*tinggi);
    }
}

