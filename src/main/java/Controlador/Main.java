package Controlador;

import java.sql.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //launch(args);
        Connection connection= null;
        String url = "jdbc:mysql://localhost:3306/pokemones";
        String login = "root";
        String password = "";
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, login, password);

            System.out.println("Conexión establecida");

            mostrarPokemon(connection);
            Pokemon pikachu = new Pokemon();
            pikachu.setNumPokedex(25);
            pikachu.setNomPokemon("PIKACHU");
            pikachu.setTipo1("ELECTRICO");

            insertarPokemon(connection,pikachu);

        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally{
            try {
                connection.close();
                System.out.println("Conexión cerrada");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    private int x;
    public static void mostrarPokemon(Connection con) throws SQLException {
        String pok="Charizard";
        //String consulta = "SELECT * FROM POKEDEX";
        String consulta = "SELECT\n" +
                "\tPX.NUM_POKEDEX,\n" +
                "\tPX.NOM_POKEMON,\n" +
                "\tPX.TIPO1,\n" +
                "\tPX.TIPO2,\n" +
                "\tPX.IMG,\n" +
                "\tPX.SONIDO,\n" +
                "\tPK.ID_ENTRENADOR,\n" +
                "\tPK.ID_POKEMON,\n" +
                "\tPK.MOTE,\n" +
                "\tPK.SEXO,\n" +
                "\tPK.NIVEL,\n" +
                "\tPK.VITALIDAD,\n" +
                "\tPK.ATAQUE,\n" +
                "\tPK.DEFENSA,\n" +
                "\tPK.ATA_ESPECIAL,\n" +
                "\tPK.DEF_ESPECIAL,\n" +
                "\tPK.VELOCIDAD,\n" +
                "\tPK.ESTAMINA,\n" +
                "\tPK.FERTILIDAD\n" +
                "FROM POKEMON PK\n" +
                "INNER JOIN POKEDEX PX\n" +
                "ON PX.NUM_POKEDEX = PK.NUM_POKEDEX\n" +
                "WHERE NOM_POKEMON=\""+pok+"\"";
        Statement statement = con.createStatement();
        ResultSet rs = statement.executeQuery(consulta);

        Pokemon e = null;
        while (rs.next()) {
            e = new Pokemon();
            e.setNumPokedex(rs.getInt("num_pokedex"));
            e.setNomPokemon(rs.getString("nom_pokemon"));
            e.setTipo1(rs.getString("tipo1"));
            e.setTipo2(rs.getString("tipo2"));
            e.setIdEntrenador(rs.getInt("ID_ENTRENADOR"));
            e.setIdPokemon(rs.getInt("ID_POKEMON"));
            e.setMote(rs.getString("MOTE"));
            e.setSexo(rs.getString("SEXO").charAt(0));
            e.setNivel(rs.getInt("NIVEL"));
            e.setVitalidad(rs.getInt("VITALIDAD"));
            e.setAtaque(rs.getInt("ATAQUE"));
            e.setDefensa(rs.getInt("DEFENSA"));
            e.setAtEspecial(rs.getInt("ATA_ESPECIAL"));
            e.setDefEspecial(rs.getInt("DEF_ESPECIAL"));
            e.setVelocidad(rs.getInt("VELOCIDAD"));
            e.setEstamina(rs.getInt("ESTAMINA"));
            e.setFertilidad(rs.getInt("FERTILIDAD"));


            System.out.println(e.toString());
        }
        statement.close();
    }

    public static void insertarPokemon(Connection con, Pokemon p) throws SQLException {
        String sentencia ="INSERT INTO POKEDEX(NUM_POKEDEX,NOM_POKEMON, TIPO1, TIPO2) VALUES("+ p.getNumPokedex()
                +",'"+p.getNomPokemon()
                +"','"+p.getTipo1()
                +"','"+p.getTipo2()
                +"')";
        Statement stmt = null;
        try {
            stmt = con.createStatement();
            stmt.executeUpdate(sentencia);

            System.out.println("Nuevo pokemon insertado. "+p.getNomPokemon());
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            stmt.close();
            // Puede lanzar SQLExceptions, por eso he puesto el
            // throws en la cabecera del metodo
        }

    }
}