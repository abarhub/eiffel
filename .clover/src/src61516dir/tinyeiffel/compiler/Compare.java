/* $$ This file has been instrumented by Clover 1.3.9#20050811161021793 $$ *//*
 * Created on 21 d\u00e9c. 2003
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package tinyeiffel.compiler;

/**
 * @author BARRET
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public interface Compare {

	public boolean infStrict(Compare elt);
	public boolean infEgal(Compare elt);
	public boolean supStrict(Compare elt);
	public boolean supEgal(Compare elt);
	public boolean egal(Compare elt);
	public boolean diff(Compare elt);

}
