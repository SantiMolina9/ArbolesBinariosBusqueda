package arbolbinariodebusqueda;

import java.util.Comparator;

public class ComparaEnteros implements Comparator {
     @Override
     public int compare(Object o1, Object o2) {
      return ((Integer) o1).intValue() - ((Integer) o2).intValue();
    }
}
