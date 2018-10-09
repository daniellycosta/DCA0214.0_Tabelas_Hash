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
	public static Conta getConta(String md5)
	{
		Conta conta = new Conta();
		int i = hashCode(md5(conta));
		ArrayList<Conta> lista = contas.get(i);	
		while(lista != null){
			if(hashCode(lista) == md5){
				return lista.get(i);
			}
		}

	}
	public static void insereConta(Conta conta){
		conta.getMd5();
		
		int i = hashCode(md5(conta));
		ArrayList<Conta> lista = contas.get(i);	
		md5(conta) = md5ToServer(conta)%100;
		lista.add(conta);
	}
}
