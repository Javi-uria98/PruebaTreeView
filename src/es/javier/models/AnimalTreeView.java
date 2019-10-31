package es.javier.models;

import javafx.scene.control.TreeItem;

public class AnimalTreeView {

    private final TreeItem<String> rootItem = new TreeItem();

    public AnimalTreeView(Animal animal)
    {
        rootItem.setValue(animal.getNombre());

        rootItem.getChildren().add(new TreeItem("Tipo: "+animal.getTipo()));
        rootItem.getChildren().add(new TreeItem("Numero de patas: "+animal.getNumero_patas()));
        rootItem.getChildren().add(new TreeItem("Esperanza de vida: "+animal.getEsperanza_vida()));
    }

    public TreeItem<String> getRootItem()
    {
        return rootItem;
    }

}
