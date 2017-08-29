
public class Geladeira implements Bluetooth, Internet, Energia{

    private boolean ligado;
    private ConexaoInternet conexaoInternet;
    private ConexaoBluetooth conexaoBluetooth;

	@Override
	public boolean estaLigado() {
		return this.ligado;
	}

	@Override
	public void ligarEnergia() {
        this.ligado = true;
	}

	@Override
	public void desligarEnergia() {
        this.desconectarBluetooth();
        this.desconectarInternet();
        this.ligado = false;

	}

	@Override
	public ConexaoInternet getConexaoInternet() {
		return this.conexaoInternet;
	}

	@Override
	public boolean conectarInternet(ConexaoInternet con) {
        try {
            this.conexaoInternet = con;
        }catch (Exception e) {
            return false;
        }

		return true;
	}

	@Override
	public void desconectarInternet() {
		this.conexaoInternet = null;

	}

	@Override
	public ConexaoBluetooth getConexaoBluetooth() {
		return this.conexaoBluetooth;
	}

	@Override
	public boolean conectarBluetooth(ConexaoBluetooth con) {
        try {
            this.conexaoBluetooth = con;
        }catch (Exception e) {
            return false;
        }
		return true;
	}

	@Override
	public void desconectarBluetooth() {
		this.conexaoBluetooth = null;

	}


}
