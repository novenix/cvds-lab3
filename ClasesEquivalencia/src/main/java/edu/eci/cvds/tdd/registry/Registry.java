package edu.eci.cvds.tdd.registry;
import java.util.ArrayList;
public class Registry {
    private ArrayList<Integer> listPersonsVoted;
    public Registry () {
         listPersonsVoted = new ArrayList<Integer>();
    }
    public RegisterResult registerVoter(Person p) {
        //No usamos genero por que genero indefinido
        //no deberia ser algo invalido para votar
        //somos incluyentes(y tampoco hay nada en el enum)
        // TODO Validate person and return real result.
        //DEAD, UNDERAGE, INVALID_AGE, VALID, DUPLICATED
        Person persona = p;
        
        boolean live = persona.isAlive();
        int age = persona.getAge();
        int  idPerson = persona.getId();
        if (!live) {
            return RegisterResult.DEAD;
        }
        else if (listPersonsVoted.contains(idPerson)) {
            return RegisterResult.DUPLICATED;
        }
        else if (age < 18 && age > 0) {
            return RegisterResult.UNDERAGE;
        }
        else if (age < 0) {
            return RegisterResult.INVALID_AGE;
        }
        else {
            listPersonsVoted.add(idPerson);
            return RegisterResult.VALID;
        }
        
    }
}