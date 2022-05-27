package practica1.ejercicio2;

public class Client {

    public static void main(String[] args) {

        Person d1 = new Person("Juan", "Perez");
        Person d2 = new Person("Ronaldo", "Juarez");
        Person d3 = new Person("Lionel", "Zarate");
        Person d4 = new Person("Anthony", "Pettros");
        Person d5 = new Person("Diego", "Armando");
        Person d6 = new Person("Ramiro", "Dosantos");
        Person d7 = new Person("Tamara", "Ledzma");
        Person d8 = new Person("Maria", "Espejo");
        Person d9 = new Person("Rosa", "Gamino");
        Person d10 = new Person("Lucia", "Estrada");
        Person d11 = new Person("Mauricio", "Duran");
        Person d12 = new Person("Mateo", "Diaz");
        Person d13 = new Person("Camila", "Baselli");
        Person d14 = new Person("Ronda", "Reotro");
        Person d15 = new Person("Jenny", "Lotra");

        Contract template = new Contract();
        template.setSueldo(5000);
        template.setCargaHoraria(80);
        template.setCursoEducacionSuperior(true);
        template.setAccesoPlataforma(true);
        template.setMarcadoBiometrico(false);
        template.setHoraEntrada("8:00");
        template.setHoraSalida("18:00");

        Contract c1 = template.clone();
        Contract c2 = template.clone();
        Contract c3 = template.clone();
        Contract c4 = template.clone();
        Contract c5 = template.clone();
        Contract c6 = template.clone();
        Contract c7 = template.clone();
        Contract c8 = template.clone();
        Contract c9 = template.clone();
        Contract c10 = template.clone();
        Contract c11 = template.clone();
        Contract c12 = template.clone();
        Contract c13 = template.clone();
        Contract c14 = template.clone();
        Contract c15 = template.clone();

        c1.setDocente(d1);
        c2.setDocente(d2);
        c3.setDocente(d3);
        c4.setDocente(d4);
        c5.setDocente(d5);
        c6.setDocente(d6);
        c7.setDocente(d7);
        c8.setDocente(d8);
        c9.setDocente(d9);
        c10.setDocente(d10);
        c11.setDocente(d11);
        c12.setDocente(d12);
        c13.setDocente(d13);
        c14.setDocente(d14);
        c15.setDocente(d15);

        c1.showContractInfo();
        c2.showContractInfo();
        c3.showContractInfo();
        c4.showContractInfo();
        c5.showContractInfo();
        c6.showContractInfo();
        c7.showContractInfo();
        c8.showContractInfo();
        c9.showContractInfo();
        c10.showContractInfo();
        c11.showContractInfo();
        c12.showContractInfo();
        c13.showContractInfo();
        c14.showContractInfo();
        c15.showContractInfo();
    }
}
