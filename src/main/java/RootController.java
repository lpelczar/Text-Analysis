public class RootController {

    private String[] consoleArgs;
    private RootView rootView;

    public RootController (String[] consoleArgs, RootView rootView) {
        this.consoleArgs = consoleArgs;
        this.rootView = rootView;
    }

    public void start() {
        if (this.consoleArgs.length == 0) {
            rootView.displayNoFileProvidedMessage();
            return;
        }

        for (String arg : this.consoleArgs) {
            IterableText iterableText = new FileContent(arg);
            StatisticalAnalysis charAnalysis = new StatisticalAnalysis(iterableText.charIterator());
        }
    }
}
