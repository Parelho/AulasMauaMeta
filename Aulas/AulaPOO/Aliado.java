public class Aliado {
    private int cura;
    private int vida;

    public Aliado(int cura, int vida){
        this.cura = cura;
        this.vida = vida;
    }
    
    public int getVida(){
        return vida;
    }

    public void curar(Personagem alvo){
        if(alvo.getVida() <= 0){
            System.out.println("O alvo já está morto!");
        }
        else{
            alvo.regenerar(cura);
        }
    }
    
    public void recebeAtaque(int danoTomado){
        vida -= danoTomado;
    }
}
