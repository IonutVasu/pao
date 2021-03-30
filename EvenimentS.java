package Service;

import Model.Data;
import Model.Eveniment;
import Repository.EvenimentR;

import java.util.ArrayList;

public class EvenimentS {
    private EvenimentR EvenimentRepository =new EvenimentR();



    public EvenimentS() {
    }

    public ArrayList<Eveniment> getEveniment() {
        return this.EvenimentRepository.GetEvenimente();
    }

    public void adaugaEveniment(Eveniment x) {


        this.EvenimentRepository.AdaugaEveniment(x);
    }

    public void stergeEveniment(Eveniment x) {

        this.EvenimentRepository.StergeEveniment(x);
    }


    public Eveniment detaliiDespreEvenimentulDinData(Data data) {

        return this.EvenimentRepository.DetaliiDespreEvenimentulDinData(data);
    }
    public void SorteazaLexicograficDupaTipulEvenimentului(){
        this.EvenimentRepository.Sort();
    }
}
