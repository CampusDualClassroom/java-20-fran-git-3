package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;

public class Exercise20 {

    // Método que crea y devuelve una lista de objetos de tipo Person
    public static List<Person> getPeopleList() {
        List<Person> peopleList = new ArrayList<>();
        // Agregar los diferentes objetos a la lista
        peopleList.add(new Person("John", "Smith"));
        peopleList.add(new Teacher("María", "Montessori", "Educación"));
        peopleList.add(new PoliceOfficer("Jake", "Peralta", "B-99"));
        peopleList.add(new Doctor("Gregory", "House", "Nefrología e infectología"));
        return peopleList;
    }

    // Método que recorre la lista y muestra los detalles de cada persona
    public static void showPeopleDetails(List<Person> peopleList) {
        for (Person person : peopleList) {
            person.getDetails();  // Llamada directa a getDetails
        }
    }

    public static void main(String[] args) {
        // Obtener la lista de personas y mostrar sus detalles
        List<Person> peopleList = getPeopleList();
        showPeopleDetails(peopleList);
    }
}
