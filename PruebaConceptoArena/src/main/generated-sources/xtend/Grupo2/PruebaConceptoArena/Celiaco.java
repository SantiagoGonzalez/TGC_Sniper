package Grupo2.PruebaConceptoArena;

import Grupo2.PruebaConceptoArena.PreCondicion;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class Celiaco extends PreCondicion {
  @Accessors
  private String nombre = "Vegano";
  
  @Pure
  public String getNombre() {
    return this.nombre;
  }
  
  public void setNombre(final String nombre) {
    this.nombre = nombre;
  }
}
