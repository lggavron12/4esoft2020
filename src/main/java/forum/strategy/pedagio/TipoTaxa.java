package forum.strategy.pedagio;

import forum.strategy.pedagio.taxa.Caminhao;
import forum.strategy.pedagio.taxa.Motocicleta;
import forum.strategy.pedagio.taxa.Onibus;
import forum.strategy.pedagio.taxa.PequenoPorte;
import forum.strategy.pedagio.taxa.Utilitario;
import forum.strategy.pedagio.taxa.Van;

public enum TipoTaxa {
	caminhao {
		@Override
		public Pedagio informarTaxa() {
			return new Caminhao();
		}
	},
	motocicleta {
		@Override
		public Pedagio informarTaxa() {
			return new Motocicleta();
		}
	},
	onibus {
		@Override
		public Pedagio informarTaxa() {
			return new Onibus();
		}
	},
	pequenoporte {
		@Override
		public Pedagio informarTaxa() {
			return new PequenoPorte();
		}
	},
	utilitario {
		@Override
		public Pedagio informarTaxa() {
			return new Utilitario();
		}
	},
	van {
		@Override
		public Pedagio informarTaxa() {
			return new Van();
		}
	};

	public abstract Pedagio informarTaxa();
}
