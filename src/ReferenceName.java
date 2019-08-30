import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReferenceName {

    private static String getReferenceNameFromSQL(String sqlQuery) {
        return sqlQuery.substring(sqlQuery.lastIndexOf("value")).trim();
    }

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        List<String> list = new ArrayList<>();

        list.add("select dia as rid, cipher as value, name from adm_glb.dia_10");

        list.add("select dia as rid, cipher as value, name from adm_glb.dia_10");


        for (String str : list) {
            set.add(getReferenceNameFromSQL(str));
        }


       set.forEach(System.out::println);
    }

}
