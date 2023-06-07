package refleksja;
import java.lang.reflect.*;

public class DependencyInjector {
    public static void injectDependencies(Object object) throws InstantiationException, IllegalAccessException {
        Class<?> myClass = object.getClass();

        Field[] fields = myClass.getDeclaredFields();

        for (Field field : fields) {
            Class<?> fieldType = field.getType();

            Object dependency = fieldType.newInstance();

            field.setAccessible(true);
            field.set(object, dependency);
        }
    }
}
