package clases;

import java.util.ArrayList;
import java.util.List;
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
    private List<String> movimientos = new ArrayList<>();
    private int fertilidad;
    private char sexo;
    private Objetos objeto;
    private Estado estado;

    Pokemon pikachu = new Pokemon("Pikachu","pika",'H');

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void aplicarEstado(Pokemon p) {
        p.setEstado(Estado.DORMIDO);
    }

    public void hola(){
        }

    private int getRandomVida(){
        Random r=new Random();
        return r.nextInt(10)+1;
    }
    private int getRandomAtaque(){
        Random r2 = new Random();
        return r2.nextInt(20)+1;
    }
    public Pokemon(String nombre, String mote, char sexo){
    this.nombre=nombre;
    this.mote=mote;
    this.sexo=sexo;
    this.estamina=100;
    this.nivel=1;
    this.fertilidad=5;
    }

    }
