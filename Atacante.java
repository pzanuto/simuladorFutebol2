package simuladorfutebol2.pkg0;

import java.util.Random;

public class Atacante extends Jogador {
    private int fin;
    private int dri;
    private int vel;
    private int qualidadeAtk;

    public Atacante(int fin, int dri, int vel, String nome) {
        super(nome);
        this.fin = fin;
        this.dri = dri;
        this.vel = vel;
        this.qualidadeAtk = (this.fin*20 + this.dri*15 + this.vel*15)/10;
        this.setPosicaoCampo(2);
        this.setQualidade();
    }
    
    @Override
    protected int acaoJogador(){
        Random random = new Random();
        int acao = random.nextInt(100);
        if(this.qualidadeAtk < 60){
            if(acao<25){
                return 0;
            } else if(25<=acao && acao<67){
                return 1;
            } else if(acao>=67 && acao<100 && this.getPosicaoCampo()==3){
                return 2;
            }
        } else if(this.qualidadeAtk >=60 && this.qualidadeAtk <80){
            if(acao <18){
                return 0;
            } else if(18<=acao && acao<60){
                return 1;
            } else if(acao>=60 && acao<100 && this.getPosicaoCampo()==3){
                return 2;
            }
        } else if(this.qualidadeAtk >=80 && this.qualidadeAtk <92){
            if(acao<15){
                return 0;
            } else if(15<=acao && acao<57){
                return 1;
            } else if(acao>=57 && acao<100 && this.getPosicaoCampo()==3){
                return 2;
            }
        } else if(this.qualidadeAtk >=92){
            if(acao<12){
                return 0;
            } else if(12<=acao && acao<67){
                return 1;
            } else if(acao>=67 && acao<100 && this.getPosicaoCampo()==3){
                return 2;
            }
        }
        return 1;
    }
    
    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }

    public int getDri() {
        return dri;
    }

    public void setDri(int dri) {
        this.dri = dri;
    }

    public int getVel() {
        return vel;
    }

    public void setVel(int vel) {
        this.vel = vel;
    }

    public int getQualidadeAtk() {
        return qualidadeAtk;
    }

    public void setQualidadeAtk(int qualidadeAtk) {
        this.qualidadeAtk = qualidadeAtk;
    }
    
    
    @Override
    public void setQualidade(){
        this.qualidade = this.qualidadeAtk;
    }

    @Override
    public String toString() {
        return super.toString()+"Atacante{" + "fin=" + fin + ", dri=" + dri + ", vel=" + vel + ", qualidadeAtk=" + qualidadeAtk + '}';
    }
    
    
}
