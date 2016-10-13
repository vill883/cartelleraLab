package com.tecnocampus.useCases;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

import com.tecnocampus.dabaBaseRepository.*;
import com.tecnocampus.domain.Usuari;
/**
 * Created by vil883 on 13/10/2016.
 */


@Component
public class UserUseCases {
    private UsuariRepository usuariRepository;
    private CinemaRepository cinemaRepository;

    public UserUseCases(UsuariRepository usuariRepository, CinemaRepository cinemaRepository) {
        this.usuariRepository = usuariRepository;
        this.cinemaRepository = cinemaRepository;
    }

    public Usuari createUser( String DNI, String titol, String cognom, String telefon, String idUsuari, String password) {
        Usuari usuari = new Usuari( DNI,  titol,  cognom,  telefon,  idUsuari,  password);
        try {
            usuariRepository.save (usuari);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return usuari;
    }

   /* public NoteLab createUserNote(UserLab userLab, String title, String contents) {
        return null;
    }

    public NoteLab updateNote(NoteLab note, String title, String contents) {
        note.setTitle(title);
        note.setContent(contents);
        note.setDateEdit(LocalDateTime.now());
        noteLabRepository.updateNote(note);
        return note;
    }*/
}
