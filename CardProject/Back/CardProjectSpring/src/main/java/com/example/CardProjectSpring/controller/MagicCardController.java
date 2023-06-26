package com.example.CardProjectSpring.controller;

import com.example.CardProjectSpring.entity.FleshAndBloodCard;
import com.example.CardProjectSpring.entity.MagicCard;
import com.example.CardProjectSpring.service.MagicCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
public class MagicCardController {

    @Autowired
    private MagicCardService magicCardService;

    @GetMapping("/findAllMagicCard")
    public List<MagicCard> findMagicCardList() {
        return magicCardService.findMagicCardList();
    }

    @GetMapping("/findMagicCard/{idMagicCard}")
    public ResponseEntity<Map<String, MagicCard>> findMagicCardById(@PathVariable int idMagicCard) {
        Map<String, MagicCard> hashMap = new HashMap<String, MagicCard>();
        try {
            hashMap.put("Carte de magic trouvée", magicCardService.findMagicCardById(idMagicCard));
        } catch (Exception e) {
            hashMap.put("Erreur à cause de " + e.getMessage(), null);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(hashMap);
        }
        return ResponseEntity.ok(hashMap);
    }


    @PostMapping("/createMagicCard")
    public ResponseEntity<Map<String, MagicCard>> createMagicCard(@RequestBody MagicCard magicCard) {
        Map<String, MagicCard> hashMap = new HashMap<String, MagicCard>();
        try {
            hashMap.put("Carte ajoutée", magicCardService.saveMagicCard(magicCard));
        } catch (Exception e) {
            hashMap.put("Erreur à cause de " + e.getMessage(), null);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(hashMap);
        }
        return ResponseEntity.ok(hashMap);
    }

    @PutMapping("/updateMagicCard/{idMagicCard}")
    public ResponseEntity<Map<String, MagicCard>> updateMagicCard(@PathVariable("idMagicCard") int idMagicCard,
                                                                                     @RequestBody MagicCard magicCard) {
        Map<String, MagicCard> hashMap = new HashMap<String, MagicCard>();
        try {
            hashMap.put("Mise à jour de la carte", magicCardService.updateMagicCard(magicCard, idMagicCard));
        } catch (Exception e) {
            hashMap.put("Erreur à cause de " + e.getMessage(), null);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(hashMap);
        }
        return ResponseEntity.ok(hashMap);
    }


    @DeleteMapping("/deleteMagicCard/{idMagicCard}")
    public ResponseEntity<String> deleteMagicCard(@PathVariable("idMagicCard") int idMagicCard){
        try{
            magicCardService.deleteMagicCardById(idMagicCard);
            Map<String, Boolean> response = new HashMap<>();
            response.put("deleted", Boolean.TRUE);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An exception has occured due to " + e.getMessage());
        }
        return ResponseEntity.ok("Carte magic supprimée");
    }

}

