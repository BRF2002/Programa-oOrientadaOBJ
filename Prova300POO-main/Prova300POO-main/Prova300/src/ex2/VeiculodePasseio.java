package ex2;

public abstract class VeiculodePasseio {


		String Placa, Cor, Modelo, Fabricante, AnoDeFab, Diaria, NmrPortas;

		public VeiculodePasseio(String placa, String cor, String modelo, String fabricante, String anoDeFab,
				String diaria, String nmrPortas) {
			super();
			Placa = placa;
			Cor = cor;
			Modelo = modelo;
			Fabricante = fabricante;
			AnoDeFab = anoDeFab;
			Diaria = diaria;
			NmrPortas = nmrPortas;
		}

		public String getPlaca() {
			return Placa;
		}

		public void setPlaca(String placa) {
			Placa = placa;
		}

		public String getCor() {
			return Cor;
		}

		public void setCor(String cor) {
			Cor = cor;
		}

		public String getModelo() {
			return Modelo;
		}

		public void setModelo(String modelo) {
			Modelo = modelo;
		}

		public String getFabricante() {
			return Fabricante;
		}

		public void setFabricante(String fabricante) {
			Fabricante = fabricante;
		}

		public String getAnoDeFab() {
			return AnoDeFab;
		}

		public void setAnoDeFab(String anoDeFab) {
			AnoDeFab = anoDeFab;
		}

		public String getDiaria() {
			return Diaria;
		}

		public void setDiaria(String diaria) {
			Diaria = diaria;
		}

		public String getNmrPortas() {
			return NmrPortas;
		}

		public void setNmrPortas(String nmrPortas) {
			NmrPortas = nmrPortas;
		}
		
	}

