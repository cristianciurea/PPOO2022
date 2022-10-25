package ro.ase.course7.callback;

//Step 1: Create an interface for the callback method
interface ClickEventHandler {
    void handleClick();
}

//Step 2: Create a callback handler
//implementing the above interface
class ClickHandler implements ClickEventHandler {
    public void handleClick() {
        System.out.println("Clicked");
    }
}

//Step 3: Create event generator class
class Button {
    public void onClick(ClickEventHandler clickHandler) {
        clickHandler.handleClick();
    }
}

public class Tester {
    public static void main(String[] args) {
        Button button = new Button();
        ClickHandler clickHandler = new ClickHandler();
        //pass the clickHandler to do the default operation
        button.onClick(clickHandler);

        Button button1 = new Button();
        //pass the interface to implement own operation
        button1.onClick(new ClickEventHandler() {
            @Override
            public void handleClick() {
                System.out.println("Button Clicked");
            }
        });
    }
}
