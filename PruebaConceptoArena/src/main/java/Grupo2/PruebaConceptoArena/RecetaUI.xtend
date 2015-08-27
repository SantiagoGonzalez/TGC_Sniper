package Grupo2.PruebaConceptoArena

import org.uqbar.commons.utils.Observable
import org.eclipse.xtend.lib.annotations.Accessors
import java.util.HashSet
import java.util.List
import java.util.ArrayList

@Observable
@Accessors
class RecetaUI {
	Dificultad dificultad=Dificultad.BAJA
	String nombreReceta="Asado bien rico"
	int calorias=666
	String creador="Ajamon"
	List<Ingrediente> ingredientes= #[new Ingrediente(10,"pollo"),new Ingrediente(150,"semillas del ermitaño"),new Ingrediente(90,"fideos")]
	Temporada temporada=Temporada.INVIERNO
	List<String> condimentos= #["aji","picante","sal","pimienta"]
	Ingrediente ingredienteSeleccionado
//	TODO: que sea de precondiciones
	List<Vegano> preCondiciones= #[new Vegano,new Vegano,new Vegano]
	String metodoDePreparacion="sarasa de preparacion asjnakjdsnkajsdnjkasndkjskjfnkajsnfkasnfkj"
}


abstract class PreCondicion {
//	@Accessors
//	 String nombre="PreCondicion"
	 
}

@Accessors
class Vegano extends PreCondicion{
//	override getNombre(){
//		"Vegano"
//	}
String nombre="Vegano"
}
class Celiaco extends PreCondicion{
	@Accessors
String nombre="Vegano"
	
//	override getNombre(){
//		"Celiaco"
//	}

}

enum Temporada {
	INVIERNO,
	VERANO
}
enum Dificultad{
	BAJA,
	MEDIA,
	ALTA
}
@Accessors
class Ingrediente {
	int cantidad
	String nombre
	
	new (int c,String n){
		cantidad=c
		nombre=n
	}
	
	def addPropertyChangeListener(){}
}