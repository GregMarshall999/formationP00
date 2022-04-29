package Entreprises.employe;

public class Manutentionnaire extends Employe
{
    private final int heureTr;
    private final int MAN_MULT = 65;

    public Manutentionnaire(String prenom, String nom, int age, String annEE, int heureTr)
    {
        super(prenom, nom, age, annEE);
        this.heureTr = heureTr;
    }

    public double calculerSalaire()
    {
        return heureTr * MAN_MULT;
    }

    public String getTitle() {
        return "Le manut. ";
    }
}
