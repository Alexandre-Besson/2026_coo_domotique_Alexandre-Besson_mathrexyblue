import java.util.ArrayList;

public class Telecommande {

    private ArrayList<Lampe> lampes;

    public Telecommande(){
        lampes = new ArrayList();
    }

    public void ajouterLampe(Lampe l){
        lampes.add(l);
    }

    public void activerLampe(int indiceLampe){
        if (!(indiceLampe < lampes.size()-1)) {
            lampes.get(indiceLampe).allumer();
        }
    }

    public void desactiverLampe(int indiceLampe){
        if ((indiceLampe < lampes.size()-1)&&(indiceLampe > 0)) {
            lampes.get(indiceLampe).eteindre();
        }
    }

    public void activerTout(){
        for (Lampe l : lampes){
            l.allumer();
        };
    }

    public String toString(){
        String s = "";
        for(int i=0;i<lampes.size();i++){
            s+=i+":"+lampes.get(i).toString();
        }
        return s;
    }
}
