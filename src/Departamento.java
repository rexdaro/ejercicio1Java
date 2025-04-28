import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nombre;
    private List<Oficina> oficinas;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.oficinas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarOficina(Oficina oficina) {
        oficinas.add(oficina);
    }

    public List<Oficina> getOficinas() {
        return oficinas;
    }
}
