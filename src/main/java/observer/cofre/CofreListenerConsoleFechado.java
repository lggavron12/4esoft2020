package observer.cofre;

import java.util.Date;

public class CofreListenerConsoleFechado implements CofreListenerFechado{
	@Override
	public void cofreFoiFechado() {
		System.out.println("O cofre foi fechado: " + new Date().toLocaleString());		
	}
}
