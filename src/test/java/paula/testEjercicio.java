package paula;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;



public class testEjercicio {
	@ParameterizedTest(name = "todos={0},presentados={1}, el resultado esperado es {2}")
	@CsvFileSource(resources = "ejercicio.csv", delimiter = ';')
	void testlistaEstudiantesNoPresentados(String todos, String presentados, String esperado) {

		 ArrayList<String> todosList = new ArrayList<String>(Arrays.asList(todos.split(",")));
	        ArrayList<String> presentadosList = new ArrayList<String>(Arrays.asList(presentados.split(",")));
	        ArrayList<String> esperadoList = new ArrayList<String>(Arrays.asList(esperado.split(",")));
	        ejercicio ejercicio = new ejercicio();
	        ArrayList<String> result = ejercicio.listaEstudiantesNoPresentados(todosList, presentadosList);
		assertEquals(result, esperadoList);
	}
}
