package Aula_02;
public class Class_e_Objeto {

	public static void main(String[] args) {
	

		Caneta c1 = new Caneta();
		c1.cor ="azul";
		c1.modelo ="Bic";
		c1.ponta = 0.5f;
		c1.destampar();
		c1.rabiscar();
		c1.status();
		
		
		Caneta c2 = new Caneta();
		c2.cor ="Amarela";
		c2.modelo ="Zebra";
		c2.ponta = 2.0f;
		c2.tampada = true;
		
		c2.status();
		c2.rabiscar();
		
		
	}

}
