
package rvt;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;

import rvt.temp.A;
import rvt.temp.B;
import rvt.temp.C;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class DefaultController {
   
  
    @GetMapping(value = "/test ")
    @ResponseBody
    public String testAction() {
        ArrayList<Person> persons = new ArrayList<Person>();

            persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
            persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

            return printPersons(persons);
        // A a = new A();
        // B b = new B();
        // C c = new C();

        // a.a();
        // b.b();
        // c.c();

        // return a;
        // return b;
        // return c;
    }

    private static String printPersons(ArrayList<Person> persons) {
        String output = "";
        for (persons : person) {
            output += person.toString() + "<br>";
        }
    }

}
    

    // @GetMapping(value = "/test")
    // public ModelAndView testAction() {
    //     ModelAndView modelAndView = new ModelAndView("test");

    //     Money macins1 = new Money(5, 5);
    //     Money macins2 = new Money(5);
    //     Money macins3 = new Money();
    
    //     Money macins4 = macins1.plus(macins2);
    //     Money macins5 = macins1.minus(macins2);
    
    //     Money mon1 = new Money(5);
    //     Money mon2 = new Money(6);

    //     modelAndView.addObject("macins1", macins1);

    //     return modelAndView;
    // }


