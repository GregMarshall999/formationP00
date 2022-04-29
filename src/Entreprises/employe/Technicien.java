package Entreprises.employe;

public class Technicien extends Employe
{
    private final int nUnite;
    private final int TECH_MULT = 5;

    public Technicien(String prenom, String nom, int age, String annEE, int nUnite)
    {
        super(prenom, nom, age, annEE);
        this.nUnite = nUnite;
    }


    public double calculerSalaire()
    {
        return nUnite * TECH_MULT;
    }

    public String getTitle() {
        return "Le technicien ";
    }
}
