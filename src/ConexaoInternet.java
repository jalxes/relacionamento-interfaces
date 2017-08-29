import java.util.Date;

public class ConexaoInternet{
    String ip;
    String macAddress;
    Date inicCon;
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getMacAddress() {
		return macAddress;
	}
	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}
	public Date getInicCon() {
		return inicCon;
	}
	public void setInicCon(Date inicCon) {
		this.inicCon = inicCon;
	}
}
