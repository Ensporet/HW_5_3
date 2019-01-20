package HW.Loader;

import HW.Flowers.Flowers_null;
import Library.Ens_File.File_ReadAndWriteObject;

import java.io.File;

public class FlowersLoader {


    public static Flowers_null[] load(File f) {


        File_ReadAndWriteObject file = new File_ReadAndWriteObject(f);


        try {
            return (Flowers_null[]) file.LoadAndClose();
        } catch (ClassCastException e0) {
            return new Flowers_null[0];
        } catch (NullPointerException e1) {
            return new Flowers_null[0];
        }


    }


}
