package clearminds.cuentas;

public class Cuenta {
	private String id;
	private String tipo;
	private double saldo;
	
	public String getId() {
		return id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public Cuenta(String id) {
		this.id=id;
		tipo="A";
	}
	public Cuenta(String id, String tipo, double saldo) {
		this.id=id;
		this.tipo=tipo;
		this.saldo=saldo;
	}
	
	public void imprimir() {
		System.out.println("**************************");
		
		System.out.println("CUENTA");
		
		System.out.println("**************************");
		
		System.out.println("Numero de Cuenta: "+id);
		System.out.println("Tipo: "+tipo);
		System.out.println("Saldo: "+saldo);
		
		System.out.println("**************************");
	}
	public void imprimirConMiEstilo() {
		
		System.out.println("CUENTILLA");
		
		System.out.println("///////////////////////////");
		
		System.out.println("---------------------------");
		System.out.println("Numero Cuentilla: "+id);
		System.out.println("---------------------------");
		System.out.println("Tipo: "+tipo);
		System.out.println("---------------------------");
		System.out.println("Saldo: "+saldo);
		System.out.println("---------------------------");
		
		System.out.println("///////////////////////////");
	}
}
