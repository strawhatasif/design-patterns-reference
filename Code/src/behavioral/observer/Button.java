package behavioral.observer;


public class Button {

    private InputText inputText;

    private List list;


    public void clicked()
    {

        list.setListValue(1);
        inputText.setText("the button has been clicked!!!");

    }

    public void setInputText(InputText inputText)
    {
        this.inputText = inputText;
    }

    public void setList(List list)
    {
        this.list = list;
    }
}
