package Grupo2.PruebaConceptoArena;

import Grupo2.PruebaConceptoArena.PreCondicion;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class Vegano extends PreCondicion {
  private String nombre = "Vegano";
  
  @Pure
  public String getNombre() {
    return this.nombre;
  }
  
  public void setNombre(final String nombre) {
    this.nombre = nombre;
  }
}
