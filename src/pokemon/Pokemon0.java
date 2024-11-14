package pokemon;
import java.util.Random;
public class Pokemon0 {
	private String nom;
	private int niveau;
	private int hp;
	private int atk;
	
	public Pokemon0(String nom){
		this.nom = nom;
		this.niveau = new Random().nextInt(1,11);
		this.hp = 2* this.niveau;
		this.atk = (this.niveau/2) + 1;
	}
	
	public String getNomPokemon() {
		return this.nom;
	}
	
	public int getNiveau() {
		return this.niveau;
	}
	
	public int getHP() {
		return this.hp;
	}
	
	public int getAtk() {
		return this.atk;
	}
	
	public boolean isKO() {
		if(this.hp<= 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void soigner() {
		this.hp = 2* this.niveau;
	}
	
	public void attaquer(Pokemon0 p) {
		p.hp -= this.atk;
		System.out.println("J'attaque: "+p.getNomPokemon());
	}
	
	@Override
	public String toString() {
		String msg = this.nom+"\n Niveau: "+this.niveau+"\n HP: "+this.hp+"\n ATK: "+this.atk+"\n";
		return msg;
	}
	
	public void log(String msg) {
		System.out.println(msg);
	}
}

