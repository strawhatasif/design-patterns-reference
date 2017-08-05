package behavioral.chainofresponsibility.improved;

public class CustomerInfoCheckoutHandler extends CheckoutHandler
{
    @Override
    public void handleCheckout()
    {
        System.out.println("Adding extra info to checkout of the customer");

        if(nextHandler != null)
        {
            nextHandler.handleCheckout();
        }
    }
}
