package practica1.ejercicio2;

public class Contract implements IContract{

    private int sueldo;
    private int cargaHoraria;
    private boolean cursoEducacionSuperior;
    private boolean accesoPlataforma;
    private boolean marcadoBiometrico;
    private String horaEntrada;
    private String horaSalida;
    private Person docente = new Person("", "");

    public Contract() {}

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public boolean isCursoEducacionSuperior() {
        return cursoEducacionSuperior;
    }

    public void setCursoEducacionSuperior(boolean cursoEducacionSuperior) {
        this.cursoEducacionSuperior = cursoEducacionSuperior;
    }

    public boolean isAccesoPlataforma() {
        return accesoPlataforma;
    }

    public void setAccesoPlataforma(boolean accesoPlataforma) {
        this.accesoPlataforma = accesoPlataforma;
    }

    public boolean isMarcadoBiometrico() {
        return marcadoBiometrico;
    }

    public void setMarcadoBiometrico(boolean marcadoBiometrico) {
        this.marcadoBiometrico = marcadoBiometrico;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Person getDocente() {
        return docente;
    }

    public void setDocente(Person docente) {
        this.docente = docente;
    }

    @Override
    public Contract clone() {

        Contract clone = new Contract();
        clone.setSueldo(this.getSueldo());
        clone.setCargaHoraria(this.getCargaHoraria());
        clone.setCursoEducacionSuperior(this.isCursoEducacionSuperior());
        clone.setAccesoPlataforma(this.isAccesoPlataforma());
        clone.setMarcadoBiometrico(this.isMarcadoBiometrico());
        clone.setHoraEntrada(this.getHoraEntrada());
        clone.setHoraSalida(this.getHoraSalida());

        return clone;
    }

    public void showContractInfo() {
        System.out.println("\n ****** CONTRATO ******");
        System.out.println("Docente: " + this.getDocente().apellido + ", " + this.getDocente().nombre);
        System.out.println("Sueldo: " + this.getSueldo());
        System.out.println("Carga horaria: " + this.getCargaHoraria());
        System.out.println("Curso de educacion superior: " + this.isCursoEducacionSuperior());
        System.out.println("Acceso a plataforma: " + this.isAccesoPlataforma());
        System.out.println("Marcado biometrico: " + this.isMarcadoBiometrico());
        System.out.println("Hora entrada: " + this.getHoraEntrada());
        System.out.println("Hora salida: " + this.getHoraSalida());
    }
}
