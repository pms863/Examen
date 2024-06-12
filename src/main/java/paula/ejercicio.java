package paula;

import java.util.ArrayList;

public class ejercicio {
	public static ArrayList<String> listaEstudiantesNoPresentados(ArrayList<String> todos,
			ArrayList<String> presentados) {
		ArrayList<String> noPresentados = new ArrayList<String>();

		for (String estudiante : todos) {
			if (!presentados.contains(estudiante)) {
				noPresentados.add(estudiante);
			}
		}

		return noPresentados;
	}
}
