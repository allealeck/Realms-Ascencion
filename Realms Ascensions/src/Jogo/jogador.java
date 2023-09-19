package Jogo;

import java.util.Random;

public class jogador extends kingdom{

    //Atributos
    private String nome;
    private boolean i_won = false;
    private String genero;
    private String reino;

    Random random = new Random();

    private static final String[] maleTitulo = {
    "Senhor",
    "Barão",
    "Conde",
    "Marquês",
    "Duque",
    "Grão Duque",
    "Principe",
    "Rei"
};
    private static final String[] womanTitulo = {
    "Senhora",
    "Baronesa",
    "Condesa",
    "Marquesa",
    "Duquesa",
    "Grão Duquesa",
    "Princesa",
    "Rainha"
};
    //Construtor
    public jogador(String genero, String nome){
        this.nome = nome;
        this.genero = genero;
    }

    //SET
    public int comprarCatedral(){ //Valor de 5000

        cobalts -= 5000;
        catedral +=1;
        padres += random.nextInt(6);
        return 1;
    }
    
    public int comprarHospital(){ //Valor de 2500

        cobalts -= 2500;
        hospital +=1;
        medicos += random.nextInt(8);
        return 1;
    }

    public int comprarMercado(){ //Valor do 1000

        cobalts -= 1000;
        mercado += 1;
        mercadores += 5;
        return 1;
    }

    public int comprarMoinho(){ //Valor de 2000

        cobalts -= 2000;
        moinho += 1;
        mercadores += random.nextInt(6);
        nobres += random.nextInt(1);
        return 1;
    }

    public int comprarPalacio(){ //Valor de 3000

        cobalts -= 3000;
        palacio += 1;
        nobres += random.nextInt(4);
        return 1;
    }

    public int comprarSoldados(){ //Valor de 500

        cobalts -= 500;
        servos -= 25;
        soldados += 25;
        return 1;
    }

    public int novoTitulo(){
        if (mercado >= 3 && hospital >= 1 && moinho >= 3 && catedral >= 1 && palacio >= 1) {
            Titulo_num++;
        }if (mercado >= 4 && hospital >= 2 && moinho >= 4 && catedral >= 2 && palacio >= 2) {
            Titulo_num++;
        }if (mercado >= 5 && hospital >= 3 && moinho >= 5 && catedral >= 3 && palacio >= 3) {
            Titulo_num++;
        }if (mercado >= 6 && hospital >= 4 && moinho >= 6 && catedral >= 4 && palacio >= 4) {
            Titulo_num++;
        }if (mercado >= 7 && hospital >= 5 && moinho >= 7 && catedral >= 5 && palacio >= 5) {
            Titulo_num++;
        }if (mercado >= 8 && hospital >= 6 && moinho >= 8 && catedral >= 6 && palacio >= 6) {
            Titulo_num++;
        }if (mercado >= 9 && hospital >= 7 && moinho >= 9 && catedral > 7 && palacio >= 7) {
            Titulo_num++;
        }

        if (Titulo_num == 7) {
            i_won = true;
        }
        return 1;
    }

    public int comprarGraos(int quantidade){
        cobalts -= (quantidade * preco_graos / 1000);
        reserva_graos += quantidade;
        return 1; //Operação bem-sucedida
    }

    public int venderGraos(int quantidade){
        if (quantidade > reserva_graos) {
            return -1; //Você não tem grãos suficientes
        }else{
            cobalts += (quantidade * preco_graos/1000);
            reserva_graos -= quantidade;
        }
        return 1; //Operação bem-sucedida
    }

    public int comprarTerras(int quantidade){
        cobalts -= (quantidade * preco_terras);
        terras += quantidade;
        return 1; //Operação bem-sucedida
    }

    public int venderTerras(int quantidade){
        if (quantidade > terras) {
            return -1; //você não tem terras suficientes
        } else{
            terras -= quantidade;
            cobalts += (quantidade * preco_terras);
        }
        return 1; //Operação bem-sucedida
    }
    //GET    
    public String getTitulo(){
        if (genero == "H" || genero == "h") {
            return maleTitulo[Titulo_num];
        }else if (genero == "M" || genero == "m") {
            return womanTitulo[Titulo_num];
        }else{
            return "error"; //Valor invalido
        }        
    }
    
    public String getNome(){
        return nome;
    }

    public String getGenero(){
        return genero;
    }

    public boolean getI_won(){
        return i_won;
    }

    public String getReino(){
        return reino;
    }
       
    public int getCobalts(){
        return cobalts;
    }
}