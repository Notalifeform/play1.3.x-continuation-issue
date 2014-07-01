package controllers;

import play.*;
import play.jobs.Job;
import play.libs.F.Promise;
import play.libs.WS;
import play.libs.WS.HttpResponse;
import play.libs.WS.WSRequest;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        
	try {
	    Promise<String> p =new Job<String>(){}.now();
	    await(p);
	    throwIt();
        } catch (TestException e) {
            e.printStackTrace();
        }
         
        render();
    }

    private static void throwIt() throws TestException {
	throw new TestException();
    }

}