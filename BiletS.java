package Service;

import Model.Bilet;
import Repository.BiletR;

import java.util.ArrayList;

public class BiletS {
    private BiletR BiletRepository =new BiletR();

    public BiletS() {
    }

    public ArrayList<Bilet> getBilet() {
        return this.BiletRepository.GetBilete();
    }

    public void adaugaBilet(Bilet x){
        this.BiletRepository.AdaugaBilet(x);
    }

    public void stergeBilet(Bilet x){
        this.BiletRepository.StergeBilet(x);
    }

    public Bilet detaliiDespreBiletCuIdul(int id_bilet) {
        return this.BiletRepository.DetaliiDespreBiletulCuIdul(id_bilet);
    }
    public void UpdateBiletulCuIdul(int id_bilet, Bilet x){
        this.BiletRepository.Update(id_bilet,x);

    }
    public void sorteazaCrescatorDupaPret(){
        this.BiletRepository.Sort();
    }
}
