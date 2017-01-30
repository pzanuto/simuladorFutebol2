package simuladorfutebol2.pkg0;

import java.util.Random;

public class Defensor extends Jogador{
    
    private int mar;
    private int des;
    private int forc;
    private int lan;
    private int vel;
    private int qualidadeDef;

    public Defensor(int mar, int des, int forc, int lan, int vel, String nome) {
        super(nome);
        this.mar = mar;
        this.des = des;
        this.forc = forc;
        this.lan = lan;
        this.vel = vel;
        this.qualidadeDef = (this.mar*10 + this.des*10 + this.forc*10 + this.lan*10 + this.vel*10)/10;
        this.setPosicaoCampo(1);
        this.setQualidade();
    }

    
    @Override
    protected int acaoJogador(){
        Random random = new Random();
        int acao = random.nextInt(100);
        if(this.qualidadeDef < 60){
            if(acao <25){
                return 0;
            } else if(25<=acao && acao<67){
                return 1;
            } else if(acao>=67 && acao<100 && this.getPosicaoCampo()==3){
                return 2;
            }
        } else if(this.qualidadeDef >=60 && this.qualidadeDef <80){
            if(acao<18){
                return 0;
            } else if(18<=acao && acao<60){
                return 1;
            } else if(acao>=60 && acao<100 && this.getPosicaoCampo()==3){
                return 2;
            }
        } else if(this.qualidadeDef >=80 && this.qualidadeDef <92){
            if(acao<15){
                return 0;
            } else if(15<=acao && acao<57){
                return 1;
            } else if(acao>=57 && acao<100 && this.getPosicaoCampo()==3){
                return 2;
            }
        } else if(this.qualidadeDef >=92){
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

    public int getForc() {
        return forc;
    }

    public void setForc(int forc) {
        this.forc = forc;
    }

    public int getLan() {
        return lan;
    }

    public void setLan(int lan) {
        this.lan = lan;
    }

    public int getVel() {
        return vel;
    }

    public void setVel(int vel) {
        this.vel = vel;
    }

    public int getQualidadeDef() {
        return qualidadeDef;
    }

    public void setQualidadeDef(int qualidadeDef) {
        this.qualidadeDef = qualidadeDef;
    }
    
    @Override
    public void setQualidade(){
        this.qualidade = this.qualidadeDef;
    }

    @Override
    public String toString() {
        return "Defensor{" + "mar=" + mar + ", des=" + des + ", forc=" + forc + ", lan=" + lan + ", vel=" + vel + ", qualidadeDef=" + qualidadeDef + '}';
    }
    
    
}
