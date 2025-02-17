package servicios;

public class EmpleadoImplementacion implements EmpleadoInterfaz {

	
	public void validarCLiente() {
		 
				System.out.println("DNI:" + " "+ dni + "\n" +
		        					"ID:"+ generarNuevoId() + "\n" + 
		        					"NOMBRE"+" " + apellido1 +"," + apellido2 +"," +  nombre + "\n" +
		        					"ESTADO DE VALIDACION:" + esValidado + "\n" +
		        					 "%%%%%%%%%%");
		
		
	}
	

}
