package observer.cofre;

import java.util.Date;

public class CofreListenerConsoleAberto implements CofreListenerAberto{
	@Override
	public void cofreFoiAberto() {
		System.out.println("O cofre foi aberto: " + new Date().toLocaleString());
	}
}
