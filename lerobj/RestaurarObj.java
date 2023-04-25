package lerobj;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * RestaurarObj
 */
public class RestaurarObj {

    public static Object restaurar(String caminho) {
        Object objeto = null;

        try {
            FileInputStream restFile = new FileInputStream(caminho);
            ObjectInputStream stream = new ObjectInputStream(restFile);

            objeto = stream.readObject();

            stream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return objeto;
    }
}