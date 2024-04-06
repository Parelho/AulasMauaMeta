public class Inimigo {
    private int dano;
    private int vida;

    public Inimigo(int dano, int vida){
        this.dano = dano;
        this.vida = vida;
    }
    
    public int getVida(){
        return vida;
    }

    public void atacar(Personagem alvo){
        alvo.recebeAtaque(dano);
        if(alvo.getVida() <= 0){
            System.out.println("Você morreu!");
        }
        else{
            System.out.printf("Você tomou %d de dano e ficou com %d de vida.\n", dano, alvo.getVida());
        }
    }
    
    public void recebeAtaque(int danoTomado){
        vida -= danoTomado;
    }
}
