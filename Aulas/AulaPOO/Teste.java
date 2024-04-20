public class Teste {
    public static void main(String[] args) {
        Personagem p1 = new Personagem(2, 10, 1);
        Inimigo i1 = new Inimigo(1, 4);

        p1.atacar(i1);
        i1.atacar(p1);
        p1.atacar(i1);
        Inimigo boss = new Inimigo(5, 50);
        boss.atacar(p1);
        p1.atacar(boss);
        boss.atacar(p1);
        Aliado a1 = new Aliado(5, 2);
        a1.curar(p1);
        // a1.curar(p1);
        // a1.curar(p1);
        // a1.curar(boss);
        boss.atacar(p1);
    }
}