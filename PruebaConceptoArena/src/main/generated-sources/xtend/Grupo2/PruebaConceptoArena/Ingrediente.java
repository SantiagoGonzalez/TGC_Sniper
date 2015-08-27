package Grupo2.PruebaConceptoArena;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class Ingrediente {
  private int cantidad;
  
  private String nombre;
  
  public Ingrediente(final int c, final String n) {
    this.cantidad = c;
    this.nombre = n;
  }
  
  public Object addPropertyChangeListener() {
    return null;
  }
  
  @Pure
  public int getCantidad() {
    return this.cantidad;
  }
  
  public void setCantidad(final int cantidad) {
    this.cantidad = cantidad;
  }
  
  @Pure
  public String getNombre() {
    return this.nombre;
  }
  
  public void setNombre(final String nombre) {
    this.nombre = nombre;
  }
}
