package simuladorfutebol2.pkg0;

import java.util.Random;

public class Goleiro extends Jogador {
    private int ref;
    private int seg;
    private int habGk;
    private int qualidadeGk;

    public Goleiro(int ref, int seg, int habGk, String nome) {
        super(nome);
        this.ref = ref;
        this.seg = seg;
        this.habGk = habGk;
        this.qualidadeGk = (this.ref*9 + this.seg*9 + this.habGk*12)/6;
        this.setPosicaoCampo(0);
        this.setQualidade();
    }

    @Override
    protected int acaoJogador(){
        return 1;
    }
    
    
    public int getRef() {
        return ref;
    }

    public void setRef(int ref) {
        this.ref = ref;
    }

    public int getSeg() {
        return seg;
    }

    public void setSeg(int seg) {
        this.seg = seg;
    }

    public int getHabGk() {
        return habGk;
    }

    public void setHabGk(int habGk) {
        this.habGk = habGk;
    }

    public int getQualidadeGk() {
        return qualidadeGk;
    }

    public void setQualidadeGk(int qualidadeGk) {
        this.qualidadeGk = qualidadeGk;
    }
    
    @Override
    public void setQualidade(){
        this.qualidade = this.qualidadeGk;
    }

    @Override
    public String toString() {
        return "Goleiro{" + "ref=" + ref + ", seg=" + seg + ", habGk=" + habGk + ", qualidadeGk=" + qualidadeGk + '}';
    }

    
    
}

