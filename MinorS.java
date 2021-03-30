package Service;

import Model.Persoana;
import Model.Minor;
import Repository.MinorR;

import java.util.ArrayList;

public class MinorS {
    private MinorR MinorRepository =new MinorR();
    public MinorS() {
    }
    public ArrayList<Minor> getMinor() {
        return this.MinorRepository.GetMinori();
    }
    public void adaugaMino(Minor x) {
        this.MinorRepository.AdaugaMinor(x);
    }

    public void stergeMino(Minor x) {

        this.MinorRepository.StergeMinor(x);
    }


    public Persoana detaliiDespreMinorulCuNumele(String nume) {

        return this.MinorRepository.DetaliiDespreMinorulCuNumele(nume);
    }
}
