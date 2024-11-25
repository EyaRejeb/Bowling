package bowling;

public class Lancer {
	private int nbQuille;

	public Lancer(int nbQuille) {
		if (nbQuille > 10 || nbQuille < -1) {
			throw new IllegalArgumentException("nombres de quilles incorrect");
		}
		this.nbQuille = nbQuille;
	}

	public Lancer() {
		this(-1);
	}

	public int getNbQuille() {
		return nbQuille;
	}

	public void setNbQuille(int nbQuille) {
		if (nbQuille > 10 || nbQuille < 0){
			throw new IllegalArgumentException("nombres quille incorrect");
		}
		this.nbQuille = nbQuille;
	}
}