import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private List<Departamento> departamentos;
    private List<Empleado> empleados;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.departamentos = new ArrayList<>();
        this.empleados = new ArrayList<>();
    }

    public void agregarDepartamento(Departamento depto) {
        departamentos.add(depto);
    }

    public void asignarEmpleado(Empleado emp) {
        empleados.add(emp);
    }

    public void mostrarEstructura() {
        System.out.println("Empresa: " + nombre);
        for (Departamento depto : departamentos) {
            System.out.println("  Departamento: " + depto.getNombre());
            for (Oficina oficina : depto.getOficinas()) {
                System.out.println("    Oficina: " + oficina.getNombre());
            }
        }
    }
}
