package refleksja;

public class Main {
    public static void main(String[] args)  {
        Example example = new Example();

        try {
            DependencyInjector.injectDependencies(example);
        } catch (IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }
}
