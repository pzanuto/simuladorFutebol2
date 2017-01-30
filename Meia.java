package simuladorfutebol2.pkg0;

import java.util.Random;

public class Meia extends Jogador {
    private int pas;
    private int fin;
    private int cri;
    private int mar;
    private int des;
    private int qualidadeMeia;

    public Meia(int pas, int fin, int cri, int mar, int des, String nome) {
        super(nome);
        this.pas = pas;
        this.fin = fin;
        this.cri = cri;
        this.mar = mar;
        this.des = des;
        this.qualidadeMeia = (this.pas*10 + this.fin*10 + this.cri*10 + this.mar*10 + this.des*10)/10;
        this.setPosicaoCampo(2);
        this.setQualidade();
    }

    
    @Override
    protected int acaoJogador(){
        Random random = new Random();
        int acao = random.nextInt(100);
        if(this.qualidadeMeia < 60){
            if(acao<25){
                return 0;
            } else if(25<=acao && acao<67){
                return 1;
            } else if(acao>=67 && acao<100 && this.getPosicaoCampo()==3){
                return 2;
            }
        } else if(this.qualidadeMeia >=60 && this.qualidadeMeia <80){
            if(acao<18){
                return 0;
            } else if(18<=acao && acao<60){
                return 1;
            } else if(acao>=60 && acao<100 && this.getPosicaoCampo()==3){
                return 2;
            }
        } else if(this.qualidadeMeia >=80 && this.qualidadeMeia <92){
            if(acao<15){
                return 0;
            } else if(15<=acao && acao<57){
                return 1;
            } else if(acao>=57 && acao<100 && this.getPosicaoCampo()==3){
                return 2;
            }
        } else if(this.qualidadeMeia>=92){
            if(acao<10){
                return 0;
            } else if(10<=acao && acao<67){
                return 1;
            } else if(acao>=67 && acao<100 && this.getPosicaoCampo()==3){
                return 2;
            }
        }
        return 1;
    }
    
    public int getPas() {
        return pas;
    }

    public void setPas(int pas) {
        this.pas = pas;
    }

    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }

    public int getCri() {
        return cri;
    }

    public void setCri(int cri) {
        this.cri = cri;
    }

    public int getMar() {
        return mar;
    }

    public void setMar(int mar) {
        this.mar = mar;
    }

    public int getDes() {
        return des;
    }

    public void setDes(int des) {
        this.des = des;
    }

    public int getQualidadeMeia() {
        return qualidadeMeia;
    }

    public void setQualidadeMeia(int qualidadeMeia) {
        this.qualidadeMeia = qualidadeMeia;
    }
    
    @Override
    public void setQualidade(){
        this.qualidade = this.qualidadeMeia;
    }

    @Override
    public String toString() {
        return "Meia{" + "pas=" + pas + ", fin=" + fin + ", cri=" + cri + ", mar=" + mar + ", des=" + des + ", qualidadeMeia=" + qualidadeMeia + '}';
    }
    
    
}
