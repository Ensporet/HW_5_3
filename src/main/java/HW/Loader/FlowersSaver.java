package HW.Loader;

import HW.Flowers.Flowers_null;
import Library.Ens_File.File_ReadAndWriteObject;

import java.io.File;

public class FlowersSaver {


    public static File save(File f, Flowers_null[] fl) {


        File_ReadAndWriteObject file = new File_ReadAndWriteObject(f);

        if (file.saveAndClosse(fl)) {

            return file.getFile();

        }
        ;


        return null;
    }


}
