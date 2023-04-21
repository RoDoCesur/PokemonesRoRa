package clases;

import java.util.ArrayList;
import java.util.Random;

public class Pokemon {
    private String nombre;
    private String mote;
    private int vitalidad;
    private float ataque;
    private float defensa;
    private float ataqueEsp;
    private float defensaEsp;
    private float velocidad;
    private int estamina;
    private int nivel;
    private ArrayList<String> movimientos;
    private int fertilidad;
    private String sexo;
    private ArrayList<String> tipo;
    private ArrayList<String> estado;
    private Objetos objeto;


    private int getRandomVida(){
        Random r=new Random();
        return r.nextInt(10)+1;
    }
    private int getRandomAtaque(){
        Random r2 = new Random();
        return r2.nextInt(20)+1;
    }
    public Pokemon(String nombre, String mote, String sexo, ArrayList<String> tipo, ArrayList<String> estado){
    this.nombre=nombre;
    this.mote=mote;
    this.sexo=sexo;
    this.tipo=new ArrayList<String>();
    this.estado=estado(0);
    this.objeto=null;
    this.estamina=100;



    }

}
