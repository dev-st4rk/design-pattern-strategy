package strategy;

import java.util.Scanner;

public class Disciplina {

    float p1;
    float p2;
    float media;
    String situacao;
    String nome;
    ICalcMedia calculo;
    IMudaSituacao ajuste;

    Scanner scanner = new Scanner(System.in);
    
    public void aluno()
    {
        System.out.println("NOME ALUNO:");
        this.nome=scanner.nextLine();
        
        System.out.println("\nNOTA DA P1:");
        this.p1=scanner.nextFloat();
        
        System.out.println("\nNOTA DA P2:");
        this.p2=scanner.nextFloat();
    }
    
    public void print_data()
    {
        System.out.println("A média do aluno " + this.nome + " foi igual a " + this.media +
                " e teve como resultado a sua " + this.situacao);
    }
    
    public float getP1() 
    {
        return p1;
    }

    public void setP1(float p1) 
    {
        this.p1 = p1;
    }

    public float getP2() 
    {
        return p2;
    }

    public void setP2(float p2) 
    {
        this.p2 = p2;
    }

    public String getSituacao() 
    {
        return situacao;
    }

    public void setSituacao(String situacao) 
    {
        this.situacao = situacao;
    }

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public float getMedia() 
    {
        return media;
    }
    
    public void setMedia(float media)
    {
        this.media=media;
    }

    public void setCalculo(ICalcMedia calculo) 
    {
        this.calculo = calculo;
    }

    public void setAjuste(IMudaSituacao ajuste) 
    {
        this.ajuste = ajuste;
    }

    public Disciplina()
    {

    }

    public Disciplina(ICalcMedia calculo ,IMudaSituacao ajuste)
    {
        this.ajuste = ajuste;
        this.calculo = calculo;
    }

}