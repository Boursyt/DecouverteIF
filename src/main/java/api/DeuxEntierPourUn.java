package api;

@FunctionalInterface
public interface DeuxEntierPourUn
{
    int calcul(int e1, int e2);

    default void methodeParDefaut(String word)
    {
        System.out.println(word);
    }
}
