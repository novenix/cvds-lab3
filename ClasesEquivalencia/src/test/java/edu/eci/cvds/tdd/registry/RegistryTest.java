package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {

    private Registry registry = new Registry();

    @Test
    public void validateRegistryResult() {
        //String name, int id, int age, Gender gender, boolean alive
        Person person = new Person();
        person.setAge(20);
        person.setAlive(true);
        person.setId(123);
        
        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.VALID, result);
    }

     @Test
    public void validateRegistryUnderAge() {

        Person person = new Person();
        person.setAge(17);
        person.setAlive(true);
        person.setId(123);
        
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }
    @Test
    public void validateRegistryInvalidAge() {

        Person person = new Person();
        person.setAge(-1);
        person.setAlive(true);
        person.setId(123);
        
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }
    @Test
    public void validateRegistryDead() {

        Person person = new Person();
        person.setAge(20);
        person.setAlive(false);
        person.setId(123);
        
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.DEAD, result);
    }

    // TODO Complete with more test cases
    @Test
    public void validateRegistryDuplication() {

        Person person = new Person();
        person.setAge(20);
        person.setAlive(true);
        person.setId(123);
        
        RegisterResult result = registry.registerVoter(person);
        RegisterResult result2 = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.DUPLICATED, result2);
    }
    
}