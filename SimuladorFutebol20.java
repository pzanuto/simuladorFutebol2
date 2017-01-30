package simuladorfutebol2.pkg0;
public class SimuladorFutebol20 {
    public static void main(String[] args) {
        
        Goleiro[] goleiros = new Goleiro[4];
        Defensor[] zagueiros = new Defensor[8];
        Defensor[] laterais = new Defensor[8];
        Meia[] meiasDef = new Meia[8];
        Meia[] meiasAtk = new Meia[8];
        Atacante[] atacantes = new Atacante[8];
        
        goleiros[0] = new Goleiro(17,15,15,"Manu");
        goleiros[1] = new Goleiro(16,16,15,"Muralha");
        goleiros[2] = new Goleiro(15,16,18,"Stegen");
        goleiros[3] = new Goleiro(17,16,16,"Navas");
        zagueiros[0] = new Defensor(18,16,17,17,13,"Naldo"); //int mar, int des, int forc, int lan, int vel
        zagueiros[1] = new Defensor(17,20,17,12,15,"And Frank");
        zagueiros[2] = new Defensor(17,16,17,11,13,"Rever");
        zagueiros[3] = new Defensor(16,19,19,12,14,"Donnati");
        zagueiros[4] = new Defensor(19,17,17,14,15,"Mascherano");
        zagueiros[5] = new Defensor(17,17,19,13,11,"Piquet");
        zagueiros[6] = new Defensor(18,17,16,14,14,"Sergio Ramos");
        zagueiros[7] = new Defensor(18,16,16,12,16,"Varane");
        laterais[0] = new Defensor(16,16,16,16,20,"Pluton");
        laterais[1] = new Defensor(17,15,15,16,16,"Mauro");
        laterais[2] = new Defensor(16,17,15,17,17,"Pará");
        laterais[3] = new Defensor(16,16,16,18,17,"Trauco");
        laterais[4] = new Defensor(17,16,15,18,17,"Alex Vidal");
        laterais[5] = new Defensor(16,18,15,17,18,"Alba");
        laterais[6] = new Defensor(17,16,16,16,17,"Carvajal");
        laterais[7] = new Defensor(16,15,17,19,18,"Marcelo");
        meiasDef[0] = new Meia(18,17,16,18,17,"Leoni"); //int pas, int fin, int cri, int mar, int des, String nome
        meiasDef[1] = new Meia(17,15,16,19,18,"Andre Careca");
        meiasDef[2] = new Meia(17,14,14,17,17,"Romulo");
        meiasDef[3] = new Meia(16,16,15,18,18,"Arão");
        meiasDef[4] = new Meia(17,15,14,16,15,"Andre Gomes");
        meiasDef[5] = new Meia(20,14,15,18,18,"Busquets");
        meiasDef[6] = new Meia(18,17,17,17,19,"Modric");
        meiasDef[7] = new Meia(16,15,14,17,17,"Casemiro");
        meiasAtk[0] = new Meia(18,20,18,13,12,"Orlando Exp");
        meiasAtk[1] = new Meia(18,18,16,12,13,"Vorba");
        meiasAtk[2] = new Meia(19,18,19,16,15,"Diego");
        meiasAtk[3] = new Meia(19,17,19,12,11,"Conca");
        meiasAtk[4] = new Meia(20,18,20,12,12,"Iniesta");
        meiasAtk[5] = new Meia(20,20,18,12,11,"Messi");
        meiasAtk[6] = new Meia(20,19,16,16,15,"Kroos");
        meiasAtk[7] = new Meia(18,16,20,14,14,"Bale");
        atacantes[0] = new Atacante(19,18,19,"Baixin"); //int fin, int dri, int vel, String nome
        atacantes[1] = new Atacante(18,16,15,"Marcin Maluco");
        atacantes[2] = new Atacante(17,14,15,"Peidorrero");
        atacantes[3] = new Atacante(17,16,20,"Berrio");
        atacantes[4] = new Atacante(18,20,19,"Neymar");
        atacantes[5] = new Atacante(19,17,17,"Suarez");
        atacantes[6] = new Atacante(19,19,20,"Penaldo");
        atacantes[7] = new Atacante(18,16,16,"Benzema");
        
        Time[] times = new Time[4];
        
        times[0] = new Time("Miteiras FC",goleiros[0], zagueiros[0], zagueiros[1], laterais[0], laterais[1], meiasDef[0], meiasDef[1], meiasAtk[0], meiasAtk[1],
                            atacantes[0], atacantes[1]);
        times[1] = new Time("Flamengo",goleiros[1], zagueiros[2], zagueiros[3], laterais[2], laterais[3], meiasDef[2], meiasDef[3], meiasAtk[2], meiasAtk[3],
                            atacantes[2], atacantes[3]);
        times[2] = new Time("Barcelona", goleiros[2], zagueiros[4], zagueiros[5], laterais[4], laterais[5], meiasDef[4], meiasDef[5], meiasAtk[4], meiasAtk[5],
                            atacantes[4], atacantes[5]);
        times[3] = new Time("Real Madrid", goleiros[3], zagueiros[6], zagueiros[7], laterais[6], laterais[7], meiasDef[6], meiasDef[7], meiasAtk[6], meiasAtk[7],
                            atacantes[6], atacantes[7]);
        
        
        
        //System.out.println(times[0].toString());
        //System.out.println(times[1].toString());
        
        Campo primeiroJogo = new Campo(times[2], times[0]);
        primeiroJogo.comecaPartida();
        



    }
    
}
