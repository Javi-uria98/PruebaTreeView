package es.javier.views;

import es.javier.models.Animal;
import javafx.application.Application;
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
            Animal objectToTreeView = new ObjectToTreeView(object);
            treeItemsContainer.add(objectToTreeView.getRootItem());
        }

        TreeView<Animal> tree = new TreeView<>();
        tree.setShowRoot(false);

        TreeItem<Animal> treeRoot = new TreeItem<>();
        tree.setRoot(treeRoot);

    }



    public static void main(String[]args){
        launch(args);
    }


}
