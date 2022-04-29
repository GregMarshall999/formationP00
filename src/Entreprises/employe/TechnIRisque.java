package Entreprises.employe;

public class TechnIRisque extends Technicien implements IRisque
{
    public TechnIRisque(String prenom, String nom, int age, String annEE, int nUnite) {
        super(prenom, nom, age, annEE, nUnite);
    }

    public double calculerSalaire()
    {
        return super.calculerSalaire() + RISQ_BONUS;
    }
}
