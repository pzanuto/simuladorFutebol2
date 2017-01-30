package simuladorfutebol2.pkg0;

import java.util.Random;

public abstract class Jogador {
   
    private String nome;
    private int posicaoCampo;
    private boolean fazGol;
    protected int qualidade;
    protected boolean emCampo;
    protected boolean pendurado;

    public Jogador(String nome) {
        this.nome = nome;
        this.fazGol = false;
        this.qualidade = 0;
        this.emCampo = true;
        this.pendurado = false;
    }

    
    protected abstract int acaoJogador();
    
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPosicaoCampo() {
        return posicaoCampo;
    }

    public void setPosicaoCampo(int posicaoCampo) {
        this.posicaoCampo = posicaoCampo;
    }

    public boolean isFazGol() {
        return fazGol;
    }

    public void setFazGol(boolean fazGol) {
        this.fazGol = fazGol;
    }

    public int getQualidade() {
        return qualidade;
    }

    public abstract void setQualidade();

    @Override
    public String toString() {
        return "Jogador{" + "nome=" + nome + ", posicaoCampo=" + posicaoCampo + ", fazGol=" + fazGol + ", qualidade=" + qualidade + '}';
    }

    public boolean isEmCampo() {
        return emCampo;
    }

    public void setEmCampo(boolean emCampo) {
        this.emCampo = emCampo;
    }

    public boolean isPendurado() {
        return pendurado;
    }

    public void setPendurado(boolean pendurado) {
        this.pendurado = pendurado;
    }
    
    
    
}
