package services;

import Model.Question;

import java.util.ArrayList;
import java.util.List;

public interface GeneralService<T> {
    List<T> findAll();

    public void create(T t);

    public void delete(int id);

    public void update(int Id, T t);

    T findByID(int id);

    void display();

    void addPoint();

}


