package voidawt;

import java.util.ArrayList;
import java.util.List;

/** AWT {@code Container} stub: child list + optional {@link LayoutManager}. */
public class Container extends Component {
    private final List<Component> children = new ArrayList<Component>();
    private LayoutManager layout;

    public void setLayout(LayoutManager layout) {
        this.layout = layout;
    }

    public LayoutManager getLayout() {
        return layout;
    }

    public Component add(Component comp) {
        if (comp == null) {
            return null;
        }
        if (comp.parent != null) {
            comp.parent.remove(comp);
        }
        children.add(comp);
        comp.parent = this;
        if (comp instanceof Canvas) {
            AwtHost.onGameCanvas((Canvas) comp);
        }
        return comp;
    }

    public void add(Component comp, Object constraints) {
        add(comp);
    }

    public void remove(Component comp) {
        if (comp == null) {
            return;
        }
        children.remove(comp);
        if (comp.parent == this) {
            comp.parent = null;
        }
    }

    public int getComponentCount() {
        return children.size();
    }

    public Component[] getComponents() {
        return children.toArray(new Component[0]);
    }
}
