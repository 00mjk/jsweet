package def.dom;

import def.js.Object;

public class MSGesture extends def.js.Object {
    public Element target;
    native public void addPointer(double pointerId);
    native public void stop();
    public static MSGesture prototype;
    public MSGesture(){}
}

