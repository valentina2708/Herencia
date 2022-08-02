public class Main {
    public static void main(String[] args) {

      Cliente cliente=new Cliente();
      cliente.setNombre("Martin");
      cliente.setEdad(23);
      cliente.setTelefono(312578093);
      cliente.setCredito("12000000");

        System.out.println("Nombre Cliente: " +cliente.getNombre());
        System.out.println("Edad: "+cliente.getEdad());
        System.out.println("Telefono: " +cliente.getTelefono());
        System.out.println("Credito: " +cliente.getCredito());
      System.out.println("*******");

        Trabajador trabajador=new Trabajador();
        trabajador.setNombre("Valentina");
        trabajador.setEdad(28);
        trabajador.setTelefono(8236578);
        trabajador.setSalario(950000);

      System.out.println("Nombre Trabajador: " +trabajador.getNombre());
      System.out.println("Edad: "+trabajador.getEdad());
      System.out.println("Telefono: " +trabajador.getTelefono());
      System.out.println("Salario: " +trabajador.getSalario());

    }
}