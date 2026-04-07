public class AdapterCheminee implements Appareil{

    private Cheminee cheminee;

    public AdapterCheminee(Cheminee cheminee) {
        this.cheminee = cheminee;
    }

    @Override
    public void allumer() {
        this.cheminee.changerIntensite(10+this.cheminee.getLumiere());
    }

    @Override
    public void eteindre() {
        this.cheminee.changerIntensite(0);
    }

    @Override
    public String toString() {
        return this.cheminee.toString();
    }
}
