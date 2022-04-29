package Entreprises.employe;

public class Representant extends Commercial
{
    private final int REP_BONUS = 800;

    public Representant(String prenom, String nom, int age, String annEE, double chiffreAff)
    {
        super(prenom, nom, age, annEE, chiffreAff);
    }

    public double calculerSalaire()
    {
        return super.calculerSalaire() + REP_BONUS;
    }

    public String getTitle() {
        return "Le représentant ";
    }
}
