package employe;

public abstract class Commercial extends Employe
{
    private final double chiffreAff;

    public Commercial(String prenom, String nom, int age, String annEE, double chiffreAff)
    {
        super(prenom, nom, age, annEE);
        this.chiffreAff = chiffreAff;
    }

    @Override
    public double calculerSalaire()
    {
        return (chiffreAff*20)/100;
    }
}
