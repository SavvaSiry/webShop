package com.example.webshop.entity;

public class View {
    public interface Image {}
    public interface Size {}
    public interface Description {}
    public interface Product extends Image, Size, Description {}
}
