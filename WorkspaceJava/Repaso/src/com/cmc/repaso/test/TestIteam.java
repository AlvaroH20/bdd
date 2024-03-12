package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestIteam {

	public static void main(String[] args) {
		Item item=new Item();
		Item item2=new Item();
		item.setProductosActuales(20);
		//item.vender(5);
		item.setNombre("Cola Coca");
		item.devolver(8);
		item.imprimir();
		
		item2.setNombre("Papas");
		item2.setProductosActuales(45);
		//item2.vender(1);
		item2.devolver(3);
		item2.imprimir();

	}

}
