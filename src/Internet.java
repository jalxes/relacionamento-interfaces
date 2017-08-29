
public interface Internet {
	ConexaoInternet getConexaoInternet();

	boolean conectarInternet(ConexaoInternet con);

    void desconectarInternet();


}
