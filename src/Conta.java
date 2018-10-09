
public class Conta {
	private String nomeCliente;
	private String saldo;
	private String agencia;
	private String numero;
	private String senha;
	private String md5;
	
//falta completar os construtores da classe Conta, fazendo com que o campo md5 de
	//cada conta seja inicializado por meio do metodo criado.
	Conta(String agencia, String numero, String senha){
		this.agencia = agencia;
		this.numero = numero;
		this.senha = senha;
	}
	Conta(String agencia, String numero, String senha, String saldo, String nomeCliente){
		this.agencia = agencia;
		this.numero = numero;
		this.senha = senha;
		this.saldo = saldo;
		this.nomeCliente = nomeCliente;
	}
	Conta(String nomeCliente,String saldo){
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getSaldo() {
		return saldo;
	}
	public void setSaldo(String saldo) {
		this.saldo = saldo;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getMd5() {
		return md5;
	}
	public void setMd5(String md5) {
		this.md5 = md5;
	}
	@Override
	public String toString() {
		return "Conta [nomeCliente=" + nomeCliente + ", saldo=" + saldo
				+ ", agencia=" + agencia + ", numero=" + numero + ", senha="
				+ senha + ", md5=" + md5 + "]";
	}

}