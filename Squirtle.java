package org.example;
import java.util.Random;
public class Squirtle extends Pokemon {

    private int vida;
    private int defesa;
    private String nome, ataqueespecificonome;

    public Squirtle() {

    }

    public Squirtle(String nome, int vida, int defesa, String ataqueespecificonome) {
        super(nome, vida, defesa, ataqueespecificonome);
    }
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void desenhosquirtle() {
        String asciisquirtle = """
                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⠟⣛⣛⣛⣛⠻⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⣉⣴⣶⣿⣿⣿⣿⣿⣿⣿⣿⣶⣦⣝⠻⣿⣿⣿⣿⣿⣿⣿
                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⢋⣴⣾⣿⣿⣿⣿⡿⠿⢯⡻⣿⣿⣿⣿⣿⣿⣷⣌⠻⣿⣿⣿⣿⣿
                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⢡⣾⣿⣿⣿⣿⣿⢣⣾⣿⠀⢳⣿⣿⣿⣿⣿⣿⣿⣿⣷⡹⣿⣿⣿⣿
                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢁⣿⣿⣿⣿⣿⣿⠇⠈⠛⠁⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣵⠃⣿⣿⣿⣿
                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⡛⢿⣿⣿⣿⡏⢸⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⣸⣿⣿⣿⣿⣿⣿⣿⣿⢣⠃⣿⣿⣿⣿
                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢱⣿⣶⣍⠻⠿⠃⢸⣿⣿⣿⣿⣿⣿⣄⣀⠀⠠⢃⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⣿⣿⣿⣿
                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⣶⣶⣾⣿⢰⣮⣳⣬⡓⠘⣿⣿⣿⣿⣧⡻⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡀⣀⢿⣿⣿⣿
                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⠸⣿⣿⣿⣸⣿⣿⣿⣿⣦⠹⣿⣿⣿⣿⣿⣷⣶⣬⣭⣍⣛⡛⠿⣿⣽⣿⣿⣿⣿⣿⣿⢸⣿⣿⣿
                ⣿⣿⣿⣿⡿⠟⣛⣩⣭⣭⣭⣙⡛⢿⣿⣿⣿⣿⣿⡇⢻⣿⣿⣿⣿⣿⣿⣿⣿⣷⡙⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⣍⣛⣛⣭⣴⡶⣠⣿⣿⣿⣿
                ⣿⣿⡿⢋⣴⣾⣿⣿⣿⣿⣿⣿⣿⣦⡙⣿⣿⣿⡟⢡⣆⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⠙⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⢟⣴⣿⣿⣿⣿⣿
                ⣿⠟⣠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡸⣿⡟⢠⣿⣿⣆⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⢰⣷⣮⣝⡛⠿⠿⣿⣿⣿⣿⡿⠿⢛⣩⣐⠿⣿⣿⣿⣿⣿⣿
                ⡿⢠⣿⣿⣿⣿⣟⣋⣛⠿⣿⣿⣿⣿⣿⡇⠟⢠⣿⣿⣿⣿⡆⠻⣿⣿⣿⣿⣿⣿⡿⠃⢾⣿⣿⣿⣿⣿⣷⣶⣶⣶⣶⡄⣿⣿⣿⣿⣿⣶⣝⠻⠿⢿⣿
                ⡇⢸⣿⣿⣿⣿⣿⣿⣿⣧⢹⣿⣿⣿⣿⡷⠀⢸⣿⣿⣿⣿⡇⣶⡝⠿⢿⡿⠿⠋⣠⣿⣦⡙⢿⣿⣿⣿⣿⣿⣿⣿⣿⣇⢹⣿⣿⣿⣿⣿⣿⣿⣿⡸⢿
                ⣧⠸⣿⣿⣿⣿⣿⣿⣿⣿⢸⣿⣿⣿⣿⡇⢸⠈⣿⣿⣿⡿⢡⣿⡏⣰⣶⣶⣾⡇⢿⣿⣿⣿⣷⣬⣉⣛⠛⠻⠿⠟⢛⣋⢸⣿⣿⣿⣿⣿⣿⣿⣿⢫⣾
                ⣿⣆⠹⣿⣿⣿⣿⣿⡿⢃⣾⣿⣿⣿⣿⡇⣾⣇⢹⣿⠟⣡⣿⡿⢡⣿⣿⣿⣿⣧⢸⣿⣿⣿⣿⣿⣿⣿⣿⡇⣼⣿⣿⡏⠘⠿⠿⢿⣿⡿⠿⠟⣋⣼⣿
                ⣿⣿⣆⢬⣙⣛⣛⣩⣴⣿⣿⣿⣿⣿⣿⡇⣿⣿⣆⢋⣾⣿⡟⣡⣿⣿⣿⣿⣿⣿⢸⣿⣿⣿⣿⣿⣿⣿⣿⢡⣿⣿⣿⠇⣿⣿⣶⣶⣶⣶⣿⣿⣿⣿⣿
                ⣿⣿⣿⣧⡹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⣿⣿⡇⡾⢟⣋⡘⢿⣿⣿⣿⣿⠿⣫⣌⠻⣿⣿⣿⣿⣿⣿⢃⣾⣿⣿⡟⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
                ⣿⣿⣿⣿⣿⣮⡻⣿⣿⣿⣿⣿⣿⣿⣿⣧⠸⠟⢀⣴⣿⣿⣿⣦⡙⠿⢟⣡⣾⣿⣿⣷⣦⣉⠛⠿⢿⠏⣼⣿⣿⠟⢰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
                ⣿⣿⣿⣿⣿⣿⣿⣦⡙⠿⣿⣿⣿⣿⣿⣿⠇⣰⣿⣿⣿⣿⣿⣿⣷⡄⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⠆⣴⣶⣶⠆⣰⣦⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣮⣍⡛⠻⠿⠟⢰⣿⣿⣿⣿⣿⣿⣿⣿⣷⠸⣿⣿⣿⣿⣿⣿⣿⣿⢏⣼⡿⠛⣡⣾⣿⣿⣧⢹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⢂⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠄⣉⣛⣛⣛⣛⣛⡛⠡⢚⣩⣴⣿⣿⣿⣿⣿⣿⡆⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⣠⣭⣿⣿⣭⣭⣅⡐⢾⣿⣿⣿⣿⣿⣿⣿⣿⣿⠁⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿
                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⣱⣿⣿⣿⣿⣿⣿⣿⣿⣿⢋⣼⣿⣿⣿⣿⣿⣿⣿⣿⣦⡙⢿⣿⣿⣿⣿⣿⣿⣿⡻⠷⣹⣿⣿⣿⣿⣿⣿⣿⣿
                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣌⡻⢿⣿⣿⣿⣿⣿⣿⡿⣡⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⠻⣿⣿⣿⣿⡿⠟⣋⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿
                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡸⠿⢛⣩⡻⣿⠏⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣌⣭⣭⣴⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
                ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣿⣿⣿⣷⣦⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀               
                                """;
        System.out.println(ANSI_BLUE + asciisquirtle + ANSI_RESET);
    }
    @Override
    protected int ataque() {
        return super.ataque();
    }

    protected int ataqueespecifico() {
        Random gerador = new Random();
        return gerador.nextInt(5) + 10;
    }

    @Override
    protected int danotomado(int ataque) {
        if (ataque > defesa) {
            int danotomado = ataque - defesa;
            vida -= danotomado;
        }
        if (vida < 0) {
            return 0;
        }
        return vida;
    }

    protected int danotomadoespecifico(int ataqueespecifico) {
        if (ataqueespecifico > defesa) {
            int danotomado = ataqueespecifico - defesa;
            vida -= danotomado;
        }
        if (vida < 0) {
            return 0;
        }
        return vida;
    }

    @Override
    public int getVida() {
        return vida;
    }

    @Override
    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public int getDefesa() {
        return defesa;
    }

    @Override
    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setAtacEspecNom(String atacEspecNom) {
        this.ataqueespecificonome = atacEspecNom;
    }
    public String getAtacEspecNom() {
        return ataqueespecificonome;
    }
}
