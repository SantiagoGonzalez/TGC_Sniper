package Grupo2.PruebaConceptoArena

import org.uqbar.arena.windows.MainWindow
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.layout.HorizontalLayout
import org.uqbar.arena.layout.ColumnLayout
import org.uqbar.arena.layout.VerticalLayout
import org.uqbar.arena.widgets.tables.Table
import org.uqbar.arena.widgets.tables.Column
import org.uqbar.arena.widgets.CheckBox
import org.uqbar.arena.widgets.List
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.bindings.PropertyAdapter

class PanelReceta extends MainWindow<RecetaUI> {

	new() {
		super(new RecetaUI)
	}

	override createContents(Panel mainPanel) {
		this.title = "Prueba de Concepto"

		crearTituloPanel(mainPanel)
		crearCuerpoPanel(mainPanel)

		crearPiePanel(mainPanel)
	}

	def crearPiePanel(Panel mainPanel) {
		var panel = new Panel(mainPanel)
		new Label(panel).text="Proceso de preparacion"
		new Label(panel).bindValueToProperty("metodoDePreparacion")
		
		new Button(panel).caption = "Volver"
	}

	def crearCuerpoPanel(Panel mainPanel) {
		var panel = new Panel(mainPanel)
		panel.layout = new ColumnLayout(2)
		crearLeftPanel(panel)
		crearRightPanel(panel)
	}

	def crearRightPanel(Panel panel) {
		var subPanel = new Panel(panel)
		new Label(subPanel) => [
			text = "Temporada"
			fontSize = 11
		]
		new Label(subPanel).bindValueToProperty("temporada")
		new Label(subPanel).text = "Condimentos"

		new List(subPanel) => [
			bindItemsToProperty("condimentos")
			width = 100
			height = 100
		]
		new Label(subPanel).text = "Condiciones Preexistentes"

		new List(subPanel) => [
			bindItemsToProperty("preCondiciones").adapter= new PropertyAdapter(Ingrediente, "nombre")
			
			width = 100
			height = 100
		]

	}

	def crearLeftPanel(Panel panel) {
		var subPanel = new Panel(panel)
		subPanel.layout = new VerticalLayout
		new Label(subPanel) => [
			text = "Dificultad"
			fontSize = 11
		]
		new Label(subPanel).bindValueToProperty("dificultad")

		new Label(subPanel).text = "Ingredientes"

		var tablaIngredientes = new Table<Ingrediente>(subPanel, typeof(Ingrediente))
		tablaIngredientes => [
			height = 50
			bindItemsToProperty("ingredientes")
			bindValueToProperty("ingredienteSeleccionado")
		]

		new Column<Ingrediente>(tablaIngredientes) => [
			title = "Dosis"
			fixedSize = 100
			bindContentsToProperty("cantidad")
		]

		new Column<Ingrediente>(tablaIngredientes) => [
			title = "Ingrediente"
			fixedSize = 200
			bindContentsToProperty("nombre")
		]

		new Label(subPanel).text = "Favorita"
		new CheckBox(subPanel)

	}

	def crearTituloPanel(Panel mainPanel) {
		var panel = new Panel(mainPanel)
		new Label(panel) => [
			fontSize = 15
			bindValueToProperty("nombreReceta")
		//		Agregar Negrita
		]

		crearTituloSubPanel(panel)
	}

	def crearTituloSubPanel(Panel panel) {
		var subPanel = new Panel(panel)
		subPanel.layout = new HorizontalLayout
		new Label(subPanel).bindValueToProperty("calorias")
		new Label(subPanel).text = "calorias     "

		//		Agregar espacio sin hardcodear los espacios
		new Label(subPanel).text = "creado por "
		new Label(subPanel).bindValueToProperty("creador")
	}

	def static main(String[] args) {
		new PanelReceta().startApplication
	}

}
