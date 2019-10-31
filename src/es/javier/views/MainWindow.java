package es.javier.views;

import es.javier.models.Animal;
import es.javier.models.AnimalTreeView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainWindow extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Animal a1=new Animal("Vertebrado","Perro",4, 13);
        Animal a2=new Animal("Invertebrado", "Ostra", 0, 6);

        List<Animal> listaAnimales=new ArrayList<>();
        listaAnimales.add(a1);
        listaAnimales.add(a2);

        List<TreeItem<String>> treeItemsContenedor = new ArrayList();

        for (Animal animal : listaAnimales) {
            AnimalTreeView animalTreeView = new AnimalTreeView(animal);
            treeItemsContenedor.add(animalTreeView.getRootItem());
        }

        TreeItem<String> rootItem = new TreeItem();
        rootItem.setExpanded(true);
        rootItem.getChildren().addAll(treeItemsContenedor);
        rootItem.setValue("Animales");

        TreeView treeView = new TreeView(rootItem);

        Scene scene = new Scene(treeView, 300, 250);

        stage.setTitle("Hello World!");
        stage.setScene(scene);
        stage.show();

    }



    public static void main(String[]args){
        launch(args);
    }


}
