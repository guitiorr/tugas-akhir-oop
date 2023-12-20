import java.util.List;
import java.util.ArrayList;

public class searchdata {

    public <T extends FF> ArrayList<T> searchNamaLokal(String namaLokal, ArrayList<T> dataList) {
        ArrayList<T> result = new ArrayList<T>();
        for (int i = 0; i < dataList.size(); i++) {
            if (dataList.get(i).getNamaLokal().equalsIgnoreCase(namaLokal)) {
                result.add(dataList.get(i));
            }
        }        
        if (result.isEmpty()) {
            return null;
        } else {
            return result;
        }
    }
    
    public <T extends FF> ArrayList<T> searchNamaIlmiah(String namaIlmiah, ArrayList<T> dataList) {
        ArrayList<T> result = new ArrayList<T>();
        for (int i = 0; i < dataList.size(); i++) {
            if (dataList.get(i).getNamaIlmiah().equalsIgnoreCase(namaIlmiah)) {
                result.add(dataList.get(i));
            }
        }
        if (result.isEmpty()) {
            return null;
        } else {
            return result;
        }
    }

    public <T extends FF> ArrayList<T> searchFamili(String family, List<T> dataList) {
        ArrayList<T> result = new ArrayList<T>();
        for (int i = 0; i < dataList.size(); i++) {
            if (dataList.get(i).getFamili().equalsIgnoreCase(family)) {
                result.add(dataList.get(i));
            }
        }
        if (result.isEmpty()) {
            return null;
        } else {
            return result;
        }
    }
    
}
