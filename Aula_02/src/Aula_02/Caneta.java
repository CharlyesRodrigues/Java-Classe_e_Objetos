package Aula_02;

public class Caneta {
	String modelo;
	String cor;
	float ponta ;
	int carga;
	boolean tampada;

	void status() {
		
		System.out.println(	"A cor da caneta � : " + this.cor);
		System.out.println(	"O modelo da caneta � : " + this.modelo);
		System.out.println(	"Sua ponta � : " + this.ponta);
		System.out.println(	"Esta tampada ? " + this.tampada);
		System.out.println();
		
	}
	void rabiscar() {
		
		if(this.tampada == true) {
			
			System.out.println("ERRO : ELA ESTA TAMPADA. N�O POSSO RABISCAR");
		}else {
			
			System.out.println("Estou rabiscando");
		}		
	}
	void tampar() {
		this.tampada = true;
		
	}
	void destampar() {
		this.tampada = false;
		
	}
}
