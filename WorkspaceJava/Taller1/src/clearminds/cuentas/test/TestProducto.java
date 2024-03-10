package clearminds.cuentas.test;

import clearminds.cuentas.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto producto1=new Producto(526,"Coca-Cola");
		
		producto1.setDescripcion("Esta buenarda");
		producto1.setPeso(12.8);
		
		System.out.println("////////////////////");
		System.out.println("PRODUCTO");
		System.out.println("////////////////////");
		
		System.out.println("Codigo: "+producto1.getCodigo());
		System.out.println("Nombre: "+producto1.getNombre());
		System.out.println("Descripcion: "+producto1.getDescripcion());
		System.out.println("Peso: "+producto1.getPeso());
	}

}
