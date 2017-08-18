/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.openmos.msb.cloud.cloudinterface.testdata;

// import eu.openmos.agentcloud.data.recipe.Recipe;
import eu.openmos.model.Recipe;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author valerio.gentile
 */
public class RecipeTest
{

  public static Recipe getTestObject()
  {
    Date registeredTimestamp = new Date();

    /*
     * @param description - Recipe's description.
     * @param uniqueId - Recipe's ID.
     * @param kpisSetting - Recipe's KPI Settings. These must match the skill's 
     * KPIs.
     * @param name - Recipe's name.
     * @param parameterSettings - Recipe's parameter settings. These must match 
     * the skill's parameters.
     * @param uniqueAgentName - The agent capable of executing this recipe.
     * @param skillRequirements - The skills necessary to execute this recipe.
     * @param skills
     * @param equipment
     * @param registeredTimestamp        
     */
    Recipe recipe = new Recipe(
            "description",
            "uniqueId",
            KPISettingTest.getTestList(),
            "name",
            ParameterSettingTest.getTestList(),
            "uniqueAgentName",
            SkillRequirementTest.getTestList(),
            SkillTest.getTestObjectWithoutRecipes(),
            EquipmentTest.getTestObject("TO FIX", -1),
            "recipeMSBProtocolEndpoint",
            true,
            registeredTimestamp);

    return recipe;
  }

  public static List<Recipe> getTestList()
  {
    return new LinkedList<>(Arrays.asList(getTestObject()));
  }
}
