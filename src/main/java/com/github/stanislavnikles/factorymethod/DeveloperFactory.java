package com.github.stanislavnikles.factorymethod;

import com.github.stanislavnikles.factorymethod.developers.Developer;
import com.github.stanislavnikles.factorymethod.developers.JuniorDeveloper;
import com.github.stanislavnikles.factorymethod.developers.MiddleDeveloper;
import com.github.stanislavnikles.factorymethod.developers.SeniorDeveloper;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {

    private static DeveloperFactory instance = null;
    private Map<String, Developer> developers;

    private DeveloperFactory(Map<String, Developer> developers){
        this.developers = developers;
    }

    public static synchronized DeveloperFactory getInstance() {
        if (instance == null) {
            Map<String, Developer> data = new HashMap<String, Developer>();
            data.put("Junior", new JuniorDeveloper());
            data.put("Middle", new MiddleDeveloper());
            data.put("Senior", new SeniorDeveloper());

            instance = new DeveloperFactory(data);
        }
        return instance;
    }

    public Developer getDeveloper(String rank) {
        return this.developers.get(rank);
    }
}
