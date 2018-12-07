package com.blomqui.matthew.testconstraint;

import java.util.List;

public class UserPreferences {

    List<String> userPreferences;

    UserPreferences(List<String> userPreferences) {
        // set the user preferences in the default constructor
        this.userPreferences = userPreferences;
    }

    public List<String> getUserPreferences() { return userPreferences; }

    public void setUserPreferences(List<String> userPreferences) { this.userPreferences = userPreferences; }
}

