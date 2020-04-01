package observer.cofre;

import java.util.ArrayList;
import java.util.List;

public class Cofre {

	private int senha;
	private boolean aberto;
	private List<CofreListenerAberto> listenersAberto = new ArrayList<>();
	private List<CofreListenerFechado> listenersFechado = new ArrayList<>();
	private List<CofreListenerSenhaIncorreta> listenersSenhaIncorreta = new ArrayList<>();

	public Cofre(int senha) {
		this.senha = senha;
		this.aberto = true;
	}

	public boolean isAberto() {
		return this.aberto;
	}

	public void fechar() {
		this.aberto = false;
		for (CofreListenerFechado listener : this.listenersFechado) {
			listener.cofreFoiFechado();
		}
	}

	public void abrir(int senhaInformada) throws SenhaIncorretaException {

		if (senhaInformada == this.senha) {
			this.aberto = true;
			this.listenersAberto.forEach(l -> l.cofreFoiAberto());
		} else {
			throw new SenhaIncorretaException();
		}

	}

	public void addListener(CofreListenerConsoleSenhaIncorreta listener) {
		this.listenersSenhaIncorreta.add(listener);
	}

	public void addListener(CofreListenerConsoleAberto listener) {
		this.listenersAberto.add(listener);
	}

	public void addListener(CofreListenerConsoleFechado listener) {
		this.listenersFechado.add(listener);
	}

}
