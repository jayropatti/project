package prac2B;

public class Voetbalclub {
    private String naam;
    private int aantalGewonnen;
    private int aantalVerloren;
    private int aantalGelijk;

    public Voetbalclub(String nm){
        naam = nm;
    }

    public Voetbalclub() {
        naam = "";
        aantalGewonnen = 0;
        aantalVerloren = 0;
        aantalGelijk = 0;
    }


    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }

    public int aantalGespeeld() {
        int aantalGespeeld = aantalGewonnen + aantalVerloren + aantalGelijk;
        return aantalGespeeld;
    }

    public int aantalPunten() {
        int aantalPunten = (aantalGewonnen * 3) + aantalGelijk;
        return aantalPunten;
    }

    public String toString() {
        String s = aantalGewonnen + " " + aantalVerloren + " " + aantalGelijk + aantalPunten() + " " + aantalGespeeld();
        return s;
    }

}


