
import HW.Loader.FlowersLoader;
import HW.Loader.FlowersSaver;
import HW.Store.FlowerStore;

import java.io.File;

public class main {


    public static void main(String[] args) {

        FlowerStore fl = new FlowerStore();
        File packSave = null;
        System.out.println("HW 5_3 :");


        {


            System.out.println("\nTack 01........................................................................................");

            System.out.println(fl.flowersToStrin(fl.sell(3, 3, 3)));
            System.out.println("\n" + "--\\\\--" + "\n");
            System.out.println(fl.flowersToStrin(fl.sellSequence(6, 2, 3)));


        } // Tack 1

        //......

        {
            System.out.println("\nTack 02........................................................................................");
            System.out.println("Money of \" Store Flower \" : " + fl.getMoney());

        }// Tack 2


        {

            System.out.println("\nTack 04........................................................................................");
            File f = FlowersSaver.save(packSave, fl.sell(5, 5, 5));
            if (f == null) {
                System.out.println("Save error !");
            } else {

                System.out.println("Saved successfully in : " + f.getAbsolutePath());
                packSave = f;
            }

        }//Tack 4 save


        {
            System.out.println("\nTack 03........................................................................................");
            System.out.println("Loading.....");
            System.out.println(fl.flowersToStrin(FlowersLoader.load(packSave)));


        }// Tack 3 load


    }

}
