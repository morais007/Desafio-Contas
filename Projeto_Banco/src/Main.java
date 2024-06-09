
public class Main {

	public static void main(String[] args) {
		Conta_Poupanca pp = new Conta_Poupanca();
	
		pp.Deposito(100);
		pp.Saque(10);
		pp.Transferencia(20);
		pp.Saldo();
		
		
		Conta_Corrente cc = new Conta_Corrente();
		
		cc.Deposito(600);
		cc.Saque(100);
		cc.Transferencia(70);
		cc.Saldo();
	

	}

}
