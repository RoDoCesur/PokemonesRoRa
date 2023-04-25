package Controlador;
public class Pokemon {

    private int numPokedex;
    private String nomPokemon;
    private String tipo1;
    private String tipo2;
    private String img;
    private String sonido;
    private int idEntrenador;
    private int idPokemon;
    private String mote;
    private char sexo;
    private int nivel;
    private int vitalidad;
    private int ataque;
    private int defensa;
    private int atEspecial;
    private int defEspecial;
    private int velocidad;
    private int estamina;
    private int fertilidad;

    public Pokemon() {
        super();
        this.numPokedex = 0;
        this.nomPokemon = "";
        this.tipo1 = "";
        this.tipo2 = "";
        this.img = "";
        this.sonido = "";
        this.idEntrenador = 0;
        this.idPokemon = 0;
        this.mote = "";
        this.sexo = 'H';
        this.nivel = 0;
        this.vitalidad = 0;
        this.ataque = 0;
        this.defensa = 0;
        this.atEspecial = 0;
        this.defEspecial = 0;
        this.velocidad = 0;
        this.estamina = 0;
        this.fertilidad = 0;
    }

    public Pokemon(int numPokedex, String nomPokemon, String tipo1, String tipo2, String img, String sonido,
                   int idEntrenador, int idPokemon, String mote, char sexo, int nivel, int vitalidad, int ataque, int defensa,
                   int atEspecial, int defEspecial, int velocidad, int estamina, int fertilidad) {
        super();
        this.numPokedex = numPokedex;
        this.nomPokemon = nomPokemon;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
        this.img = img;
        this.sonido = sonido;
        this.idEntrenador = idEntrenador;
        this.idPokemon = idPokemon;
        this.mote = mote;
        this.sexo = sexo;
        this.nivel = nivel;
        this.vitalidad = vitalidad;
        this.ataque = ataque;
        this.defensa = defensa;
        this.atEspecial = atEspecial;
        this.defEspecial = defEspecial;
        this.velocidad = velocidad;
        this.estamina = estamina;
        this.fertilidad = fertilidad;
    }

    public int getNumPokedex() {
        return numPokedex;
    }

    public void setNumPokedex(int numPokedex) {
        this.numPokedex = numPokedex;
    }

    public String getNomPokemon() {
        return nomPokemon;
    }

    public void setNomPokemon(String nomPokemon) {
        this.nomPokemon = nomPokemon;
    }

    public String getTipo1() {
        return tipo1;
    }

    public void setTipo1(String tipo1) {
        this.tipo1 = tipo1;
    }

    public String getTipo2() {
        return tipo2;
    }

    public void setTipo2(String tipo2) {
        this.tipo2 = tipo2;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    public int getIdEntrenador() {
        return idEntrenador;
    }

    public void setIdEntrenador(int idEntrenador) {
        this.idEntrenador = idEntrenador;
    }

    public int getIdPokemon() {
        return idPokemon;
    }

    public void setIdPokemon(int idPokemon) {
        this.idPokemon = idPokemon;
    }

    public String getMote() {
        return mote;
    }

    public void setMote(String mote) {
        this.mote = mote;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getVitalidad() {
        return vitalidad;
    }

    public void setVitalidad(int vitalidad) {
        this.vitalidad = vitalidad;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getAtEspecial() {
        return atEspecial;
    }

    public void setAtEspecial(int atEspecial) {
        this.atEspecial = atEspecial;
    }

    public int getDefEspecial() {
        return defEspecial;
    }

    public void setDefEspecial(int defEspecial) {
        this.defEspecial = defEspecial;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getEstamina() {
        return estamina;
    }

    public void setEstamina(int estamina) {
        this.estamina = estamina;
    }

    public int getFertilidad() {
        return fertilidad;
    }

    public void setFertilidad(int fertilidad) {
        this.fertilidad = fertilidad;
    }

    @Override
    public String toString() {
        return "Pokemon [numPokedex=" + numPokedex + ", nomPokemon=" + nomPokemon + ", tipo1=" + tipo1 + ", tipo2="
                + tipo2 + ", img=" + img + ", sonido=" + sonido + ", idEntrenador=" + idEntrenador + ", idPokemon="
                + idPokemon + ", mote=" + mote + ", sexo=" + sexo + ", nivel=" + nivel + ", vitalidad=" + vitalidad
                + ", ataque=" + ataque + ", defensa=" + defensa + ", atEspecial=" + atEspecial + ", defEspecial="
                + defEspecial + ", velocidad=" + velocidad + ", estamina=" + estamina + ", fertilidad=" + fertilidad
                + "]";
    }



}
