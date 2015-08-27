package Grupo2.PruebaConceptoArena;

import Grupo2.PruebaConceptoArena.Ingrediente;
import componenteAlimenticio.ComponenteAlimenticio;
import enums.Dificultad;
import enums.Temporada;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.bindings.ObservableValue;
import org.uqbar.arena.bindings.PropertyAdapter;
import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.layout.HorizontalLayout;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.CheckBox;
import org.uqbar.arena.widgets.Control;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.List;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.Selector;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.MainWindow;
import org.uqbar.arena.xtend.ArenaXtendExtensions;
import org.uqbar.lacar.ui.model.ControlBuilder;
import org.uqbar.lacar.ui.model.ListBuilder;
import org.uqbar.lacar.ui.model.bindings.Binding;
import recetas.Receta;
import recetas.RecetaSimple;
import usuario.Usuario;

@SuppressWarnings("all")
public class PanelReceta extends MainWindow<Receta> {
  public PanelReceta() {
    super(new RecetaSimple());
  }
  
  public void createContents(final Panel mainPanel) {
    this.setTitle("Prueba de Concepto");
    this.crearTituloPanel(mainPanel);
    this.crearCuerpoPanel(mainPanel);
    this.crearPiePanel(mainPanel);
  }
  
  public Button crearPiePanel(final Panel mainPanel) {
    Button _xblockexpression = null;
    {
      Panel panel = new Panel(mainPanel);
      Label _label = new Label(panel);
      _label.setText("Proceso de preparacion");
      Label _label_1 = new Label(panel);
      ObservableValue<Control, ControlBuilder> _value = _label_1.<ControlBuilder>value();
      final Function1<Receta, String> _function = new Function1<Receta, String>() {
        public String apply(final Receta r) {
          return r.getExplicacion();
        }
      };
      ArenaXtendExtensions.<Receta, String>operator_spaceship(_value, _function);
      Button _button = new Button(panel);
      _xblockexpression = _button.setCaption("Volver");
    }
    return _xblockexpression;
  }
  
  public List<Object> crearCuerpoPanel(final Panel mainPanel) {
    List<Object> _xblockexpression = null;
    {
      Panel panel = new Panel(mainPanel);
      ColumnLayout _columnLayout = new ColumnLayout(2);
      panel.setLayout(_columnLayout);
      this.crearLeftPanel(panel);
      _xblockexpression = this.crearRightPanel(panel);
    }
    return _xblockexpression;
  }
  
  public List<Object> crearRightPanel(final Panel panel) {
    List<Object> _xblockexpression = null;
    {
      Panel subPanel = new Panel(panel);
      Label _label = new Label(subPanel);
      final Procedure1<Label> _function = new Procedure1<Label>() {
        public void apply(final Label it) {
          it.setText("Temporada");
          it.setFontSize(11);
        }
      };
      ObjectExtensions.<Label>operator_doubleArrow(_label, _function);
      Label _label_1 = new Label(subPanel);
      ObservableValue<Control, ControlBuilder> _value = _label_1.<ControlBuilder>value();
      final Function1<Receta, Temporada> _function_1 = new Function1<Receta, Temporada>() {
        public Temporada apply(final Receta r) {
          return r.getTemporada();
        }
      };
      ArenaXtendExtensions.<Receta, Temporada>operator_spaceship(_value, _function_1);
      Label _label_2 = new Label(subPanel);
      _label_2.setText("Condimentos");
      List<Object> _list = new List<Object>(subPanel);
      final Procedure1<List<Object>> _function_2 = new Procedure1<List<Object>>() {
        public void apply(final List<Object> it) {
          Binding<?, Selector<Object>, ListBuilder<Object>> _bindItemsToProperty = it.bindItemsToProperty("condimentos");
          PropertyAdapter _propertyAdapter = new PropertyAdapter(ComponenteAlimenticio.class, "nombreDelComponente");
          _bindItemsToProperty.setAdapter(_propertyAdapter);
          it.setWidth(100);
          it.setHeight(100);
        }
      };
      ObjectExtensions.<List<Object>>operator_doubleArrow(_list, _function_2);
      Label _label_3 = new Label(subPanel);
      _label_3.setText("Condiciones Preexistentes");
      List<Object> _list_1 = new List<Object>(subPanel);
      final Procedure1<List<Object>> _function_3 = new Procedure1<List<Object>>() {
        public void apply(final List<Object> it) {
          Binding<?, Selector<Object>, ListBuilder<Object>> _bindItemsToProperty = it.bindItemsToProperty("preCondiciones");
          PropertyAdapter _propertyAdapter = new PropertyAdapter(Ingrediente.class, "nombre");
          _bindItemsToProperty.setAdapter(_propertyAdapter);
          it.setWidth(100);
          it.setHeight(100);
        }
      };
      _xblockexpression = ObjectExtensions.<List<Object>>operator_doubleArrow(_list_1, _function_3);
    }
    return _xblockexpression;
  }
  
