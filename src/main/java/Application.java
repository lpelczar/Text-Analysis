public class Application {

    public static void main(String... args) {

        RootView rootView = new RootView();
        RootController rootController = new RootController(args, rootView);
        rootController.start();
    }
}
