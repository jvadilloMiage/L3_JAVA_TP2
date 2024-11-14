package pokemon;

import java.util.Random;

public abstract class Pokemon {
	private String nom;
	private int niveau;
	protected int hp;
	private int atk;
	private static int niveauMax = 10;
	private TypePokemon typePokemon;
	
	
	public Pokemon(String nom,TypePokemon type){
		this.nom = nom;
		this.niveau = new Random().nextInt(1,11);
		this.hp = 2* this.niveau;
		this.atk = (this.niveau/2) + 1;
		this.typePokemon= type;
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
	
	public abstract void attaquer(Pokemon0 p);
	
	public abstract void subir();
	
	
	@Override
	public String toString() {
		String msg = this.nom+"\n Niveau: "+this.niveau+"\n HP: "+this.hp+"\n ATK: "+this.atk+"\n";
		return msg;
	}
	
	public void log(String msg) {
		System.out.println(msg);
	}
	
	public TypePokemon getType() {
		return this.typePokemon;
	}
	
}
