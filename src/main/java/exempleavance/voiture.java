package exempleavance;

public class voiture
{
    private int puissance;
    private String marque;

    public voiture(int puissance, String marque)
    {
        this.puissance = puissance;
        this.marque = marque;
    }

    @Override
    public String toString()
    {
        return "Voiture{" +
                "puissance=" + puissance +
                ", marque='" + marque +
                '\'' + '}';
    }

    public void setPuissance(int puissance)
    {
        this.puissance = puissance;
    }

    public void setMarque(String marque)
    {
        this.marque = marque;
    }

    public int getPuissance()
    {
        return puissance;
    }

    public String getMarque()
    {
        return marque;
    }
}
