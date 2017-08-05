package behavioral.observer.improved;


public class InputText implements Observer {

    public void setText(String text)
    {
        System.out.println("InputText set text: " + text);
    }


    @Override
    public void update()
    {
        this.setText("the button has been clicked!!!");
    }
}
