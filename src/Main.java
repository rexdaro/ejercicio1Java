public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("MiEmpresa");

        Departamento depto1 = new Departamento("Recursos Humanos");
        Departamento depto2 = new Departamento("Tecnología");

        Oficina oficina1 = new Oficina("Oficina 101");
        Oficina oficina2 = new Oficina("Oficina 102");
        Oficina oficina3 = new Oficina("Oficina 201");

        depto1.agregarOficina(oficina1);
        depto1.agregarOficina(oficina2);
        depto2.agregarOficina(oficina3);

        empresa.agregarDepartamento(depto1);
        empresa.agregarDepartamento(depto2);

        Empleado empleado1 = new Empleado("Juan Pérez", TipoContrato.INDEFINIDO);
        Empleado empleado2 = new Empleado("Ana Gómez", TipoContrato.PASANTIA);

        empresa.asignarEmpleado(empleado1);
        empresa.asignarEmpleado(empleado2);

        empresa.mostrarEstructura();
    }
}
