import java.util.Date;

public class Main {

	public static void main(String[] args) throws Exception {
		Geladeira geladeira = new Geladeira();
		geladeira.ligarEnergia();
		if (!geladeira.estaLigado()) {
			throw new Exception("geladeira nao ligou!");
		}
		System.out.println("geladeira ligada!");
		ConexaoBluetooth conB = new ConexaoBluetooth();
		conB.setIdDeviceA("idDeviceA");
		conB.setIdDeviceB("idDeviceB");
		conB.setInicCon(new Date());
		if (geladeira.conectarBluetooth(conB)) {
			System.out.println("Conexao Bluetooth com sucesso!");
		}else {
			System.out.println("Conexao Bluetooth falhou");
		}
		ConexaoInternet conI = new ConexaoInternet();
		conI.setIp("0.0.0.0");
		conI.setMacAddress("255.255.255");
		conI.setInicCon(new Date());
		if (geladeira.conectarInternet(conI)) {
			System.out.println("Conexao Internet com sucesso!");
		}else {
			System.out.println("Conexao Internet falhou");
		}
		
		while(geladeira.estaLigado()) {
			geladeira.desligarEnergia();
		}
		System.out.println("geladeira desligada!");
		
		
	}

}
