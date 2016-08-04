/**
 * Created by josebovet on 8/1/16.
 */
public class ValidaData {

    public boolean valida(String nombre, Integer edad) {
        if (nombre == null || edad == null) throw new IllegalArgumentException("dato invalido");
        return true;
    }
}
