package observer.cofre;

import java.util.Date;

public class CofreListenerConsoleSenhaIncorreta implements CofreListenerSenhaIncorreta{
	@Override
	public void SenhaIncorretaException() {
		System.out.println("Senha incorreta!");		
	}
}
