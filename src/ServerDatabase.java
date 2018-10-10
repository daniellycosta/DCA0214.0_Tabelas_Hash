import java.math.BigInteger;
import java.util.ArrayList;

public class ServerDatabase extends Database{
	public static final ArrayList<ArrayList<Conta>> contas;
	public static final int N = 100;
	static{
		contas = new ArrayList<ArrayList<Conta>>();
		for(int i=0;i<N;i++){
			contas.add(new ArrayList<Conta>());
		}
	}
	public static int hashCode(String md5)
	{
		BigInteger bi = new BigInteger(md5, 16);
		BigInteger m = new BigInteger(Integer.toString(N), 10);
		int pos;
		pos = bi.mod(m).intValue();
		return pos;
	}
		
	public static void insereConta(Conta conta){
		String md5 = SecurityProvider.md5ToServer(conta);
		int i = hashCode(md5)%100; // é aqui que pega o resto da divisão, não?
		ArrayList<Conta> lista = contas.get(i);	 //tem que ver um jeito de tratar i iguais
		//md5(conta) = md5ToServer(conta)%100; não entendi [Dani]
		lista.add(conta);
	}
	
	public static Conta getConta(String md5){
		int i  = hashCode(md5)%100;
		ArrayList<Conta> lista = contas.get(i);	
		while(lista != null){
			if(lista.get(i).getMd5() == md5){
				return lista.get(i);
			}
		}
		return null;
	}

}
