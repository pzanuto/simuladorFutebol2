package simuladorfutebol2.pkg0;

import java.util.ArrayList;

public class Time {
    
    private String nome;
    private Goleiro gk;
    private Defensor zag1;
    private Defensor zag2;
    private Defensor lat1;
    private Defensor lat2;
    private Meia md1;
    private Meia md2;
    private Meia ma1;
    private Meia ma2;
    private Atacante atk1;
    private Atacante atk2;
    private int ofensividade;
    private int defensividade;
    public ArrayList<Jogador> listaJogadores = new ArrayList<Jogador>();
    public int habGk;

    public Time(String nome, Goleiro gk, Defensor zag1, Defensor zag2, Defensor lat1, Defensor lat2, Meia md1, Meia md2, Meia ma1, Meia ma2, Atacante atk1, Atacante atk2) {
        this.nome = nome;
        this.gk = gk;
        this.zag1 = zag1;
        this.zag2 = zag2;
        this.lat1 = lat1;
        this.lat2 = lat2;
        this.md1 = md1;
        this.md2 = md2;
        this.ma1 = ma1;
        this.ma2 = ma2;
        this.atk1 = atk1;
        this.atk2 = atk2;
        this.ofensividade = (this.atk2.getQualidadeAtk() + this.atk1.getQualidadeAtk() + this.ma2.getQualidadeMeia() + this.ma1.getQualidadeMeia()
                            + this.md2.getQualidadeMeia() + this.md1.getQualidadeMeia())/6;
        this.defensividade = (this.md1.getQualidadeMeia() + this.md2.getQualidadeMeia() + this.lat2.getQualidadeDef() + this.lat1.getQualidadeDef()
                            + this.zag2.getQualidadeDef() + this.zag1.getQualidadeDef() + this.gk.getQualidadeGk())/7;
        this.habGk = (this.gk.getQualidadeGk()+ this.defensividade)/2;
        this.implementaLista();
    }

    
    
    private void implementaLista(){
        this.listaJogadores.add(this.gk);
        this.listaJogadores.add(this.zag1);
        this.listaJogadores.add(this.zag2);
        this.listaJogadores.add(this.lat1);
        this.listaJogadores.add(this.lat2);
        this.listaJogadores.add(this.md1);
        this.listaJogadores.add(this.md2);
        this.listaJogadores.add(this.ma1);
        this.listaJogadores.add(this.ma2);
        this.listaJogadores.add(this.atk1);
        this.listaJogadores.add(this.atk2);
    }
    
    protected void posicionaTime(){
        
        this.gk.setPosicaoCampo(0);
        this.zag1.setPosicaoCampo(1);
        this.zag2.setPosicaoCampo(1);
        this.lat1.setPosicaoCampo(1);
        this.lat2.setPosicaoCampo(1);
        this.md1.setPosicaoCampo(2);
        this.md2.setPosicaoCampo(2);
        this.ma1.setPosicaoCampo(2);
        this.ma2.setPosicaoCampo(2);
        this.atk1.setPosicaoCampo(2);
        this.atk2.setPosicaoCampo(2);
    }
   
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Goleiro getGk() {
        return gk;
    }

    public void setGk(Goleiro gk) {
        this.gk = gk;
    }

    public Defensor getZag1() {
        return zag1;
    }

    public void setZag1(Defensor zag1) {
        this.zag1 = zag1;
    }

    public Defensor getZag2() {
        return zag2;
    }

    public void setZag2(Defensor zag2) {
        this.zag2 = zag2;
    }

    public Defensor getLat1() {
        return lat1;
    }

    public void setLat1(Defensor lat1) {
        this.lat1 = lat1;
    }

    public Defensor getLat2() {
        return lat2;
    }

    public void setLat2(Defensor lat2) {
        this.lat2 = lat2;
    }

    public Meia getMd1() {
        return md1;
    }

    public void setMd1(Meia md1) {
        this.md1 = md1;
    }

    public Meia getMd2() {
        return md2;
    }

    public void setMd2(Meia md2) {
        this.md2 = md2;
    }

    public Meia getMa1() {
        return ma1;
    }

    public void setMa1(Meia ma1) {
        this.ma1 = ma1;
    }

    public Meia getMa2() {
        return ma2;
    }

    public void setMa2(Meia ma2) {
        this.ma2 = ma2;
    }

    public Atacante getAtk1() {
        return atk1;
    }

    public void setAtk1(Atacante atk1) {
        this.atk1 = atk1;
    }

    public Atacante getAtk2() {
        return atk2;
    }

    public void setAtk2(Atacante atk2) {
        this.atk2 = atk2;
    }

    public int getOfensividade() {
        return ofensividade;
    }

    public void setOfensividade(int ofensividade) {
        this.ofensividade = ofensividade;
    }

    public int getDefensividade() {
        return defensividade;
    }

    public void setDefensividade(int defensividade) {
        this.defensividade = defensividade;
    }

    public ArrayList<Jogador> getListaJogadores() {
        return listaJogadores;
    }

    public void setListaJogadores(ArrayList<Jogador> listaJogadores) {
        this.listaJogadores = listaJogadores;
    }

    public int getHabGk() {
        return habGk;
    }

    public void setHabGk(int habGk) {
        this.habGk = habGk;
    }

    @Override
    public String toString() {
        return "Time{" + "nome=" + nome + ", gk=" + gk + ", zag1=" + zag1 + ", zag2=" + zag2 + ", lat1=" + lat1 + ", lat2=" + lat2 + ", md1=" + md1 + ", md2=" + md2 + ", ma1=" + ma1 + ", ma2=" + ma2 + ", atk1=" + atk1 + ", atk2=" + atk2 + ", ofensividade=" + ofensividade + ", defensividade=" + defensividade + ", habGk=" + habGk + '}';
    }

    
}
