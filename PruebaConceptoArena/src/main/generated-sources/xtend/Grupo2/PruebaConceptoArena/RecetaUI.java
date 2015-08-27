package Grupo2.PruebaConceptoArena;

import Grupo2.PruebaConceptoArena.Dificultad;
import Grupo2.PruebaConceptoArena.Ingrediente;
import Grupo2.PruebaConceptoArena.Temporada;
import Grupo2.PruebaConceptoArena.Vegano;
import java.util.Collections;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.Observable;

@Observable
@Accessors
@SuppressWarnings("all")
public class RecetaUI {
  private Dificultad dificultad = Dificultad.BAJA;
  
  private String nombreReceta = "Asado bien rico";
  
  private int calorias = 666;
  
  private String creador = "Ajamon";
  
  private List<Ingrediente> ingredientes = Collections.<Ingrediente>unmodifiableList(CollectionLiterals.<Ingrediente>newArrayList(new Ingrediente(10, "pollo"), new Ingrediente(150, "semillas del ermitaño"), new Ingrediente(90, "fideos")));
  
  private Temporada temporada = Temporada.INVIERNO;
  
  private List<String> condimentos = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("aji", "picante", "sal", "pimienta"));
  
  private Ingrediente ingredienteSeleccionado;
  
  private List<Vegano> preCondiciones = Collections.<Vegano>unmodifiableList(CollectionLiterals.<Vegano>newArrayList(new Vegano(), new Vegano(), new Vegano()));
  
  private String metodoDePreparacion = "sarasa de preparacion asjnakjdsnkajsdnjkasndkjskjfnkajsnfkasnfkj";
  
  @Pure
  public Dificultad getDificultad() {
    return this.dificultad;
  }
  
  public void setDificultad(final Dificultad dificultad) {
    this.dificultad = dificultad;
  }
  
  @Pure
  public String getNombreReceta() {
    return this.nombreReceta;
  }
  
  public void setNombreReceta(final String nombreReceta) {
    this.nombreReceta = nombreReceta;
  }
  
  @Pure
  public int getCalorias() {
    return this.calorias;
  }
  
  public void setCalorias(final int calorias) {
    this.calorias = calorias;
  }
  
  @Pure
  public String getCreador() {
    return this.creador;
  }
  
  public void setCreador(final String creador) {
    this.creador = creador;
  }
  
  @Pure
  public List<Ingrediente> getIngredientes() {
    return this.ingredientes;
  }
  
  public void setIngredientes(final List<Ingrediente> ingredientes) {
    this.ingredientes = ingredientes;
  }
  
  @Pure
  public Temporada getTemporada() {
    return this.temporada;
  }
  
  public void setTemporada(final Temporada temporada) {
    this.temporada = temporada;
  }
  
  @Pure
  public List<String> getCondimentos() {
    return this.condimentos;
  }
  
  public void setCondimentos(final List<String> condimentos) {
    this.condimentos = condimentos;
  }
  
  @Pure
  public Ingrediente getIngredienteSeleccionado() {
    return this.ingredienteSeleccionado;
  }
  
  public void setIngredienteSeleccionado(final Ingrediente ingredienteSeleccionado) {
    this.ingredienteSeleccionado = ingredienteSeleccionado;
  }
  
  @Pure
  public List<Vegano> getPreCondiciones() {
    return this.preCondiciones;
  }
  
  public void setPreCondiciones(final List<Vegano> preCondiciones) {
    this.preCondiciones = preCondiciones;
  }
  
  @Pure
  public String getMetodoDePreparacion() {
    return this.metodoDePreparacion;
  }
  
  public void setMetodoDePreparacion(final String metodoDePreparacion) {
    this.metodoDePreparacion = metodoDePreparacion;
  }
}
