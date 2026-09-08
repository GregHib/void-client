/**
 * One-shot CLI demo for the local scene editor core (no renderer / no game UI).
 * Run: JAVA_HOME=... ./gradlew :client:compileJava &&
 *      $JAVA_HOME/bin/java -cp client/build/classes/java/main SceneEditorDemo
 */
public final class SceneEditorDemo {
    public static void main(String[] args) throws Exception {
        SceneEditor editor = new SceneEditor(new SceneStore());
        editor.setMode(SceneEditor.Mode.EDITOR);

        String[] steps = {
            "add 1276 3200 3200 0 0",
            "add 1278 3205 3200 0 0",
            "move 1 3210 3201 0",
            "rotate 1 2",
            "undo",
            "redo",
            "save demo"
        };

        System.out.println("=== SceneEditor demo (local-only, no game render) ===");
        for (String step : steps) {
            System.out.println("> " + step);
            System.out.println("  " + editor.command(step));
        }

        System.out.println();
        System.out.println("dirty=" + editor.isDirty() + " mode=" + editor.mode()
                + " objects=" + editor.scene().objects().size());
        System.out.println();
        System.out.println(SceneStore.toJson(editor.scene()));
        System.out.println();
        System.out.println("saved -> " + new SceneStore().file("demo").getAbsolutePath());
    }
}
