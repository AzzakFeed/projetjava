public class DemoJeu{
	public static void main (String[] args){

		Joueur j1=new Joueur("Green",2);		
		Pays p1 = new Pays(j1,1,"Homeland1",2);
		Pays p2 = new Pays(j1,2,"Homeland2",2);
		p1.addVoisin(p2);
		Pays p3 = new Pays(j1,3,"Homeland3",2);		
		System.out.println(j1.getCouleur());
		System.out.println(p1.getNom());
	}
}
