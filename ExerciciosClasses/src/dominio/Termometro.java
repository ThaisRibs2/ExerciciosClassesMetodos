package dominio;

public class Termometro {
    public double temperaturaAtual;

    // Exercício 29
    public boolean passouDoLimite(double temperaturaLimite) {
        return temperaturaAtual > temperaturaLimite;
    }
}
