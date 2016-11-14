/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordsearcher.bll;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import wordsearcher.dal.WordDAO;

/**
 *
 * @author pgn
 */
public class WordManager {

    private WordDAO wordDAO;

    /**
     * Constructs a wordManager object.
     */
    public WordManager() {
        wordDAO = new WordDAO();
        
    }

    /**
     * Gets all the searchable words.
     * @return List of all words;
     */
    public List<String> getAllWords() throws FileNotFoundException {
        List<String> allWords = wordDAO.getAllWords();
        return allWords;
    }

    public List<String> beginSearch(String query) {
        //TODO Try to do this.
        return null;
    }

}
