package Service;

import Model.Persoana;
import Model.VIP;
import Repository.VIPR;

import java.util.ArrayList;

public class VIPS {
    private VIPR VIPRepository =new VIPR();

    public VIPS() {
    }
    public ArrayList<VIP> getVipur() {
        return this.VIPRepository.GetVipuri();
    }
    public void adaugaVIP(VIP x) {
        this.VIPRepository.AdaugaVIP(x);
    }

    public void stergeVIP(VIP x) {

        this.VIPRepository.StergeVIP(x);
    }


    public Persoana detaliiDespreVipulCuNumele(String nume) {
        
        return this.VIPRepository.DetaliiDespreVipulCuNumele(nume);
    }
    public void updateVipulCuNumele(String nume, VIP x){
        this.VIPRepository.Update(nume,x);
    }


    public void sorteazaCrescatorDupaBugetulConsumabil(){
        this.VIPRepository.Sort();

}
}
