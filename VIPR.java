package Repository;
import Model.Client;
import Model.VIP;
import java.util.ArrayList;
public class VIPR {
    ArrayList<VIP> Vipuri= new ArrayList<VIP>();
    public VIPR(){

    }
    public void AdaugaVIP(VIP x){
        this.Vipuri.add(x);
    }
    public void StergeVIP(VIP x){
        this.Vipuri.remove(x);
    }

    public Client DetaliiDespreVipulCuNumele(String Nume){
        int i=0;
        for (i=0;i<this.Vipuri.size();i++)
            if(this.Vipuri.get(i).getNume().equals(Nume))
                return this.Vipuri.get(i);
        return null;
    }
    public ArrayList<VIP> GetVipuri() {
        return Vipuri;
    }
    public void Update(String Nume, VIP x){
        for (int i=0;i<this.Vipuri.size();i++)
        {
            if(this.Vipuri.get(i).getNume().equals(Nume)) {
                this.Vipuri.get(i).setNume(x.getNume());
                this.Vipuri.get(i).setPrenume(x.getPrenume());
                this.Vipuri.get(i).setVarsta(x.getVarsta());
                this.Vipuri.get(i).setId_client(x.getId_client());
                this.Vipuri.get(i).setDiscount(x.getDiscount());
                this.Vipuri.get(i).setBani_consumatie(x.getBani_consumatie());
            }
        }
    }
    public void Sort(){
        for (int i=0 ; i< this.Vipuri.size() - 1;i++)
            for (int j=i+1 ; j<this.Vipuri.size() ; j++)
            {
                if (this.Vipuri.get(i).getBani_consumatie()< this.Vipuri.get(j).getBani_consumatie())
                {
                    VIP aux = new VIP();

                    aux.setBani_consumatie(this.Vipuri.get(i).getBani_consumatie());
                    aux.setNume(this.Vipuri.get(i).getNume());
                    aux.setVarsta(this.Vipuri.get(i).getVarsta());
                    aux.setPrenume(this.Vipuri.get(i).getPrenume());
                    aux.setId_client(this.Vipuri.get(i).getId_client());
                    aux.setDiscount(this.Vipuri.get(i).getDiscount());

                    this.Vipuri.get(i).setBani_consumatie(this.Vipuri.get(j).getBani_consumatie());
                    this.Vipuri.get(i).setNume(this.Vipuri.get(j).getNume());
                    this.Vipuri.get(i).setVarsta(this.Vipuri.get(j).getVarsta());
                    this.Vipuri.get(i).setPrenume(this.Vipuri.get(j).getPrenume());
                    this.Vipuri.get(i).setId_client(this.Vipuri.get(j).getId_client());
                    this.Vipuri.get(i).setDiscount(this.Vipuri.get(j).getDiscount());

                    this.Vipuri.get(j).setBani_consumatie(aux.getBani_consumatie());
                    this.Vipuri.get(j).setNume(aux.getNume());
                    this.Vipuri.get(j).setVarsta(aux.getVarsta());
                    this.Vipuri.get(j).setPrenume(aux.getPrenume());
                    this.Vipuri.get(j).setId_client(this.Vipuri.get(j).getId_client());
                    this.Vipuri.get(j).setDiscount(this.Vipuri.get(j).getDiscount());
                    j--;
                }
            }
    }
}
