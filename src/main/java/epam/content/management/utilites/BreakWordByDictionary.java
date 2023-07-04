package epam.content.management.utilites;

import epam.content.management.entity.Dictionary;
import epam.content.management.repository.DictionaryRepository;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class BreakWordByDictionary implements BreakWord{

    @Autowired
    private DictionaryRepository dictionaryRepository;

    @Override
    public List<String> breakWord(String word) {
        Set<String> dictionary = new HashSet<>();

        //List<Dictionary> dic = dictionaryRepository.findById();

        /***
         * will implement updated approach by dp
         */
    }
}