  public CheckBox crearLeftPanel(final Panel panel) {
    CheckBox _xblockexpression = null;
    {
      Panel subPanel = new Panel(panel);
      VerticalLayout _verticalLayout = new VerticalLayout();
      subPanel.setLayout(_verticalLayout);
      Label _label = new Label(subPanel);
      final Procedure1<Label> _function = new Procedure1<Label>() {
        public void apply(final Label it) {
          it.setText("Dificultad");
          it.setFontSize(11);
        }
      };
      ObjectExtensions.<Label>operator_doubleArrow(_label, _function);
      Label _label_1 = new Label(subPanel);
      ObservableValue<Control, ControlBuilder> _value = _label_1.<ControlBuilder>value();
      final Function1<Receta, Dificultad> _function_1 = new Function1<Receta, Dificultad>() {
        public Dificultad apply(final Receta r) {
          return r.getDificultad();
        }
      };
      ArenaXtendExtensions.<Receta, Dificultad>operator_spaceship(_value, _function_1);
      Label _label_2 = new Label(subPanel);
      _label_2.setText("Ingredientes");
      Table<Ingrediente> tablaIngredientes = new Table<Ingrediente>(subPanel, Ingrediente.class);
      final Procedure1<Table<Ingrediente>> _function_2 = new Procedure1<Table<Ingrediente>>() {
        public void apply(final Table<Ingrediente> it) {
          it.setHeight(50);
          it.bindItemsToProperty("ingredientes");
          it.<Object, ControlBuilder>bindValueToProperty("ingredienteSeleccionado");
        }
      };
      ObjectExtensions.<Table<Ingrediente>>operator_doubleArrow(tablaIngredientes, _function_2);
      Column<Ingrediente> _column = new Column<Ingrediente>(tablaIngredientes);
      final Procedure1<Column<Ingrediente>> _function_3 = new Procedure1<Column<Ingrediente>>() {
        public void apply(final Column<Ingrediente> it) {
          it.setTitle("Dosis");
          it.setFixedSize(100);
          it.bindContentsToProperty("cantidad");
        }
      };
      ObjectExtensions.<Column<Ingrediente>>operator_doubleArrow(_column, _function_3);
      Column<Ingrediente> _column_1 = new Column<Ingrediente>(tablaIngredientes);
      final Procedure1<Column<Ingrediente>> _function_4 = new Procedure1<Column<Ingrediente>>() {
        public void apply(final Column<Ingrediente> it) {
          it.setTitle("Ingrediente");
          it.setFixedSize(200);
          it.bindContentsToProperty("nombre");
        }
      };
      ObjectExtensions.<Column<Ingrediente>>operator_doubleArrow(_column_1, _function_4);
      Label _label_3 = new Label(subPanel);
      _label_3.setText("Favorita");
      _xblockexpression = new CheckBox(subPanel);
    }
    return _xblockexpression;
  }
  
  public Binding<Object, Control, ControlBuilder> crearTituloPanel(final Panel mainPanel) {
    Binding<Object, Control, ControlBuilder> _xblockexpression = null;
    {
      Panel panel = new Panel(mainPanel);
      Label _label = new Label(panel);
      final Procedure1<Label> _function = new Procedure1<Label>() {
        public void apply(final Label it) {
          it.setFontSize(15);
          ObservableValue<Control, ControlBuilder> _value = it.<ControlBuilder>value();
          final Function1<Receta, String> _function = new Function1<Receta, String>() {
            public String apply(final Receta r) {
              return r.getNombreDelPlato();
            }
          };
          ArenaXtendExtensions.<Receta, String>operator_spaceship(_value, _function);
        }
      };
      ObjectExtensions.<Label>operator_doubleArrow(_label, _function);
      _xblockexpression = this.crearTituloSubPanel(panel);
    }
    return _xblockexpression;
  }
  
  public Binding<Object, Control, ControlBuilder> crearTituloSubPanel(final Panel panel) {
    Binding<Object, Control, ControlBuilder> _xblockexpression = null;
    {
      Panel subPanel = new Panel(panel);
      HorizontalLayout _horizontalLayout = new HorizontalLayout();
      subPanel.setLayout(_horizontalLayout);
      Label _label = new Label(subPanel);
      ObservableValue<Control, ControlBuilder> _value = _label.<ControlBuilder>value();
      final Function1<Receta, Integer> _function = new Function1<Receta, Integer>() {
        public Integer apply(final Receta r) {
          return Integer.valueOf(r.getCaloriasTotales());
        }
      };
      ArenaXtendExtensions.<Receta, Integer>operator_spaceship(_value, _function);
      Label _label_1 = new Label(subPanel);
      _label_1.setText("calorias     ");
      Label _label_2 = new Label(subPanel);
      _label_2.setText("creado por ");
      Label _label_3 = new Label(subPanel);
      Binding<Object, Control, ControlBuilder> _bindValueToProperty = _label_3.<Object, ControlBuilder>bindValueToProperty("creador");
      PropertyAdapter _propertyAdapter = new PropertyAdapter(Usuario.class, "nombre");
      _xblockexpression = _bindValueToProperty.setAdapter(_propertyAdapter);
    }
    return _xblockexpression;
  }
  
  public static void main(final String[] args) {
    PanelReceta _panelReceta = new PanelReceta();
    _panelReceta.startApplication();
  }
}
