/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thedevbridge.stockweb.dao;

/**
 *
 * @author ferry
 */
public class Parameters {
   public static String IPHOST = "localhost";
    public static int PORT = 5432;
    public static String HOST_DB = "jdbc:postgresql://" + IPHOST + ":"+PORT+"/Stock";
    public static String USERNAME_DB = "postgres";
    public static String PASSWORD_DB = "bebekiki9";
    public static String USER = "postgres"; 
}
