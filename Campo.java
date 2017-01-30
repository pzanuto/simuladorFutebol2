package simuladorfutebol2.pkg0;

import java.util.ArrayList;
import java.util.Random;

public class Campo {
    
    private Time time1;
    private Time time2;
    private Jogador donoBola;
    private int tempo;
    private Time comPosse;
    private Time semPosse;
    private ArrayList<Jogador> disponiveis = new ArrayList<Jogador>();
    private int golsTime1;
    private int golsTime2;
            

    public Campo(Time time1, Time time2) {
        this.time1 = time1;
        this.time2 = time2;
        this.tempo = 0;
        this.golsTime1 = 0;
        this.golsTime2 = 0;
        
    }

    protected void comecaPartida(){
        this.chamadaPartida();
        System.out.println(this.getTime1().getNome());
        System.out.println("Poder Ofensivo: "+this.time1.getOfensividade());
        System.out.println("Poder Defensivo: "+this.time1.getHabGk());
        System.out.println("----------------------");
        System.out.println(this.getTime2().getNome());
        System.out.println("Poder Ofensivo: "+this.time2.getOfensividade());
        System.out.println("Poder Defensivo: "+this.time2.getHabGk());
        
        System.out.println();
        this.posseInicial();
        this.rolaBola();
        while (this.getTempo()<=90){
            this.setTempo(this.getTempo()+1);
            int decisao = this.getDonoBola().acaoJogador();
            if(decisao == 0){
                this.perdeBola(this.getDonoBola());
                this.controlaPosse(this.time1, this.time2);
            } else if(decisao == 1){
                this.passaBola(this.getDonoBola());
            } else if(decisao == 2){
                System.out.println("====================================");
                System.out.println(this.getTempo()+"' : Jogada perigosa de "+this.getDonoBola().getNome()+ " pelo " +this.getComPosse().getNome());
                int chute = this.finalizaBola(this.getDonoBola(), this.getSemPosse());
                switch(chute){
                    case 0:
                        Random random0 = new Random();
                        int narrador0 = random0.nextInt(3);
                        if(narrador0==0)System.out.println("... ELE PERDEU A BOLA..");
                        if(narrador0==1) System.out.println("ISOLOU!");
                        if(narrador0==2) System.out.println("Grande defesa de "+this.getSemPosse().listaJogadores.get(0).getNome());
                        this.perdeBola(this.getDonoBola());
                        this.setDonoBola(this.getSemPosse().listaJogadores.get(0));
                        break;
                    case 1:
                        System.out.println("...Ele voltou a bola..");
                        this.passaBola(this.getDonoBola());
                        break;
                    case 2:
                        Random random2 = new Random();
                        int narrador2 = random2.nextInt(3);
                        if (narrador2==0)System.out.println("GOOOOOL, É DELE! "+ this.getDonoBola().getNome());
                        if (narrador2==1)System.out.println("O goleiro saiu, ele manda de cobertura e... GOLAÇOOOOO de "+this.getDonoBola().getNome());
                        if (narrador2==2)System.out.println("Depois de ótima tabela, bonito GOL de " +this.getDonoBola().getNome());
                        this.setDonoBola(this.getSemPosse().listaJogadores.get(10));
                        this.convertePlacar();
                        this.mostraPlacar();
                        this.rolaBola();
                        break;
                }
            }
        this.controlaPosse(this.time1, this.time2);
        }
        System.out.println("====================================");
        System.out.println("Fim de jogo!");
        this.mostraPlacar();
    }
    
    
    protected void mostraPlacar(){
        if(this.getTempo()<=90){
            System.out.println("O placar agora é: " + this.getTime1().getNome() + " " + this.getGolsTime1() + "x" + this.getGolsTime2() + " " + this.getTime2().getNome());
        } else {
        System.out.println("O resultado foi: " + this.getTime1().getNome() + " " + this.getGolsTime1() + "x" + this.getGolsTime2() + " " + this.getTime2().getNome());
        }
    }
        
        
    
    protected void chamadaPartida(){
        System.out.println("====================================");
        System.out.println("O GRANDE JOGO VAI COMEÇAR!");
        System.out.println("A PARTIDA É ENTRE: " + this.getTime1().getNome() + " e " + this.getTime2().getNome());
        System.out.println("----------------------");
    }
    
