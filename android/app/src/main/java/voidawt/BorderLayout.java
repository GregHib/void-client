package voidawt;

public class BorderLayout implements LayoutManager {
    public static final String CENTER = "Center";
    public static final String NORTH = "North";
    public static final String SOUTH = "South";
    public static final String EAST = "East";
    public static final String WEST = "West";

    public BorderLayout() {
    }

    public void addLayoutComponent(String name, Component comp) {
    }

    public void removeLayoutComponent(Component comp) {
    }

    public Dimension preferredLayoutSize(Container parent) {
        return parent.getSize();
    }

    public Dimension minimumLayoutSize(Container parent) {
        return parent.getSize();
    }

    public void layoutContainer(Container parent) {
    }
}
