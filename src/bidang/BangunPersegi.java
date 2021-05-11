/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bidang;

/**
 *
 * @author istim
 */
public class BangunPersegi implements MenghitungBidang{
        public int panjang, lebar;

    public BangunPersegi(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getPanjang() {
        return panjang;
    }

    public int getLebar() {
        return lebar;
    }

    @Override
    public double menghitungLuas() {
        return this.panjang*this.lebar;
    }

    @Override
    public double menghitungKeliling() {
        return 2*(this.panjang+this.lebar);
    }

}
