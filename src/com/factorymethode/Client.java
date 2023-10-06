package com.factorymethode;

public class Client {

	public static void main(String[] args) {
		
		ProduitFactory produitFactory= new ProduitFactory();
		
		ProduitA produitA=null;
		
		produitA= produitFactory.getProduitA(ProduitFactory.TYPE_PRODUITA1);
		produitA.methodeA();
		produitA= produitFactory.getProduitA(ProduitFactory.TYPE_PRODUITA2);
		produitA.methodeA();
		produitA= produitFactory.getProduitA(ProduitFactory.TYPE_PRODUITA3);
		produitA.methodeA();

	}

}
