public class Empleado {
    private String nombre;
    private TipoContrato tipoContrato;

    public Empleado(String nombre, TipoContrato tipoContrato) {
        this.nombre = nombre;
        this.tipoContrato = tipoContrato;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoContrato getTipoContrato() {
        return tipoContrato;
    }

    public void cambiarTipoContrato(TipoContrato nuevoTipo) {
        this.tipoContrato = nuevoTipo;
    }
}
