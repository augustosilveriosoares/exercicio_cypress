import java.lang.annotation.Annotation;

public class Main {

    public static void main (String args[]){

        Objeto obj = new Objeto();

        if(obj.getClass().isAnnotationPresent(AnnotationTable.class)){
            AnnotationTable ano = obj.getClass().getAnnotation(AnnotationTable.class);
            System.out.println(ano.getClass().getName());
            System.out.println(ano.tableName());
        }



    }
}
