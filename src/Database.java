import java.util.ArrayList;


public class Database {
	public static final ArrayList<Letra> caracteres;
	static
	{
		caracteres = new ArrayList<Letra>();
		//inicializar esse array com todas as letras(maiusculas e minusculas) e numeros
	}
	public static Letra getLetra(String md5){
		
		ArrayList<Letra> lista;	
		while(lista != null){
			if(hashCode(lista) == md5){
				return lista.get(i);
			}
		}
	}
}
