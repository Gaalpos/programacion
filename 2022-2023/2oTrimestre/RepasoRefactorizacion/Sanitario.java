// Tenemos 3 tipos de sanitarios ,
// enfermeros, medicos de familia y cirujanos

class Enfermero extends Sanitario{
    private int inyeccionesSuministradas; 
   

}

class Medico extends Sanitario{
    private int numeroGuardias;
    private Sanitario[] sanitariosACargo;
}


class MedicoFamilia extends Medico{

}


class Cirujano extends Medico{
    private int numeroGuardias;
    private int numeroOperaciones;
    private Sanitario[] sanitariosACargo;
}


public class Sanitario {
    private Sanitario jefe; // Aplicable a cualquier tipo de sanitario
    private int sueldo_bruto; // Aplicable a cualquier tipo de sanitario
 
   
 }