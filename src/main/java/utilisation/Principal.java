package utilisation;

import api.DeuxEntierPourUn;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Principal
{
    public static void main(String[] args)
    {
        DeuxEntierPourUn ref=(int e1, int e2)->
        {
            return e1+e2;
        };

        System.out.println(ref.calcul(2,3));
        ref.methodeParDefaut("Genial");
        System.out.println();

        List<String> characters;
        characters=List.of("Mikasa", "Asuna", "Kazuto", "Lucyna", "Emilia");

        // Une méthode pour afficher les éléments d'une liste

        for (String character : characters)
        {
            System.out.println(character);
        }

        System.out.println();

        // Méthode en utilisant une interface fonctionnelle "Consumer"
        // Toutes méthodes qui prennent dans paramètres et qui renvoient rien sont des "Consumer"

        Consumer<String> charactersConsumer=(String character)->
        {
            System.out.println(character);
        };

        characters.forEach(charactersConsumer);
        System.out.println();

        // Utilisation de la méthode par défaut "andThen"

        Consumer<String> firstConsumer=(String characterFirstName)->
        {
            System.out.print(characterFirstName.toUpperCase());
        };

        Consumer<String> secondConsumer=(String characterFirstName)->
        {
            System.out.println(" (" + characterFirstName.length() + ")");
        };

        Consumer<String> thirdConsumer = firstConsumer.andThen(secondConsumer);

        characters.forEach(thirdConsumer);
        System.out.println();
        characters.forEach(firstConsumer.andThen(secondConsumer));
        System.out.println();

        // écriture beaucoups plus synthétique

        characters.forEach((characterFirstName)->
        {
            System.out.println(characterFirstName.toUpperCase());
        });

        System.out.println();

        // Compact à mort

        characters.forEach(System.out::println);
        System.out.println();

        // Test de l'interface "Function"
        Function<Double, Double> f=(x)->
        {
            return 2*x+3;
        };

        Function<Double, Double> g=(x)->
        {
            return x*x;
        };

        System.out.println("test de f : " + f.apply(3.0));
        System.out.println("test de g : " + g.apply(4.0));
        // Composition "(g o f)(x) -> g(f(x))
        System.out.println("test de o : " + g.compose(f).apply(5.0));
    }
}
