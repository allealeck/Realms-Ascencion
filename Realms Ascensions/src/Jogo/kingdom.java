package Jogo;

import java.util.Random;

public class kingdom {
    
    protected int terras = 10000;
    protected int preco_terras = 0;
    protected int soldados = 25;
    protected int padres = 5;
    protected int mercadores = 5;
    protected int servos = 2000;
    protected int nobres = 5;
    protected int medicos = 5;
    protected int cobalts = 100000000;
    protected int demanda = 0;
    protected int colheita = 0;
    protected int graos = 0;
    protected int reserva_graos = 0;
    protected int preco_graos = 0;
    protected int catedral = 0;
    protected int palacio = 0;
    protected int mercado = 0;
    protected int hospital = 0;
    protected int moinho = 0;
    protected int taxa_vendas = 10;
    protected int taxa_alfandegaria = 25;
    protected int taxa_diversas = 5;
    protected int justica = 2;
    protected String justicaNome = "Moderada";
    protected int ratos = 0;

    protected int ratos_comeram = 0;
    protected int aleatorio;
    protected int terraTrabalhada;
    protected int trabalhoForcado;
    protected int terraProcessada;
    protected int maximoTerra;
    protected int colheitaPorHec;
    protected int novosServos;
    protected int Titulo_num = 0;
    protected int renda;
    protected int taxaVendasBase;
    protected int taxaAlfandegariaBase;
    protected int taxaDiversasBase;
    protected int taxas;
    protected int fugaServos;
    protected int rendaMercados;
    protected int rendaMoinho;
    protected int pagamentoSoldados; 
    protected int rendaHospital; 

    Random random = new Random();

    //SET

    public int setAlfandega(int Alfandega){
        if (Alfandega >= 0 && Alfandega <=100) {
            taxa_alfandegaria = Alfandega;
            return 1;
        }else{
            return -1; //Valor invalido
        }
    }

    public int setVendas(int Vendas){
        if (Vendas >= 0 && Vendas <= 50) {
            taxa_vendas = Vendas;
            return 1;
        }else{
            return -1; //Valor invalido
        }
    }

    public int setDiversos(int Diversos){
        if (Diversos >= 0 && Diversos <= 25) {
            taxa_diversas = Diversos;
            return 1;
        }else{
            return -1; //Valor invalido
        }
    }

    public int setJustica(int Justica){
        justica = Justica;
        if (justica == 1) {
            justicaNome = "Justa";
        }else if (justica == 2) {
            justicaNome = "Moderada";
        }else if (justica == 3) {
            justicaNome = "Rispida";
        }else if (justica == 4) {
            justicaNome = "Severa";
        }else{
            return -1; //Valor invalido
        }
        return 1;
    }

    public int calculoRendasTaxas(){
        
        renda = (justica * 300 - 500) * Titulo_num;
        
        taxaAlfandegariaBase = nobres * 180 + padres * 75 + medicos * 25 + mercadores * 20 * 100 + renda * taxa_alfandegaria;
        taxaVendasBase = nobres * 50 + mercadores * 25 + renda * taxa_vendas + justica * 5;
        taxaDiversasBase = nobres * 250 + justica * 10 + renda * taxa_diversas;

        taxas = taxaAlfandegariaBase + taxaVendasBase + taxaDiversasBase;
        cobalts += taxas;
        return 1;
    }

    public int praga(){ //Ratos comeram essa reserva de grãos

        ratos = random.nextInt(50);
        ratos_comeram = reserva_graos * (ratos / 100);
        reserva_graos -= ratos_comeram;
        return 1;
    }

