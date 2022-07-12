/**
 * SchemaDecimal.java
 *
 * This file was generated by XMLSpy 2005 Enterprise Edition.
 *
 * YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
 * OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION.
 *
 * Refer to the XMLSpy Documentation for further details.
 * http://www.altova.com/xmlspy
 */


package com.altova.types;

import java.math.BigDecimal;
import java.math.BigInteger;

public class SchemaDecimal implements SchemaTypeNumber {
  protected BigDecimal value;
  protected boolean isempty;
  protected boolean isnull;

  // construction
  public SchemaDecimal() {
    setEmpty();
  }

  public SchemaDecimal(SchemaDecimal newvalue ) {
    value = newvalue.value;
    isempty = newvalue.isempty;
    isnull = newvalue.isnull;
  }

  public SchemaDecimal(BigDecimal newvalue) {
    setValue(newvalue);
  }

  public SchemaDecimal(double newvalue) {
    setValue( newvalue );
  }

  public SchemaDecimal(String newvalue) {
    parse(newvalue);
  }

  public SchemaDecimal(SchemaType newvalue) {
    assign( newvalue );
  }

  public SchemaDecimal(SchemaTypeNumber newvalue) {
    assign( (SchemaType)newvalue );
  }

  // setValue, getValue
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal newvalue) {
    if( newvalue == null )
      setNull();
    else {
      value = newvalue;
      isempty = false;
      isnull = false;
    }
  }

  public void setValue(double newvalue) {
    value = new BigDecimal(newvalue);
    isempty = false;
    isnull = false;
  }

  public void parse(String newvalue) {
    if( newvalue == null )
      setNull();
    else if( newvalue == "" )
      setEmpty();
    else {
      try {
        value = new BigDecimal(newvalue);
      }
      catch (NumberFormatException e) {
        throw new StringParseException(e);
      }
    }
  }

  public void assign(SchemaType newvalue) {
    if( newvalue == null || newvalue.isNull() )
      setNull();
    else if( newvalue.isEmpty() )
      setEmpty();
    else if(newvalue instanceof SchemaTypeNumber) {
      value = ((SchemaTypeNumber)newvalue).bigDecimalValue();
      isempty = false;
      isnull = false;
    }
    else
      throw new TypesIncompatibleException( newvalue, this );
  }

  public void setNull() {
    isnull = true;
    isempty = true;
    value = BigDecimal.valueOf( 0 );
  }

  public void setEmpty() {
    isnull = false;
    isempty = true;
    value = BigDecimal.valueOf( 0 );
  }

  // further
  public int hashCode() {
    return value.hashCode();
  }

  public boolean equals(Object obj) {
    if (! (obj instanceof SchemaDecimal))
      return false;
    if (value.compareTo( ( (SchemaDecimal) obj).value) == 0)
      return true;
    return false;
  }

  public Object clone() {
    return new SchemaDecimal(this);
  }

  public String toString() {
    if( isempty || isnull )
      return "";
    String result = value.toString();
	int decimalpos= result.indexOf('.');

    if( result.length() <= 0 || decimalpos <= 0 )
      return result;

	// remove trailing "0"s after comma
    int nPos = result.length();
    for( nPos = result.length() - 1; 
      nPos > decimalpos   &&  result.charAt( nPos ) == '0'; 
	nPos-- ) {
    }

	if( result.charAt( nPos ) == '.' )
		nPos--;

	return result.substring( 0, nPos+1 );
  }

  public int length() {
    return toString().length();
  }

  public boolean booleanValue() {
    return value.compareTo(new BigDecimal(0)) != 0;
  }

  public boolean isEmpty() {
    return isempty;
  }

  public boolean isNull() {
    return isnull;
  }

  public int compareTo(Object obj) {
    return compareTo( (SchemaDecimal) obj);
  }

  public int compareTo(SchemaDecimal obj) {
    return value.compareTo(obj.value);
  }

  public void reduceScale() {
    if( value.scale() <= 0 )
      return;
    String sScaled = value.toString();
    int nPos = sScaled.length()-1;
    int nReduceScale = 0;
    while( nPos >= 0  &&  sScaled.substring(nPos, nPos+1).equals("0") ) {
      nPos--;
      nReduceScale++;
    }
    value = value.setScale( value.scale() - nReduceScale );
  }

  // interface SchemaTypeNumber
  public int numericType() {
    return NUMERIC_VALUE_BIGDECIMAL;
  }

  public int intValue() {
    return value.intValue();
  }

  public long longValue() {
    return value.longValue();
  }

  public BigInteger bigIntegerValue() {
    return value.toBigInteger();
  }

  public float floatValue() {
    return value.floatValue();
  }

  public double doubleValue() {
    return value.doubleValue();
  }

  public BigDecimal bigDecimalValue() {
    return value;
  }
}
