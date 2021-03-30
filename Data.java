package Model;

public class Data {

    private int an;
    private int luna;
    private int zi;

    public Data() {
    }

    public Data(int zi, int luna, int an) {
        this.zi = zi;
        this.luna=luna;
        this.an= an;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public int getZi() {
        return zi;
    }

    public void setZi(int zi) {
        this.zi = zi;
    }

    public int getLuna() {
        return luna;
    }

    public void setLuna(int luna) {
        this.luna = luna;
    }

    @Override
    public String toString() {
        return "Model.Data{" +
                "an=" + an +
                ", luna=" + luna +
                ", zi=" + zi +
                '}';
    }
}