    public int colheitaTerrasGraos(){
        
        colheita = random.nextInt(5) + random.nextInt(6) / 2;

        if (colheita > 5) {
            colheita = 5;
        }else if(colheita < 1){
            colheita = 1;
        }

        aleatorio = random.nextInt(32767) / 32767;

        terraTrabalhada = terras;

        trabalhoForcado = (servos - moinho) * 100;

        terraProcessada = trabalhoForcado * 5;

        if (terraProcessada < 0) {
            terraProcessada = 0;
        }

        if (terraProcessada < terraTrabalhada) {
            terraTrabalhada = terraProcessada;
        }

        maximoTerra = reserva_graos * 2;

        if (maximoTerra < terraTrabalhada) {
            terraTrabalhada = maximoTerra;
        }

        colheitaPorHec = colheita + aleatorio - 1;

        colheita = colheitaPorHec * terraTrabalhada;

        reserva_graos += colheita;

        demanda = (nobres * 100) + (padres * 40) + (mercadores * 30) + (medicos * 20) + (soldados * 10) + (servos * 5);

        preco_terras = (3 * colheita) + (random.nextInt(6) + 10);
        
        preco_graos = 6 * 3 + random.nextInt(5) + random.nextInt(5) * 4;
        return 1; 
    }

    public int procriacaoFugaServos(){

        novosServos = random.nextInt(250) / 100;
        servos += novosServos;

        if (justica > 2) {
            fugaServos = servos / 100 * (justica - 2);
            fugaServos = random.nextInt(fugaServos);
            servos -= fugaServos;
        }if (mercado > 0) {
            rendaMercados = mercado * 75;
            cobalts += rendaMercados;
        }if (moinho > 0) {
            rendaMoinho = moinho * (55 + random.nextInt(250));
            cobalts += rendaMoinho;
        }if (hospital > 0) {
            rendaHospital = hospital * (75 + random.nextInt(370));
            cobalts += rendaHospital;
        }
        pagamentoSoldados = soldados * 3;
        cobalts -= pagamentoSoldados;
        return 1;
    }
   
    //GET
    public int getTerras(){
        return terras;
    }

    public int getNovosServos() {
        return novosServos;
    }

    public int getTaxaVendasBase() {
        return taxaVendasBase;
    }
    
    public int getTaxaAlfandegariaBase() {
        return taxaAlfandegariaBase;
    }

    public int getTaxaDiversasBase() {
        return taxaDiversasBase;
    }

    public int getPrecoTerras(){
        return preco_terras;
    }

    public int getSoldados(){
        return soldados;
    }

    public int getPadres(){
        return padres;
    }

    public int getMercadores(){
        return mercadores;
    }

    public int getServos(){
        return servos;
    }

    public int getNobres(){
        return nobres;
    }

    public int getMedicos(){
        return medicos;
    }

    public int getDemanda(){
        return demanda;
    }

    public int getColheita(){
        return colheita;
    }

    public int getGraos(){
        return reserva_graos;
    }

    public int getCatedral(){
        return catedral;
    }

    public int getPalacio(){
        return palacio;
    }

    public int getMercado(){
        return mercado;
    }

    public int getHospital(){
        return hospital;
    }

    public int getMoinho(){
        return moinho;
    }

    public int getTaxaVendas(){
        return taxa_vendas;
    }

    public int getTaxaAlfandegaria(){
        return taxa_alfandegaria;
    }

    public int getTaxaDiversas(){
        return taxa_diversas;
    }

    public String getJustica(){
        return justicaNome;
    }

    public int getRatosComeram(){
        return ratos_comeram;
    }

    public int getAleatorio(){
        return aleatorio;
    }

    public int getTerraTrabalhada(){
        return terraTrabalhada;
    }

    public int getTrabalhoForcado(){
        return trabalhoForcado;
    }

    public int getTerraProcessada(){
        return terraProcessada;
    }

    public int getMaximoTerra(){
        return maximoTerra;
    }

    public int getColheitaPorHectar(){
        return colheitaPorHec;
    }

    public int getTaxas(){
        return taxas;
    }

    public int getFugaServos(){
        return fugaServos;
    }

    public int getRendaMercados(){
        return rendaMercados;
    }

    public int getRendaMoinho(){
        return rendaMoinho;
    }

    public int getPagamentoSoldado(){
        return pagamentoSoldados;
    }

    public int getRendaHospital(){
        return rendaHospital;
    }

    public int getPreco_graos() {
        return preco_graos;
    }   
}