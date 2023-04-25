package clases;

import java.util.*;

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
        p.setEstado(Estado.NORMAL);
    }

    public void hola(){
        }

    private int getRandomVida(){
        Random r=new Random();
        return r.nextInt(50)+1;
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
    this.vitalidad=getRandomVida();
    this.ataque=getRandomAtaque();
    }

        private Tipo tipo1;
        private Tipo tipo2;
        public static HashMap<Tipo, List<Tipo>> tablaTipos;{

        if(tablaTipos == null){
            tablaTipos = new HashMap<>();
            tablaTipos.put(Tipo.ACERO, new LinkedList<>());
            tablaTipos.put(Tipo.AGUA, new LinkedList<>());
            tablaTipos.put(Tipo.BICHO, new LinkedList<>());
            tablaTipos.put(Tipo.DRAGON, new LinkedList<>());
            tablaTipos.put(Tipo.ELECTRICO, new LinkedList<>());
            tablaTipos.put(Tipo.FANTASMA, new LinkedList<>());
            tablaTipos.put(Tipo.BICHO, new LinkedList<>());
            tablaTipos.put(Tipo.FUEGO, new LinkedList<>());
            tablaTipos.put(Tipo.HADA, new LinkedList<>());
            tablaTipos.put(Tipo.HIELO, new LinkedList<>());
            tablaTipos.put(Tipo.LUCHA, new LinkedList<>());
            tablaTipos.put(Tipo.NORMAL, new LinkedList<>());
            tablaTipos.put(Tipo.PLANTA, new LinkedList<>());
            tablaTipos.put(Tipo.PSIQUICO, new LinkedList<>());
            tablaTipos.put(Tipo.ROCA, new LinkedList<>());
            tablaTipos.put(Tipo.SINIESTRO, new LinkedList<>());
            tablaTipos.put(Tipo.TIERRA, new LinkedList<>());
            tablaTipos.put(Tipo.VENENO, new LinkedList<>());
        }


    }



    }
