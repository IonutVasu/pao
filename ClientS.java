package Service;

import Model.Client;
import Repository.ClientR;


import java.util.ArrayList;

public class ClientS {
    private ClientR ClientRepository =new ClientR();

    public ClientS() {
    }

    public ArrayList<Client> getClient() {
        return this.ClientRepository.GetClienti();
    }

    public void adaugaClient(Client x){
        this.ClientRepository.AdaugaClient(x);
    }

    public void stergeClient(Client x){
        this.ClientRepository.StergeClient(x);
    }

    public Client detaliiDespreClientCuNumele(String nume) {
        return this.ClientRepository.DetaliiDespreClientulCuNumele(nume);
    }
    public void UpdateClientulCuNumele(String nume, Client x){
        this.ClientRepository.Update(nume,x);

    }
    public void sorteazaCrescatorDupaDiscaunt(){
        this.ClientRepository.Sort();
    }
}
