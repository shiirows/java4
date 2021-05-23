class FilmJones  { 
    
    public static void main(String[] args) {
    
		String[] names = {"Harrison Ford", "Cate Blanchett", "Sean Connery"};
		String[] film = {"Crâne de Cristal ", "Dernière Croisade", "Temple maudit "};
		
		System.out.println("dans le film " + film[0] + " les principaux acteurs sont");
		
		for (String weapon : names) {
		    System.out.println(weapon); // affiche l'arme
		}
		

	}


}

