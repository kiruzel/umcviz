package controllers;

import play.*;
import play.mvc.*;

import java.util.*;



public class Application extends Controller {

    public static void index() {
        render();
    }
    
    public static void project(){
         render("@Application.project");
    }
    public static void dashboard(){
         render("@Application.dashboard");
    }
     public static void people(){
         render("@Application.people");
    }
     
     public static void real(){
         render("@Application.dashboard_realtime");
    }
}