package OCP;

import java.math.BigDecimal;

/*
* Closed for modification : New features getting added to the software component, should not have to modify existing code
* Open for Extension : A sofware component should be extendable to add new features or new modules to it.
* 1. Ease of adding new features, aim for cost saving and more quality.
* 2. Leads to minimal cost of developing and testing sofware.
* 3.
* */
public class OCPProblem {

    public int calculatePremium(CustomerProfile customer) {
        var discount = customer.isLoyalCustomer()? 1000 : 0;
        return 8000 - discount;
    }
}
