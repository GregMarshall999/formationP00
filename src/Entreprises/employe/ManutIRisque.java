package Entreprises.employe;

public class ManutIRisque extends Manutentionnaire implements IRisque
{
    public ManutIRisque(String prenom, String nom, int age, String annEE, int heureTr) {
        super(prenom, nom, age, annEE, heureTr);
    }

    public double calculerSalaire() {
        return super.calculerSalaire() + RISQ_BONUS;
    }
}
