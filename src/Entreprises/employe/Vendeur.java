package Entreprises.employe;

public class Vendeur extends Commercial
{
    private final double COM_BONUS = 400;

    public Vendeur(String prenom, String nom, int age, String annEE, double chiffreAff)
    {
        super(prenom, nom, age, annEE, chiffreAff);
    }

    @Override
    public double calculerSalaire() {
        return super.calculerSalaire() + COM_BONUS;
    }

    public String getTitle() {
        return "Le vendeur ";
    }
}
