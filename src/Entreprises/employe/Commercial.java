package Entreprises.employe;

public abstract class Commercial extends Employe
{
    private final double chiffreAff;
    private final double POURCENTAGE_COM = .2;

    public Commercial(String prenom, String nom, int age, String annEE, double chiffreAff)
    {
        super(prenom, nom, age, annEE);
        this.chiffreAff = chiffreAff;
    }

    @Override
    public double calculerSalaire()
    {
        return chiffreAff*POURCENTAGE_COM;
    }
}
