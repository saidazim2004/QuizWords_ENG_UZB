package uz.g20.server.database;

import uz.g20.server.model.Question;
import uz.g20.server.model.UzbWords;

import java.util.ArrayList;
import java.util.List;

public interface Database {
   List<Question> ENG = new ArrayList<>();
   List<UzbWords> UZB = new ArrayList<>();
}
