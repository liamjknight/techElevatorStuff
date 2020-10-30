package com.techelevator.controller;

import com.techelevator.model.CatCard;
import com.techelevator.model.CatCardDAO;
import com.techelevator.model.CatFact;
import com.techelevator.model.CatPic;
import com.techelevator.services.CatFactService;
import com.techelevator.services.CatPicService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class CatController {

    private CatCardDAO catCardDao;
    private CatFactService catFactService;
    private CatPicService catPicService;

    public CatController(CatCardDAO catCardDao, CatFactService catFactService, CatPicService catPicService) {
        this.catCardDao = catCardDao;
        this.catFactService = catFactService;
        this.catPicService = catPicService;
    }

    @RequestMapping(path=".api/cards", method=RequestMethod.GET)
    public List<CatCard> getUserCollegtion(){
    	return catCardDao.list();
    }
    
    @RequestMapping(path="/api/cards/{id}", method=RequestMethod.GET)
    public CatCard getByID(@PathVariable int id) {
    	return catCardDao.get(id);
    }
    
    @RequestMapping(path="api/cards/random", method=RequestMethod.GET)
    public CatCard getNew() {
    	CatCard newCard = new CatCard();
    	newCard.setCatFact(catFactService.getFact().getText());
    	newCard.setImgUrl(catPicService.getPic().getFile());
    	newCard.setCaption("");
    	return newCard;
    }
    
    @RequestMapping(path="api/cards", method=RequestMethod.POST)
    public CatCard saveCard(@RequestBody CatCard cardToSave) {
    	catCardDao.save(cardToSave);
    	return cardToSave;
    }
    
    @RequestMapping(path="api/cards", method=RequestMethod.PUT)
    public CatCard updateCard(@RequestBody CatCard cardToUpdate) {
    	catCardDao.update(cardToUpdate.getCatCardId(), cardToUpdate);
    	return cardToUpdate;
    }
    
    
    @RequestMapping(path="api/cards", method=RequestMethod.DELETE)
    public void deleteFromCollection(@RequestBody CatCard cardToDelete) {
    	catCardDao.delete(cardToDelete.getCatCardId());
    }
}
