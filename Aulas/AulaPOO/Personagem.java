public class Personagem{
    private int dano;
    private int vidaMaxima;
    private int vida;
    private int xp;
    private int nivel;

    public Personagem(int dano, int vida, int nivel){
        this.dano = dano;
        this.vida = vida;
        vidaMaxima = vida;
        this.nivel = nivel;
    }

    public int getVida(){
        return vida;
    }

    public void atacar(Inimigo alvo){
        alvo.recebeAtaque(dano);
        if(alvo.getVida() <= 0){
            xp += 10;
            System.out.println("Você matou o alvo!");
            System.out.printf("Sua xp aumentou para %d!\n", xp);
            if(xp >= nivel*10){
                levelUp();
            }
        }
        else{
            System.out.printf("O alvo tomou %d de dano e ficou com %d de vida.\n", dano, alvo.getVida());
        }
    }

    public void recebeAtaque(int danoTomado){
        vida -= danoTomado;
    }

    public void regenerar(int cura){
        if(vida == vidaMaxima){
            System.out.println("Sua vida já está cheia!");
        }
        else{
            vida += cura;
            if(vida > vidaMaxima){
                vida = vidaMaxima;
            }
            System.out.printf("Você se regenerou para %d de vida!\n", vida);
        }
    }

    private void levelUp(){
        dano += 1;
        vidaMaxima += 5;
        vida += 5;
        xp -= nivel*10;
        System.out.printf("Você subiu de nível!\nSeu dano aumentou para: %d!\nSua vida aumentou de %d para %d!\nSua xp atual é %d.\n", dano, vidaMaxima-5, vidaMaxima, xp);
    }
}