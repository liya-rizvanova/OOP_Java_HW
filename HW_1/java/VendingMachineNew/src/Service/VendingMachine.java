package Service;

import Domain.Product;

import java.util.List;

public class VendingMachine {
    private Holder holder;
    private CoinDispencer coinDispencer;
    private Display display;
    private List<Product> listProduct;

    public VendingMachine(Holder holder, CoinDispencer coinDispencer, Display display, List<Product> listProduct) {
        this.holder = holder;
        this.coinDispencer = coinDispencer;
        this.display = display;
        this.listProduct = listProduct;
    }

    public Holder getHolder() {
        return holder;
    }

    public CoinDispencer getCoinDispencer() {
        return coinDispencer;
    }

    public Display getDisplay() {
        return display;
    }

    public List<Product> getListProduct() {
        return listProduct;
    }
}