    protected void perdeBola(Jogador quemPerdeu){
        ArrayList<Jogador> desarme = new ArrayList<Jogador>();
        int cont = 0;
        for (int i=0; i< this.getSemPosse().listaJogadores.size();i++){
            if(this.getSemPosse().listaJogadores.get(i).getPosicaoCampo() == 2 && quemPerdeu.getPosicaoCampo() == 2){
                desarme.add(this.getSemPosse().listaJogadores.get(i));
                cont++;
            }else if(this.getSemPosse().listaJogadores.get(i).getPosicaoCampo() == 1 && quemPerdeu.getPosicaoCampo() == 3){
                desarme.add(this.getSemPosse().listaJogadores.get(i));
                cont++;
            }else if(this.getSemPosse().listaJogadores.get(i).getPosicaoCampo() == 3 && quemPerdeu.getPosicaoCampo() == 1){
                desarme.add(this.getSemPosse().listaJogadores.get(i));
                cont++;
            }
        }
        
        if (cont != 0){
            Random random = new Random();
        int r = random.nextInt(desarme.size());
        this.setDonoBola(this.getSemPosse().listaJogadores.get(r));
        } else{
            this.setDonoBola(this.getSemPosse().listaJogadores.get(0));
        }
    }
        
    
    protected void posseInicial(){
        Random gerador = new Random();
        int posse = gerador.nextInt(2);
        if (posse == 0){
            this.comPosse = time1;
            this.setDonoBola(this.comPosse.getAtk1());
            this.semPosse = time2;
        } else {
            this.comPosse = time2;
            this.setDonoBola(this.comPosse.getAtk1());
            this.semPosse = time1;
        }
    }
    
    protected void passaBola(Jogador quemPassa){
        this.verificaPosicao(this.getComPosse().getListaJogadores());
        Random random = new Random();
        int decisao = random.nextInt(this.getDisponiveis().size());
        if(quemPassa.getPosicaoCampo()==2){
            quemPassa.setPosicaoCampo(quemPassa.getPosicaoCampo() + 1);
            this.setDonoBola(this.getDisponiveis().get(decisao));
        }else{
            this.setDonoBola(this.getDisponiveis().get(decisao));
        }
    }
    
    protected int finalizaBola(Jogador quemChuta, Time adversario){
        int decisao = quemChuta.acaoJogador();
        if(quemChuta.getPosicaoCampo() == 3){
            Random random = new Random();
            int sucesso = random.nextInt(100);
            if(quemChuta.qualidade > adversario.habGk){
                sucesso = sucesso + (quemChuta.qualidade*3 - adversario.habGk*2)/6;
                if (sucesso>80) {
                    return 2;
                } else {
                    return 0;
                }
            } else if (quemChuta.qualidade < adversario.habGk){
                sucesso = sucesso - (adversario.habGk*3 - quemChuta.qualidade*2)/6;
                if (sucesso>80) {
                    return 2;
                } else {
                    return 0;
                }
            } else {
                if (sucesso>80) {
                    return 2;
                } else {
                    return 0;
                }
            }
        }
        return 1;
    }
    
    protected void arrumaTimes(){
        this.getComPosse().posicionaTime();
        this.getSemPosse().posicionaTime();
    }
    
    protected void rolaBola(){
        this.arrumaTimes();
        this.passaBola(this.getDonoBola());
        
    }
    
    
    protected void verificaPosicao(ArrayList<Jogador> jogadores){
        ArrayList<Jogador> disponiveisAgora = new ArrayList<Jogador>();
        for (int i = 0; i<jogadores.size(); i++){
            if (jogadores.get(i).getPosicaoCampo() >= this.getDonoBola().getPosicaoCampo()){
                disponiveisAgora.add(jogadores.get(i));
            }
        }
        this.setDisponiveis(disponiveisAgora);
    }
    
    protected void controlaPosse(Time time1, Time time2){
        int cont=0;
        for(int i=0; i<time1.getListaJogadores().size();i++){
            if(this.getDonoBola() == time1.getListaJogadores().get(i)){
                cont++;
                break;
            }
        }
        if(cont ==0){
            this.setComPosse(time2);
            this.setSemPosse(time1);
        } else{
            this.setComPosse(time1);
            this.setSemPosse(time2);
        }
    }       
    
    
    
    
    public Time getTime1() {
        return time1;
    }

    public void setTime1(Time time1) {
        this.time1 = time1;
    }

    public Time getTime2() {
        return time2;
    }

    public void setTime2(Time time2) {
        this.time2 = time2;
    }

    public Jogador getDonoBola() {
        return donoBola;
    }

    public void setDonoBola(Jogador donoBola) {
        this.donoBola = donoBola;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public Time getComPosse() {
        return comPosse;
    }

    public void setComPosse(Time comPosse) {
        this.comPosse = comPosse;
    }

    public Time getSemPosse() {
        return semPosse;
    }

    public void setSemPosse(Time semPosse) {
        this.semPosse = semPosse;
    }

    public ArrayList<Jogador> getDisponiveis() {
        return disponiveis;
    }

    public void setDisponiveis(ArrayList<Jogador> disponiveis) {
        this.disponiveis = disponiveis;
    }

    public int getGolsTime1() {
        return golsTime1;
    }

    public void setGolsTime1(int golsTime1) {
        this.golsTime1 = golsTime1;
    }

    public int getGolsTime2() {
        return golsTime2;
    }

    public void setGolsTime2(int golsTime2) {
        this.golsTime2 = golsTime2;
    }
    
    public void convertePlacar(){
        if(this.getComPosse() == time1){
            this.setGolsTime1(this.getGolsTime1()+ 1);
        } else {
            this.setGolsTime2(this.getGolsTime2()+ 1);
        }
        Time aux;
        aux = this.getComPosse();
        this.setComPosse(this.getSemPosse());
        this.setSemPosse(aux);
    }
    
    
}
