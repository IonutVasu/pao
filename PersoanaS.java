package Service;
import Model.Persoana;
import Repository.PersoanaR;

import java.util.ArrayList;

public class PersoanaS {
    private PersoanaR persoanaRepository =new PersoanaR();

    public PersoanaS() {
    }

    public ArrayList<Persoana> getPersoana() {
        return this.persoanaRepository.GetPersoane();
    }

    public void adaugaPersoana(Persoana x){
        this.persoanaRepository.AdaugaPersoane(x);
    }

    public void stergePersoana(Persoana x){
        this.persoanaRepository.StergePersoane(x);
    }

    public Persoana detaliiDesprePersoanaCuNumele(String nume) {
        return this.persoanaRepository.DetaliiDesprePersoanCuNumele(nume);
    }
    public void updatePersoanaCuNumele(String nume, Persoana x){
        this.persoanaRepository.Update(nume,x);

    }

    public void sorteazaCrescatorDupaVarsta(){
        this.persoanaRepository.Sort();
    }
}
