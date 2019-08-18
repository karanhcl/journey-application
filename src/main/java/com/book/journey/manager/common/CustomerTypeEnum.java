package com.book.journey.manager.common;

/**
* This class is use to get status for customer type.
*
* @author karansingh
* @version $Revision: 0.1 $
*/
public enum CustomerTypeEnum {

  /**
   * VIP status.
   */
  VIP("VIP"),

  /**
   * Normal status.
   */
   NORMAL("Normal"),
  
  /**
   * Person non grata status.
   */
  PERSONA_NON_GRATA("Persona Non Grata");

  /**
   * Status label.
   */
  private String label;


  /**
   * Private Constructor.
   * @param label the label.
   * @param order the order of status.
   */
  private CustomerTypeEnum(final String label){
      this.label = label;
  }
  /**
   * @return the lebel
   */
  public String getLabel() {
      return label;
  }
 
}

