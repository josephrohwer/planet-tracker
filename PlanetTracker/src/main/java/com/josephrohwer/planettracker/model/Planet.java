/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.josephrohwer.planettracker.model;

import java.util.Objects;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author joseph.rohwer
 */
public class Planet {

    private long planetId;
    @NotEmpty(message = "You must supply a value for Name.")
    @Length(max = 50, message = "Name must be no more than 50 characters in length.")
    private String name;
    @NotEmpty(message = "You must supply a value for Average Temp.")
    @Min(-459)
    @Max(10000)
    private String avgTemp;
    @NotEmpty(message = "You must supply a value for Radiation Level.")
    @Min(0)
    @Max(10000)
    private String radLevel;
    @NotEmpty(message = "You must supply a value for Planet Type.")
    @Length(max = 50, message = "Planet Type must be no more than 50 characters in length.")
    private String planetType;
    @NotEmpty(message = "You must supply a value for Life Type.")
    @Length(max = 50, message = "Life Type must be no more than 50 characters in length.")
    private String lifeType;

    public long getPlanetId() {
        return planetId;
    }

    public void setPlanetId(long planetId) {
        this.planetId = planetId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvgTemp() {
        return avgTemp;
    }

    public void setAvgTemp(String avgTemp) {
        this.avgTemp = avgTemp;
    }

    public String getRadLevel() {
        return radLevel;
    }

    public void setRadLevel(String radLevel) {
        this.radLevel = radLevel;
    }

    public String getPlanetType() {
        return planetType;
    }

    public void setPlanetType(String planetType) {
        this.planetType = planetType;
    }

    public String getLifeType() {
        return lifeType;
    }

    public void setLifeType(String lifeType) {
        this.lifeType = lifeType;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (int) (this.planetId ^ (this.planetId >>> 32));
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.avgTemp);
        hash = 97 * hash + Objects.hashCode(this.radLevel);
        hash = 97 * hash + Objects.hashCode(this.planetType);
        hash = 97 * hash + Objects.hashCode(this.lifeType);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Planet other = (Planet) obj;
        if (this.planetId != other.planetId) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.avgTemp, other.avgTemp)) {
            return false;
        }
        if (!Objects.equals(this.radLevel, other.radLevel)) {
            return false;
        }
        if (!Objects.equals(this.planetType, other.planetType)) {
            return false;
        }
        if (!Objects.equals(this.lifeType, other.lifeType)) {
            return false;
        }
        return true;
    }
}