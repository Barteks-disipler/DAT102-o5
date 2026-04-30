public class OPG2 {
    // a) Metoden går alltid til venstre subtree, sjekker noden, går alltid til høyre subtree.
    // Så den gjør en inorden-traversering av hele treet uansett hva min og maks er.
    // I et binært søketre så er alle verdier i venstre subtree mindre enn noden og alle verdier i høyre subtre er strørre
    // Hvis en node har en verdi som er mindre enn min så vil hele venstre subtre og inneholde verdier som er for små
    // så de trengs derfor ikke å traverseres, samme gjelder for høyre. Metoden tenker ikke på dette og er derfor ueffektiv.

    //b)

    private void skrivVerdierRek(BinaerTreNode<T> t, T min, T maks) {
        if (t == null) return;

        int cmpMin = t.getElement().compareTo(min);
        int cmpMax = t.getElement().compareTo(maks);

        if (cmpMin > 0) {
            skrivVerdierRek(t.getVenstre(), min, maks);
        }

        if (cmpMin >= 0 && cmpMax <= 0) {
            System.out.print(t.getElement() + " ");
        }

        if (cmpMax < 0) {
            skrivVerdierRek(t.getHogre(), min, maks);
        }
    }
}
