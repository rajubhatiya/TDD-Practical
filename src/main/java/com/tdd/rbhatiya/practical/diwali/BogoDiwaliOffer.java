package com.tdd.rbhatiya.practical.diwali;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * The Big Diwali Sale:
 * The Diwali sale is approaching. The marketing team has decided to run a campaign called “BOGO” - Buy one Get one Free. Customers can buy any number of products.
 *
 * Offer Rules: Customers can buy one product and get another product for free as long as the price of the product is equal to or less than the price of the first product.
 *
 * Customer Objective: Discount maximization for Customers. The customer’s objective is to create a pair of 2 items so that the discount is maximiz
 * Example1:
 * Input:
 * Product Price List = [ 10,20,30,40,50,60 ]
 * Output:
 * Discounted Items = [50,30,10]
 * Payable Items = [60,40,20]
 *
 * Example 2:
 * Input:
 * Product Price List = [ 10,20,30,40,50,50,60 ]
 * Output:
 * Discounted Items = [50,40,20]
 * Payable Items = [60,50, 30,10]
 *
 * --------------
 *
 * Offer Rule 2:  Customers can buy one product and get another product for free as long as the price of the product is less than the price of the corresponding product in pairs.
 * Example 1 :
 * Input:
 * Product Price List = [ 10,20,30,40,40,50,60,60 ]
 * Output:
 * Discounted Items = [50,40,30,10]
 * Payable Items = [60,60,40, 20]
 *
 * Example 2:
 * Input:
 * Product Price List = [ 10,20,30,40,50,50,50,60 ]
 * Output:
 * Discounted Items = [50,40,30,10]
 * Payable Items = [60,50,50,,20]
 * Offer Rule 3:  Customers can buy two products and get two products for free as long as the price of the product is less than the price of the first product.
 *
 * Example1:
 * Input:
 * Product Price List = [ 10,20,30,40,40,50,60,60 ]
 * Output:
 * Discounted Items = [50,40,30,10]
 * Payable Items = [60,60,40, 20]
 *
 * Example1:
 * Input:
 * Product Price List = [ 5,5,10,20,30,40,50,50,50,60 ]
 * Output:
 * Discounted Items = [50,40,30,10]
 * Payable Items = [60,50,50,,20,5,5]
 * Amit Satpathy
 * 5:50 PM
 * Offer Rule 2:  Customers can buy one product and get another product for free as long as the price of the product is less than the price of the corresponding product in pairs.
 *
 * Example 1 :
 * Input:
 * Product Price List = [ 10,20,30,40,40,50,60,60 ]
 * Output:
 * Discounted Items = [50,40,30,10]
 * Payable Items = [60,60,40, 20]
 * Offer Rule 3:  Customers can buy two products and get two products for free as long as the price of the product is less than the price of the first product.
 *
 * Example1:
 * Input:
 * Product Price List = [ 10,20,30,40,40,50,60,60 ]
 * Output:
 * Discounted Items = [50,40,30,10]
 * Payable Items = [60,60,40, 20]
 *
 * Example1:
 * Input:
 * Product Price List = [ 5,5,10,20,30,40,50,50,50,60 ]
 * Output:
 * Discounted Items = [50,40,30,10]
 * Payable Items = [60,50,50,,20,5,5]
 * dch-hzxw-grk
 *
 *
 * product = 10 + 20+30;
 * discout = product*2
 */
public class BogoDiwaliOffer {
    public static void main(String[] args) {
        bogoDiwaliSaleOffer();
    }

    /**
     * The Big Diwali Sale:
     * The Diwali sale is approaching. The marketing team has decided to run a campaign called “BOGO”
     * - Buy one Get one Free. Customers can buy any number of products.
     * <p>
     * Offer Rules: Customers can buy one product and get another product for free as long as
     * the price of the product is equal to or less than the price of the first product.
     * <p>
     * Customer Objective: Discount maximization for Customers.
     * The customer’s objective is to create a pair of 2 items so that the discount is maximiz
     * <p>
     * Example1:
     * Input:
     * Product Price List = [ 10,20,30,40,50,60 ]
     * Output:
     * Discounted Items = [50,30,10]
     * Payable Items = [60,40,20]
     */
    public static void bogoDiwaliSaleOffer() {
        ArrayList<Integer> productPriceList = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60));
        ArrayList<Integer> discountedItems = new ArrayList<>(Arrays.asList(50, 30, 10));
        ArrayList<Integer> payableItems = new ArrayList<>(Arrays.asList(60, 40, 20));
        int discountedPrice = 0;
        int payablePrice = 0;

        for (int i = 0; i < productPriceList.size(); i++) {

            payablePrice += productPriceList.get(i);
            if (discountedPrice <= productPriceList.get(i)) {
                discountedPrice += productPriceList.get(i);
            }
            System.out.println("Discounted Price: " + discountedPrice);
            System.out.println("Payable Price: " + payablePrice);
            System.out.println("Discounted Items: " + discountedItems);
            System.out.println("Payable Items: " + payableItems);
            System.out.println("=================================");
            System.out.println("=================================");
        }

    }
}
