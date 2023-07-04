package epam.content.management.service;


import epam.content.management.service.generators.Generators;
import epam.content.management.utilites.BreakWord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SenetenceGenerator implements Generators {


    @Autowired
    private BreakWord breakWord;

    @Override
    public List<String > generateSenetence(String  word) {
       return breakWord.breakWord(word);
    }

}
