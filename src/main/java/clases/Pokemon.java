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
           private HashMap<Tipo, List<Tipo>> tablaDebiles;
           private HashMap<Tipo, List<Tipo>> tablaFuertes;

         private HashMap<Tipo, List<Tipo>> getTablaFuertes;{

             if(tablaFuertes == null){
            tablaFuertes = new HashMap<>();
            tablaFuertes.put(Tipo.ACERO, new LinkedList<>());
            tablaFuertes.put(Tipo.AGUA, new LinkedList<>());
            tablaFuertes.put(Tipo.BICHO, new LinkedList<>());
            tablaFuertes.put(Tipo.DRAGON, new LinkedList<>());
            tablaFuertes.put(Tipo.ELECTRICO, new LinkedList<>());
            tablaFuertes.put(Tipo.FANTASMA, new LinkedList<>());
            tablaFuertes.put(Tipo.FUEGO, new LinkedList<>());
            tablaFuertes.put(Tipo.HADA, new LinkedList<>());
            tablaFuertes.put(Tipo.HIELO, new LinkedList<>());
            tablaFuertes.put(Tipo.LUCHA, new LinkedList<>());
            tablaFuertes.put(Tipo.NORMAL, new LinkedList<>());
            tablaFuertes.put(Tipo.PLANTA, new LinkedList<>());
            tablaFuertes.put(Tipo.PSIQUICO, new LinkedList<>());
            tablaFuertes.put(Tipo.ROCA, new LinkedList<>());
            tablaFuertes.put(Tipo.SINIESTRO, new LinkedList<>());
            tablaFuertes.put(Tipo.TIERRA, new LinkedList<>());
            tablaFuertes.put(Tipo.VENENO, new LinkedList<>());
            tablaFuertes.put(Tipo.VOLADOR, new LinkedList<>());


                 tablaFuertes.get(Tipo.ACERO).add(Tipo.HADA);
            tablaFuertes.get(Tipo.ACERO).add(Tipo.HIELO);
            tablaFuertes.get(Tipo.ACERO).add(Tipo.ROCA);
            tablaFuertes.get(Tipo.AGUA).add(Tipo.FUEGO);
                 tablaFuertes.get(Tipo.AGUA).add(Tipo.ROCA);
                 tablaFuertes.get(Tipo.AGUA).add(Tipo.TIERRA);
                 tablaFuertes.get(Tipo.AGUA).add(Tipo.FUEGO);
                 tablaFuertes.get(Tipo.BICHO).add(Tipo.PLANTA);
                 tablaFuertes.get(Tipo.BICHO).add(Tipo.PSIQUICO);
                 tablaFuertes.get(Tipo.BICHO).add(Tipo.SINIESTRO);
                 tablaFuertes.get(Tipo.DRAGON).add(Tipo.DRAGON);
                 tablaFuertes.get(Tipo.ELECTRICO).add(Tipo.AGUA);
                 tablaFuertes.get(Tipo.ELECTRICO).add(Tipo.VOLADOR);
                 tablaFuertes.get(Tipo.FANTASMA).add(Tipo.PSIQUICO);
                 tablaFuertes.get(Tipo.FANTASMA).add(Tipo.FANTASMA);
                 tablaFuertes.get(Tipo.FUEGO).add(Tipo.ACERO);
                 tablaFuertes.get(Tipo.FUEGO).add(Tipo.BICHO);
                 tablaFuertes.get(Tipo.FUEGO).add(Tipo.HIELO);
                 tablaFuertes.get(Tipo.FUEGO).add(Tipo.PLANTA);
                 tablaFuertes.get(Tipo.HADA).add(Tipo.DRAGON);
                 tablaFuertes.get(Tipo.HADA).add(Tipo.LUCHA);
                 tablaFuertes.get(Tipo.HADA).add(Tipo.SINIESTRO);
                 tablaFuertes.get(Tipo.HIELO).add(Tipo.DRAGON);
                 tablaFuertes.get(Tipo.HIELO).add(Tipo.PLANTA);
                 tablaFuertes.get(Tipo.HIELO).add(Tipo.TIERRA);
                 tablaFuertes.get(Tipo.HIELO).add(Tipo.VOLADOR);
                 tablaFuertes.get(Tipo.LUCHA).add(Tipo.ACERO);
                 tablaFuertes.get(Tipo.LUCHA).add(Tipo.HIELO);
                 tablaFuertes.get(Tipo.LUCHA).add(Tipo.NORMAL);
                 tablaFuertes.get(Tipo.LUCHA).add(Tipo.ROCA);
                 tablaFuertes.get(Tipo.LUCHA).add(Tipo.SINIESTRO);
                 tablaFuertes.get(Tipo.PLANTA).add(Tipo.AGUA);
                 tablaFuertes.get(Tipo.PLANTA).add(Tipo.ROCA);
                 tablaFuertes.get(Tipo.PLANTA).add(Tipo.TIERRA);
                 tablaFuertes.get(Tipo.PSIQUICO).add(Tipo.LUCHA);
                 tablaFuertes.get(Tipo.PSIQUICO).add(Tipo.VENENO);
                 tablaFuertes.get(Tipo.ROCA).add(Tipo.BICHO);
                 tablaFuertes.get(Tipo.ROCA).add(Tipo.FUEGO);
                 tablaFuertes.get(Tipo.ROCA).add(Tipo.HIELO);
                 tablaFuertes.get(Tipo.ROCA).add(Tipo.VOLADOR);
                 tablaFuertes.get(Tipo.SINIESTRO).add(Tipo.FANTASMA);
                 tablaFuertes.get(Tipo.SINIESTRO).add(Tipo.PSIQUICO);
                 tablaFuertes.get(Tipo.TIERRA).add(Tipo.ACERO);
                 tablaFuertes.get(Tipo.TIERRA).add(Tipo.ELECTRICO);
                 tablaFuertes.get(Tipo.TIERRA).add(Tipo.FUEGO);
                 tablaFuertes.get(Tipo.TIERRA).add(Tipo.ROCA);
                 tablaFuertes.get(Tipo.TIERRA).add(Tipo.VENENO);
                 tablaFuertes.get(Tipo.VENENO).add(Tipo.HADA);
                 tablaFuertes.get(Tipo.VENENO).add(Tipo.PLANTA);
                 tablaFuertes.get(Tipo.VOLADOR).add(Tipo.BICHO);
                 tablaFuertes.get(Tipo.VOLADOR).add(Tipo.LUCHA);
                 tablaFuertes.get(Tipo.VOLADOR).add(Tipo.PLANTA);


             }


    }



    }
