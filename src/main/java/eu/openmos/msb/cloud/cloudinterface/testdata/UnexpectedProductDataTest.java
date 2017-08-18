/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.openmos.msb.cloud.cloudinterface.testdata;

import eu.openmos.agentcloud.data.RawEquipmentData;
import eu.openmos.agentcloud.data.UnexpectedProductData;
import java.util.Date;

/**
 *
 * @author valerio.gentile
 */
public class UnexpectedProductDataTest
{

  public static UnexpectedProductData getTestObject()
  {
    Date now = new Date();

    return new UnexpectedProductData(
            "workstation1_" + now,
            "expectedProductId100_" + now,
            "receiveddProductId100_" + now,
            new Date());
  }

}
