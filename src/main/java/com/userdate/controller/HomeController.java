package com.userdate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.sql.*;
import java.util.ArrayList;

@Controller
public class HomeController {



    @RequestMapping(value = "/")
    public ModelAndView helloWorld() {
        // defined the data for the connection
        //address of the database
        String dbAddress = "jdbc:mysql://localhost:3306/CoffeeShopDB";
        //user name
        String username = "root";
        //password
        String password = "Createordie!1991";

        //load the driver, needs to be wrapped in try catch so that program doesn't crash:
        try {
            //dynamic:
            Class.forName("com.mysql.jdbc.Driver");

            //static load: (commented out for now)
            //DriverManager.registerDriver(new com.mysql.jdbc.Driver());

            //create the db connection object
            Connection mysqlConnection;
            mysqlConnection = DriverManager.getConnection(dbAddress, username, password);

            //create the db statement
            String readCustomersCommand = "select name,description,quantity, price from items";

            Statement readCustomers = mysqlConnection.createStatement(); // creates the statement

            ResultSet results = readCustomers.executeQuery(readCustomersCommand);
            //executes the statement / query to get the data from the database, stores in ResultSet called results

            //array list of customers
            ArrayList<Item> inventory = new ArrayList<Item>();

            //map from the ResultSet to the ArrayList, one row at a time, using results.next()

            while(results.next()) {
                //loops to make sure there is a next row in results
                //depends on type of data you are trying to fetch
                Item temp = new Item(results.getString(1),
                        results.getString(2), results.getInt(3), results.getFloat(4));
                //adds temporary customer object to inventory
                inventory.add(temp);
            }

            return new ModelAndView("welcome", "cList", inventory);


        } catch (Exception e)

        {
            e.printStackTrace();
        }
        // todo: create an error page with custom error messages !!!!
        return null;
    }

    @RequestMapping("/register")
    public ModelAndView register () {
        return new ModelAndView("register", "inst",
                "Please enter info: ");
    }

    //action that gets called>
    @RequestMapping("/formhandler")
    public ModelAndView formhandler(
            @RequestParam("firstname") String firstname,
            @RequestParam("lastname") String lastname,
            @RequestParam("email") String email,
            @RequestParam("phonenumber") String phonenumber,
            @RequestParam("password") String password)

    {
        ModelAndView mv = new ModelAndView("adduser");
        mv.addObject("firstname", firstname);
        mv.addObject("lastname", lastname);
        mv.addObject("email", email);
        mv.addObject("phonenumber", phonenumber);
        mv.addObject("password", password);

        return mv;
    }





}