package lesson13.outside;

import lesson13.Parent;

public class ChildDiffPackage extends Parent {
    @Override
    protected void setName(String name) {
        super.setName(name);
    }
}
