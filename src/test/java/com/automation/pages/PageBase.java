package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class PageBase {
    protected WebDriver driver;
    public Select select;

    public PageBase(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public LoginPage loginpage(){
        return new LoginPage(driver);
    }

    public Registration registrationPage(){
        return new Registration(driver);
    }

    public MyAccount myAccountPage(){
        return new MyAccount(driver);
    }

    public Search searchPage(){
        return new Search(driver);
    }

    public Wishlist wishlistPage(){ return new Wishlist(driver); }

    public FilterWithColor filterWithColorPage(){ return new FilterWithColor(driver); }

    public Categories categoriesPage(){ return new Categories(driver); }

    public Currencies currenciesPage(){ return new Currencies(driver); }

    public TagsPage tagsPage(){ return new TagsPage(driver); }

    public CompareList compareListPage(){ return new CompareList(driver); }

    public Cart cartPage(){ return new Cart(driver); }

    public Order orderPage(){ return new Order(driver); }

}
