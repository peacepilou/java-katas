# java-katas

Des petits exercices Java, chacun avec ses tests JUnit. Tu écris la méthode, tu lances le test : quand il passe au vert, tu as fini le kata.

## Ce qu'il te faut

- Le JDK 21 : dans ton terminal, `javac --version` affiche `javac 21…`.
- Maven : `mvn -v` affiche `Apache Maven 3…`.
- IntelliJ IDEA.

## L'ouvrir

1. Dans IntelliJ, clique sur **Open** et choisis le dossier `java-katas` (celui qui contient `pom.xml`).
2. Dans **File > Project Structure > Project**, choisis le JDK 21.

## Faire un kata

1. Ouvre le kata dans `src/main/java/`, par exemple `fundamentals/FizzBuzz.java`. L'énoncé est en haut du fichier, avec des exemples.
2. Remplace le `// TODO` par ton code.
3. Lance son test, au choix :
   - dans IntelliJ, ouvre `src/test/java/fundamentals/FizzBuzzTest.java` et clique sur la flèche verte à côté de `class FizzBuzzTest` ;
   - dans le terminal, à la racine du projet : `mvn test -Dtest=FizzBuzzTest`.

Tant que ton code est faux, le test affiche ce qu'il attendait et ce que ta méthode a renvoyé :

```
expected: <Fizz> but was: <>
```

Quand tout est vert, passe au suivant. Ne modifie pas les tests : ils font partie de l'énoncé.

## Les katas à faire

### Après le chapitre syntaxe : `fundamentals`

Des méthodes `static`, des `if`, des boucles. Les katas sur les tableaux te donnent la syntaxe `int[]` dans leur énoncé.

| Kata | Ce que tu travailles |
|---|---|
| `HelloYou` | les `String`, le cas `null` |
| `FizzBuzz` | `if`, le modulo `%` |
| `MathMin` | `if`, les types vérifiés par le compilateur |
| `MathPow` | `for`, le type `long` |
| `SumOfMultiples` | `for` et un total |
| `Average` | la division entière et `double` |
| `CountLetters` | parcourir une `String`, le type `char` |
| `FoundMin` | parcourir un tableau |
| `SumOfOdds` | parcourir un tableau, filtrer |
| `InverseValues` | créer un nouveau tableau |
| `SocialLike` | un tableau de `String`, plusieurs cas |

### Après le chapitre ArrayList : `collections`

Des `List`, tes propres classes, des exceptions.

| Kata | Ce que tu travailles |
|---|---|
| `OnlyOdds` | filtrer une liste dans une nouvelle liste |
| `Uniq` | comparer un élément au précédent |
| `Censorship` | découper une phrase, la recoller |
| `TodoList` | une classe à toi, ses attributs, ses exceptions |
| `WaitingLine` | une file d'attente, `IllegalStateException` |
| `RomanNumerals` | nouvelle notion : `Map` (la syntaxe est dans l'énoncé) |

### Après le chapitre ArrayList : `owntests`

Ici, tu écris les tests toi-même. Chaque fichier de test contient un premier exemple : ajoute un test par règle de l'énoncé, puis écris le code qui les fait passer.

| Kata | Ce que tu travailles |
|---|---|
| `Palindrome` | lire une `String` dans les deux sens |
| `StringCompare` | comparer deux `String` position par position |
| `AbbreviateNames` | découper un nom, mettre en majuscules |

## Bonus

Pour aller plus loin, quand le reste est vert. Leur énoncé commence par « Bonus ».

| Kata | Dossier | Ce que tu travailles |
|---|---|---|
| `Soccer` | `fundamentals` | compter dans un tableau, refuser une valeur inconnue |
| `TennisScore` | `collections` | traduire un score, beaucoup de cas |
| `MorseCode` | `collections` | une `Map` pour traduire du morse |

## Tout lancer d'un coup

`mvn test` lance tous les tests du projet. Au départ, tu vois surtout du rouge. Chaque kata passe au vert quand tu le termines.
